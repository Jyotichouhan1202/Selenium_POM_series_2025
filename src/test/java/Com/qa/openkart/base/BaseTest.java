package Com.qa.openkart.base;

import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import Com.qa.openkart.factory.DriverFactory;
import Com.qa.openkart.pages.AmazonHomePage;
import Com.qa.openkart.pages.HomePage;
import Com.qa.openkart.pages.LoginPage;


public class BaseTest {

	protected WebDriver driver;
    protected DriverFactory df;
    protected LoginPage loginpage;
    protected HomePage homepage;
    protected Properties prop;
    protected AmazonHomePage amazonhomepage;
	 
    
    @BeforeTest
    public void setup() {
    df = new DriverFactory();
    prop= df.initProp();
    driver= df.initBrowser(prop);
    loginpage = new LoginPage(driver);
    homepage = new HomePage(driver);
    amazonhomepage= new AmazonHomePage(driver);
    }
    
    /**@AfterTest
    public void teardown() {
    driver.quit(); or driver.close();
    }
	**/		
  }
