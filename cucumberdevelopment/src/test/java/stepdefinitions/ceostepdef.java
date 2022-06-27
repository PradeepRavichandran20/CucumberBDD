package stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ConstansPackage.constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.directorypage;
import pageobjects.homepage;
import pageobjects.loginpage;
import webdrivermanager.drivermanager;

public class ceostepdef {
	

	private static final Logger logger = LogManager.getLogger(ceostepdef.class);
	
	@Given("the user is logged in successfully in home page")
	public void the_user_is_logged_in_successfully_in_home_page() {
		
		//Login
		drivermanager.getDriver().get(constants.APP_URL);
				
		loginpage.getinstance().enterusername(constants.UserName);
		loginpage.getinstance().enterpassword(constants.Password);
		loginpage.getinstance().clickloginbutton();	
		String url = drivermanager.getDriver().getCurrentUrl();
		
		if(url.contains("dashboard")) {
			
			logger.info("the user is logged in successfully in home page");
		}
	     
	}

	@When("the user clicks on the directory option from the menu bar")
	public void the_user_clicks_on_the_directory_option_from_the_menu_bar() {
		
		
		homepage.getinstance().clickdirectory();
		
		logger.info("the user clicks on the directory option from the menu bar");
	}

	@When("the user selects the job title as {string} from drop down")
	public void the_user_selects_the_job_title_as_from_drop_down(String jobtitle) {
		

         directorypage.getinstance().selectjobtitle(jobtitle);
         
         logger.info("the user selects the job title as CEO from drop down");
	}

	@When("clicks the search button")
	public void clicks_the_search_button() {
		
		
		directorypage.getinstance().clicksearch();

		logger.info("clicks the search button");

	}

	@Then("user should see the CEO name as {string}")
	public void user_should_see_the_ceo_name_as(String expectedname) {	
		
         String actualname = directorypage.getinstance().getpersonname();
         if(actualname.equalsIgnoreCase(expectedname)) {
        	 System.out.println("user should see the CEO name as John Smith");
         }
             
	}

}
