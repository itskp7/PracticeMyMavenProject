package tests;

import org.apache.log4j.Logger;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenerateLogs {

	public static void main(String[] args) {
		
		Logger log = Logger.getLogger(GenerateLogs.class);
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		log.info("launching browser");
		
		driver.get("http://www.google.com");
		log.info("google url has been launched");
		
		String title = driver.getTitle();
		System.out.println("the title is:" +title);
		
		log.info("the title is:" +title);
		
		if(title.equals("Google")) {
			System.out.println("the correct title is Google");
			log.info("the correct title is Google and the test case is passed");
		}else {
			System.out.println("the correct title is not Google");
			log.info("the correct title is not google and the test case is failed");
		}
		
		
		
		

	}

}
