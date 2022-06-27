package stepdefinitions;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import commonutilities.commonutils;
import io.cucumber.java.Before;
import webdrivermanager.drivermanager;

public class commondefinition {
	
	
	//launch browser
		
	private static final Logger logger = LogManager.getLogger(commondefinition.class);
	
	@Before
	public void beforeScenario() {
		logger.info("Execution Started");
		
		try {
			
			//object_creation
			logger.info("Instantiating the commonutils");
			commonutils commonutils = new commonutils();
			logger.info("Initiating the property file");
			commonutils.loadProperties();
			logger.info("Checking the driver is NULL or NOT");
			
			if(drivermanager.getDriver()==null) {
				logger.info("Driver is initiating");
				drivermanager.launchbrowser();
				commonutils.initWebElements();
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

		
	}
	

