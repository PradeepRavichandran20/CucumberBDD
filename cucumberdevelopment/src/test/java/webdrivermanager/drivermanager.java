package webdrivermanager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ConstansPackage.constants;
import io.github.bonigarcia.wdm.WebDriverManager;

public class drivermanager {
	
	private static final Logger logger = LogManager.getLogger(drivermanager.class);
	
	private static WebDriver driver =null;
	
	public static void launchbrowser() {
		// TODO Auto-generated method stub
		
		try {
			switch (constants.BROWSER) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				logger.info("Launching" + constants.BROWSER);
				driver = new ChromeDriver();
				break;
			
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				logger.info("Launching" + constants.BROWSER);
				driver = new FirefoxDriver();
				
			case "edge":
				WebDriverManager.edgedriver().setup();
				logger.info("Launching" + constants.BROWSER);
				driver = new EdgeDriver();

			default:
				WebDriverManager.chromedriver().setup();
				logger.info("Launching" + constants.BROWSER);
				driver = new ChromeDriver();
				break;
			}
		
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

}

	public static WebDriver getDriver() {
		return driver;
	}
}