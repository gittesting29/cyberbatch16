package day13.methodexamples;

public class MainOverloading {

		public static void main() {
			System.out.println("zero-param main");
		}
		public static void main(int i) {
			System.out.println("int-param main");
		}
		public static void main(double d,int a) {
			System.out.println("double-int-param main");
		}
		public static void main(String[] args) {
			System.out.println("main method started");
			System.out.println("***********************1************************\n");

			main();
			System.out.println("***********************1************************\n");

			main(10);
			System.out.println("***********************1************************\n");

			main(25.5, 15);
			System.out.println("***********************1************************\n");

			System.out.println("main method ends");
			System.out.println("***********************1************************\n");

			
		}


	}

