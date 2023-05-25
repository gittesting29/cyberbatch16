package testNGExample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import utitlities.SeleniumUtility;

public class GetScreenShot 
{

	public static void main(String[] args) 
	{
		SeleniumUtility s1= new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome","https://demo.vtiger.com/vtigercrm/index.php");
		
		String fileLocation=".\\screenshots\\vtiger_"+System.currentTimeMillis()+".jpg";
		getScreenshot(driver,fileLocation);
	}

	private static void getScreenshot(WebDriver driver, String filePath)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File(filePath));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
