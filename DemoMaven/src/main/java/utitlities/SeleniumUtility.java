package utitlities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumUtility 
{
	public static WebDriver driver;
	public static WebDriverWait wait;
	protected Properties properties;
	protected Actions action;
	protected FileInputStream fis;
	protected static String filePath;
	/* static method to call before main , and set property file(data) path and open
	 * desired browser
	 */	
	static 
	{
		filePath=System.setProperty("user.dir", "\\src\\test\\resources\\testData\\testAppData.properties");
	}
		//setup method
	public WebDriver setUp(String browserName, String webUrl)
	{
		properties =new Properties();
		try
		{
			fis=new FileInputStream(filePath);
			properties.load(fis);				
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait=new WebDriverWait(driver,20);
		driver.get(webUrl);
		action= new Actions(driver);
		return driver;
	}
	
	//get values from property file
	public String getValuesFromPropertyFile(String key)
	{
		return properties.getProperty(key);
	}
	
	//to get driver
	public static WebDriver getDriver()
	{
		return driver;
	}

	//identify web element and send keys
	public void typeInput(WebElement element, String input)
	{
		waitForElementToBeClickable(element);	//method definition below this code
		element.clear();
		element.sendKeys(input);
	}
	
	//Method to wait for an element till it's not display .
	private void waitForElementToBeClickable(WebElement element) 
	{
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	//to click on element
	public void clickOnElement(WebElement element)
	{
		waitForElementToBeClickable(element);
		element.click();
	}
	
	//to perform mouse over operation
	public void performMouseOverOperation(WebElement element)
	{
		action.moveToElement(element).perform();
	}
	
	//for right click
	public void performRightClickOperation(WebElement element)
	{
		action.moveToElement(element).contextClick().perform();		
	}
	
	//drag and drop
	public void performDragAndDrop(WebElement source, WebElement target)
	{
		action.dragAndDrop(source, target).build().perform();
	}
	
	//for page screenshot
	public void takeScreenShotOfThePage(String location)
	{
		// downcast the object to take screenshot
		TakesScreenshot  ts=(TakesScreenshot )driver;
		//capture screen shot as output file
		File file= ts.getScreenshotAs(OutputType.FILE);
		try
		{
			//save screenshot in destination 
			FileUtils.copyFile(file, new File(location));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	//get required value from property file
	public String getRequiredAttributeValue(WebElement element, String attribute)
	{
		waitForElementDisplayed(element);
		setSleepTime(2000);							
		return element.getAttribute(attribute);
	}
	//setSleepTime()
	/**
	 * This is sleep method from java only use it when uttermost required
	 * 
	 * @param millis time in mili seconds
	 */
	protected void setSleepTime(long millis) 
	{
		try
		{
			Thread.sleep(millis);
		}
		catch(InterruptedException e)
		{
			
		}
	}
	//waitForElementDisplayed()
	private void waitForElementDisplayed(WebElement element) 
	{
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	//to get current page title
	public String getCurrentTitleOfApplication()
	{
		return driver.getTitle();
	}
	
	//current title 
	public String getCurrentUrlOfApplication()
	{
		return driver.getCurrentUrl();
	}
	
	//is element exist
	public boolean isElementExist(WebElement element)
	{
		waitForElementDisplayed(element);
		return element.isDisplayed();
	}
	
	//check box selected
	public boolean isCheckBoxSelected(WebElement element)
	{
		waitForElementDisplayed(element);
		return element.isSelected();
	}
	
	// utility to handle drop down list by visible text 
	public void handleHtmlDropdownListWithVisibleText(WebElement element, String visibileText)
	{
		waitForElementDisplayed(element);
		Select select = new Select(element);
		select.selectByVisibleText(visibileText);
	}
	
	// utility to handle drop down list by index
	public void handleHtmlDropdownListWithIndex(WebElement element, int index) 
	{
		waitForElementDisplayed(element);
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	//get drop down list size
	protected List<WebElement> getHtmlDropdownListSize(WebElement element) 
	{
		waitForElementDisplayed(element);
		Select select = new Select(element);
		return select.getOptions();
	}
	
	//get default value or first selected option from drop down list
	protected WebElement getFirstSelectedOptionFromHtmlDropdownList(WebElement element) 
	{
		waitForElementDisplayed(element);
		Select select = new Select(element);
		return select.getFirstSelectedOption();
	}
	
	//to get all selected options  
	protected List<WebElement> getAllSelectedOptionFromMultiSelectDropdownList(WebElement element) 
	{
		waitForElementDisplayed(element);
		Select select = new Select(element);
		return select.getAllSelectedOptions();
	}
	
	
	/**
	 * Utility to handle iframes
	 */
	protected void switchToIFrameWithWebElement(WebElement element) 
	{
		waitForElementDisplayed(element);
		driver.switchTo().frame(element);
	}
	/**
	 * Utility to handle iframes
	 */
	protected void switchToIFrameWithIndex(int index) 
	{
		driver.switchTo().frame(index);
	}

	/**
	 * Utility to handle iframes
	 */
	protected void switchFromIFrameToMainPage() 
	{
		driver.switchTo().defaultContent();
	}
	/**
	 * Method to refresh Page
	 */
	protected void refreshPage() 
	{
		driver.navigate().refresh();
	}
	
	public WebElement getActiveElementFromUI()
	{
		return driver.switchTo().activeElement();
	}

	public void cleanUp() {
		driver.close();
	}

}
