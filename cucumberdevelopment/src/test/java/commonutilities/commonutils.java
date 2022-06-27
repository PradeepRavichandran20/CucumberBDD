package commonutilities;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import ConstansPackage.constants;
import pageobjects.directorypage;
import pageobjects.homepage;
import pageobjects.loginpage;
import webdrivermanager.drivermanager;

public class commonutils {

	//config file loader
	public void loadProperties() {
		
		//object creation :
		Properties properties = new Properties();
		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
			
		constants.APP_URL = properties.getProperty("APP_URL");
		constants.BROWSER = properties.getProperty("BROWSER");
		constants.UserName = properties.getProperty("UserName");
		constants.Password = properties.getProperty("Password");
		constants.FIREFOX_DRIVER_LOCATION = properties.getProperty("FIREFOX_DRIVER_LOCATION");
		constants.CHROME_DRIVER_LOCATION = properties.getProperty("CHROME_DRIVER_LOCATION");
		constants.EDGE_DRIVER_LOCATION = properties.getProperty("EDGE_DRIVER_LOCATION");
		
	}
	
	public void initWebElements () {
		
		PageFactory.initElements(drivermanager.getDriver(), loginpage.getinstance());
		PageFactory.initElements(drivermanager.getDriver(), homepage.getinstance());
		PageFactory.initElements(drivermanager.getDriver(), directorypage.getinstance());
	}
}
