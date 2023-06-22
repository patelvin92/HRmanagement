package testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseHRMClass;
import pompackage.PomLogin;

public class LoginTest extends BaseHRMClass{
PomLogin Log;
	
	public LoginTest() {
		
		super();
	}
	
	@BeforeMethod
	
	public void intiatesetup() {
		
		initiate();
		
		Log = new PomLogin();
	}

	private void initiate() {
		// TODO Auto-generated method stub
		
		
	}
	
	@Test
	public void Title() {
		
		String actual = Log.verify();
		org.testng.Assert.assertEquals(actual,"OrangeHRM");
		
	}
	
	@AfterMethod
	
	public void close() {
		
		driver.close();
	}
	
	
}
