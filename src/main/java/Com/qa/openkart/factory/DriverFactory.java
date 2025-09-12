package Com.qa.openkart.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import Com.qa.openkart.errors.AppError;
import Com.qa.openkart.exceptions.BrowserException;

public class DriverFactory {
	
    WebDriver driver;
    Properties prop; //Create Object
	
	public WebDriver initBrowser(Properties prop) {
	String browser= prop.getProperty("browser");
	System.out.println("browser name"+ browser);
		
		switch(browser) {
		case "Chrome": 
			driver = new ChromeDriver();
			System.out.println(AppError.CHROME_LAUNCH+ browser);
			break;

		case "Firefox": 
			driver = new FirefoxDriver();
			System.out.println(AppError.FIREFOX_LAUNCH+ browser);
			break;
			
		case "Safari": 
			driver = new SafariDriver();
			System.out.println(AppError.SAFARI_LAUNCH+ browser);
			break;
			
		case "Edge": 
			driver = new EdgeDriver();
			System.out.println(AppError.EDGE_LAUNCH+ browser);
			break;
			
		default:
		System.out.println("---INVALID BROWSER NAME---");
		//Exception-1  & no need to use break when we throw exception.
		throw new BrowserException("===INVALID BROWSER NAME===");
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	    //driver.get("https://admin-demo.nopcommerce.com/login"); //Login Link
	    //driver.get(prop.getProperty("url"));
		driver.get(prop.getProperty("urlA"));// Amazon Home Page
		//driver.get("https://admin-demo.nopcommerce.com/admin"); //Dashboard Link
		
		return driver;
	    }	
	 
	    // Method to access key from config file-
	    public Properties initProp() {
	    prop= new Properties(); //Initialize Object
	    try {
			FileInputStream ip= new FileInputStream("./src/test/resource/config/Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	    return prop;
		}
	
	
/**	    For Future Reference:-
	
		public void deletecookies() {
    	driver.manage().deleteAllCookies();
		}
		
		public void maximizepage() {
		driver.manage().window().maximize();
		}
		
		public void minimizepage() {
		driver.manage().window().minimize();
		}
	
		public WebDriver geturl() {
		driver.get("URL");
    	return driver;
		}
**/	
	    
}
