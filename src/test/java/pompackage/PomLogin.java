package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseHRMClass;

public class PomLogin extends BaseHRMClass {

	
	
	@FindBy(name = "username") WebElement Username;
	@FindBy(name = "password") WebElement Password;
	@FindBy(className = "oxd-button oxd-button--medium oxd-button--main orangehrm-login-button") WebElement LoginBtn;
	
	
	public PomLogin() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void typeusername(String name){
		
		Username.sendKeys(name);
	}
	public void typepassword(String pass){
		
		Username.sendKeys(pass);
	}

	public void clickbtn(){
		
		LoginBtn.click();

}
	public String verify() {
		return driver.getTitle();
		
	}

}
