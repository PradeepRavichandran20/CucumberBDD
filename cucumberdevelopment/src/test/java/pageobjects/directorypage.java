package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class directorypage {
	
	
	private static directorypage directorypageinstance;
	
	private directorypage() {
		
	}
	
	public static directorypage getinstance(){
		if(directorypageinstance==null) {
			directorypageinstance = new directorypage();
		}	
		return directorypageinstance;
		
	}

	
	@FindBy(id ="searchDirectory_job_title")
	private WebElement JOB_TITLE;
	
	@FindBy(id = "searchBtn")
	private WebElement SEARCH;
	
	@FindBy(xpath = "//ul/li/b")
	private WebElement NAME;

	/*public WebElement getJOB_TITLE() {
		return JOB_TITLE;
	}

	public WebElement getSEARCH() {
		return SEARCH;
	}

	public WebElement getNAME() {
		return NAME;
	}*/
	
	public void selectjobtitle(String jobtitle) {
		
		Select select = new Select(JOB_TITLE);
		select.selectByVisibleText(jobtitle);
	
	}
	
	public void clicksearch() {
		
		SEARCH.click();
	}
	
	
	public String getpersonname() {
		
		return NAME.getText();
	}
	
	
	
	
	
	

	
}
