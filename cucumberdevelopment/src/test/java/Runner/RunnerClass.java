package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources",
		glue = "stepdefinitions",
		dryRun = false,
		monochrome = true
		)

public class RunnerClass {

	//System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
	
	//TestingGITCommit
}
