package BasePackage;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseHRMClass {

	static Properties prop=new Properties();
	protected static WebDriver driver;
	
	//step 1
	
	public BaseHRMClass() {
		
		try {
		
		FileInputStream File = new FileInputStream("C:\\Users\\VINIT\\eclipse-workspace\\HRmanagement\\src\\test\\java\\enivronmentvariables\\Config.properties");
		prop.load(File);
		}
		
		catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch (IOException a) {
			
			a.printStackTrace();
		}
		
	}
	
	//step 2
	
	public static void initiation() {
	String browsername= prop.getProperty("browser");
		
	if (browsername.equals("Chrome")) {
	
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	
	driver = new ChromeDriver();
	}
	
	else if (browsername.equals("Firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver = new FirefoxDriver();
	}
	//driver.manage().timeouts().setPageLoadTimeout(utility.TimeUtils.timepage, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(utility.TimeUtils.timepage, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	}
		
	}

