package Com.qa.openkart.utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ElementUtility {
	
	    WebDriver driver;
        Actions act;
        Alert alert;
	
        //Constructor-
	    public ElementUtility(WebDriver driver) {
		this.driver = driver;
	//	alert= new Alert(driver);
		}
		
	    //Methods-
		public WebElement getElement(By locator) {
		return driver.findElement(locator);
		}
		
		public void dosendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
		}
		
		public void doclick(By locator) {
		getElement(locator).click();
		}
		
		public void doclear(By locator) {
		getElement(locator).clear();
		}
		
		public void contentIsEnable() {
		driver.findElement(null).isEnabled();
		}
		
	    public void contentIsDisable() {
	    driver.findElement(null).isDisplayed();
		}
	    
	    public void backward() {
	    driver.navigate().back();
	    }
	    
	    public void forward() {
		driver.navigate().forward();
		}
	    
	    public void scrollup() {
	    act=new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).build().perform();
	    }
	    
	    public void scrolldown() {
	    act=new Actions(driver);
	    act.sendKeys(Keys.PAGE_DOWN).build().perform();
	    }
	    
	    public void alert() {
	    Alert alert= driver.switchTo().alert();
	    }
	    

//		public void dropdown(By level1, By level2, By level3, By level4) throws InterruptedException {
//		Actions act=new Actions(driver);
//		act.moveToElement(getElement(level1)).click();
//		act.moveToElement(getElement(level2)).perform();
//		act.moveToElement(getElement(level3)).perform();
//		Thread.sleep(1000);
//		getElement(level4).click();
//      doclick(level4);
	
	    }
