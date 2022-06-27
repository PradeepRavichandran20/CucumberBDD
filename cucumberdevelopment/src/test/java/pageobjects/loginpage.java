package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage {
	
	
	private static loginpage logininstance;
	
	//constructor
	private loginpage() {
		
	}
	
	public static loginpage getinstance() {
		
		if(logininstance==null) {
			logininstance = new loginpage();
		}		
		return logininstance;			
	}

	
	@FindBy(id="txtUsername")
	private WebElement USERNAME;
	
	@FindBy(id="txtPassword")
	private WebElement PASSWORD;
	
	@FindBy(id="btnLogin")
	private WebElement LOGIN_BUTTON;

	/*public WebElement getUSERNAME() {
		return USERNAME;
	}

	public WebElement getPASSWORD() {
		return PASSWORD;
	}

	public WebElement getLOGIN_BUTTON() {
		return LOGIN_BUTTON;
	}*/
	
	public void enterusername(String username) {
		USERNAME.sendKeys(username);
	}
	
	public void enterpassword(String password ) {
		PASSWORD.sendKeys(password);
	}
	
	public void clickloginbutton() {
		LOGIN_BUTTON.click();
	}

	
	
	
	
}
