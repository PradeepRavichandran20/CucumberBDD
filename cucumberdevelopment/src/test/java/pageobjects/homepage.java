package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage {
	
	//Instance/variable creation
	private static homepage homepageinstance;
	
	//constructor (For not allowing to create the objects)
	private homepage() {
		
	}
	
	public static homepage getinstance() {
		if(homepageinstance==null) {
			homepageinstance = new homepage();
		}
		return homepageinstance;
		
	}
	
	
	@FindBy(linkText = "Directory")
	private WebElement DIRECTORY;

	/*public WebElement getDIRECTORY() {
		return DIRECTORY;
	}*/
	
	public void clickdirectory() {
		
		DIRECTORY.click();
	}

}
