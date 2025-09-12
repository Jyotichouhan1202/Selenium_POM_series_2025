package Com.qa.openkart.pages;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import Com.qa.openkart.exceptions.BrowserException;
import Com.qa.openkart.utility.ElementUtility;

public class LoginPage {
	
	//1. Initialize driver: (Always private)
	private WebDriver driver;
    private ElementUtility eleUtil;
    
    //2. Locators: (Always private)
    private By email= By.xpath("//*[@id=\"Email\"]");
    private By password= By.xpath("//*[@id=\"Password\"]");
    private By Remember_me= By.xpath("//*[@id=\"RememberMe\"]");
    private By Log_in= By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button");
    private By Text= By.xpath("//*[@id=\"main\"]/div/div/div/div[1]/h1");
    
    //3. Constructor: (Always public)
    public LoginPage(WebDriver driver) {
    this.driver= driver;
    eleUtil= new ElementUtility(driver);
    }
    
    //4. Methods/Functions:
    
        public String getloginpageurl(){
    	return driver.getCurrentUrl();
    	}
        
        public String getloginpagetitle() {
        return driver.getTitle();	
        }
        
        public void rememberme() throws InterruptedException {
        driver.findElement(Remember_me).click();
        Thread.sleep(2000);	
        }
        	
        public void textdisplayed() {
        driver.findElement(Text).isDisplayed();
        }
    	
    	public String dologin(String Email, String Password) throws InterruptedException {
    	driver.findElement(email).clear();
    	Thread.sleep(2000);
    	driver.findElement(email).sendKeys(Email);
    	Thread.sleep(2000);
    	driver.findElement(password).clear();
    	Thread.sleep(2000);
    	driver.findElement(password).sendKeys(Password);
    	Thread.sleep(2000);
    	driver.findElement(Log_in).click();
    	Thread.sleep(2000);
    	String HomePageTitle= driver.getTitle();
    	return HomePageTitle;
    	} 
    	 	
}
