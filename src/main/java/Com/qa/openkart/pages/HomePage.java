package Com.qa.openkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import Com.qa.openkart.exceptions.BrowserException;
import Com.qa.openkart.utility.ElementUtility;

public class HomePage{
	
	//1. Initialize driver:
	private WebDriver driver;
	private ElementUtility eleUtil;
	
	//2. Locators:
	private By Catalog= By.xpath("/html/body/div[3]/aside/div/nav/ul/li[2]/a/p");
	private By Products= By.xpath("/html/body/div[3]/aside/div/nav/ul/li[2]/ul/li[1]/a/p");
	private By Categories= By.xpath("/html/body/div[3]/aside/div/nav/ul/li[2]/ul/li[2]/a/p");
	private By Manufacturers= By.xpath("/html/body/div[3]/aside/div/nav/ul/li[2]/ul/li[3]/a/p");
	private By Product_reviews= By.xpath("/html/body/div[3]/aside/div/nav/ul/li[2]/ul/li[4]/a/p");
	private By Product_tags= By.xpath("/html/body/div[3]/aside/div/nav/ul/li[2]/ul/li[5]/a/p");
	private By Attributes= By.xpath("/html/body/div[3]/aside/div/nav/ul/li[2]/ul/li[6]/a/p");
			
	private By Sales= By.xpath("/html/body/div[3]/aside/div/nav/ul/li[3]/a/p");
	private By Orders= By.xpath("/html/body/div[3]/aside/div/nav/ul/li[3]/ul/li[1]/a/p");
	private By Shipments= By.xpath("/html/body/div[3]/aside/div/nav/ul/li[3]/ul/li[2]/a/p");
	private By Return_request= By.xpath("/html/body/div[3]/aside/div/nav/ul/li[3]/ul/li[3]/a/p");
	private By Recurring_payments= By.xpath("/html/body/div[3]/aside/div/nav/ul/li[3]/ul/li[4]/a/p");
	private By Gift_cards= By.xpath("/html/body/div[3]/aside/div/nav/ul/li[3]/ul/li[5]/a/p");
	private By shopping_carts_and_wishlists= By.xpath("/html/body/div[3]/aside/div/nav/ul/li[3]/ul/li[6]/a/p");
	
	private By Customers= By.xpath("/html/body/div[3]/aside/div/nav/ul/li[4]/a/p");
	private By Promotion= By.xpath("/html/body/div[3]/aside/div/nav/ul/li[5]/a/p");
	private By Content_Management= By.xpath("/html/body/div[3]/aside/div/nav/ul/li[6]/a/p");
	private By Configuration= By.xpath("/html/body/div[3]/aside/div/nav/ul/li[7]/a/p");
	private By System= By.xpath("/html/body/div[3]/aside/div/nav/ul/li[8]/a/p");
	private By Reports= By.xpath("/html/body/div[3]/aside/div/nav/ul/li[9]/a/p");
	private By Help= By.xpath("/html/body/div[3]/aside/div/nav/ul/li[10]/a/p");
	
	private By Promotions= By.xpath("/html/body/div[3]/aside/div/nav/ul/li[5]/a/p");
	private By Discounts= By.xpath("/html/body/div[3]/aside/div/nav/ul/li[5]/ul/li[1]/a/p");
    private By Affiliates= By.xpath("/html/body/div[3]/aside/div/nav/ul/li[5]/ul/li[2]/a/p");
	private By Newsletter_subscribers= By.xpath("/html/body/div[3]/aside/div/nav/ul/li[5]/ul/li[3]/a/p");
	private By Campaigns= By.xpath("/html/body/div[3]/aside/div/nav/ul/li[5]/ul/li[4]/a/p");

	
    //3. Constructor:
    public HomePage(WebDriver driver){
    this.driver= driver;
    eleUtil= new ElementUtility(driver);
    }
   
    //4. Methods/Functions:
    	
    	public String Catalogue1Homepage() throws InterruptedException {
   		driver.findElement(Catalog).click();
   		Thread.sleep(2000);
   		driver.findElement(Products).click();
   		Thread.sleep(2000);
    	String Productstitle= driver.getCurrentUrl();
    	return Productstitle;
    	}
    		
    	public String Catalogue2Homepage() throws InterruptedException {
       	driver.findElement(Categories).click();
       	Thread.sleep(2000);
       	String Categoriestitle= driver.getCurrentUrl();
        return Categoriestitle;
    	}
    	
    	public String Catalogue3Homepage() throws InterruptedException {
       	driver.findElement(Manufacturers).click();
       	Thread.sleep(2000);
       	String Manufacturerstitle= driver.getCurrentUrl();
        return Manufacturerstitle;
    	}
    	
    	public String Catalogue4Homepage() throws InterruptedException {
        driver.findElement(Product_reviews).click();
       	Thread.sleep(2000);
       	String Productreviewstitle= driver.getCurrentUrl();
       	return Productreviewstitle;
        }
    	    	
    	public String Catalogue5Homepage() throws InterruptedException {
        driver.findElement(Product_tags).click();
       	Thread.sleep(2000);
       	String Producttagstitle= driver.getCurrentUrl();
       	return Producttagstitle;
        }
    	
    	public String Catalogue6Homepage() throws InterruptedException {
        driver.findElement(Attributes).click();
        Thread.sleep(2000);
        String Attributestitle= driver.getCurrentUrl();
        return Attributestitle;
        }
    	
    	public String Sales1Homepage() throws InterruptedException {
       	driver.findElement(Sales).click();
       	Thread.sleep(2000);
       	driver.findElement(Orders).click();
       	Thread.sleep(2000);
        String Orderstitle= driver.getCurrentUrl();
        return Orderstitle;
        }
    	
    	public String Sales2Homepage() throws InterruptedException {
       	driver.findElement(Shipments).click();
        Thread.sleep(2000);
        String Shipmentsstitle= driver.getCurrentUrl();
        return Shipmentsstitle;
        }
    	   	
    	public String Sales3Homepage() throws InterruptedException {
      	driver.findElement(Return_request).click();
        Thread.sleep(2000);
        String Returnrequesttitle= driver.getCurrentUrl();
        return Returnrequesttitle;
        }
    	
    	public String Sales4Homepage() throws InterruptedException {
        driver.findElement(Recurring_payments).click();
        Thread.sleep(2000);
        String Recurringpaymentsttitle= driver.getCurrentUrl();
        return Recurringpaymentsttitle;
        }
    	
    	public String Sales5Homepage() throws InterruptedException {
        driver.findElement(Gift_cards).click();
        Thread.sleep(2000);
        String Giftcardsttitle= driver.getCurrentUrl();
        return Giftcardsttitle;
        }
    	
    	public String Sales6Homepage() throws InterruptedException {
        driver.findElement(shopping_carts_and_wishlists).click();
        Thread.sleep(2000);
        String shoppingcartsandwishliststtitle= driver.getCurrentUrl();
        return shoppingcartsandwishliststtitle;
        }
    	
    	public String Customers1Homepage() throws InterruptedException {
       	driver.findElement(Customers).click();
       	Thread.sleep(2000);
       	driver.findElement(Promotion).click();
       	Thread.sleep(2000);
        String Promotiontitle= driver.getCurrentUrl();
        return Promotiontitle;
        }
    	
    	public String Customers2Homepage() throws InterruptedException {
      	driver.findElement(Content_Management).click();
       	Thread.sleep(2000);
        String ContentManagementtitle= driver.getCurrentUrl();
        return ContentManagementtitle;
        }
    	
    	public String Customers3Homepage() throws InterruptedException {
       	driver.findElement(Configuration).click();
      	Thread.sleep(2000);
        String Configurationtitle= driver.getCurrentUrl();
        return Configurationtitle;
        }
    	
    	public String Customers4Homepage() throws InterruptedException {
        driver.findElement(System).click();
        Thread.sleep(2000);
        String Systemtitle= driver.getCurrentUrl();
        return Systemtitle;
        }
    	
    	public String Customers5Homepage() throws InterruptedException {
        driver.findElement(Reports).click();
        Thread.sleep(2000);
        String Reportstitle= driver.getCurrentUrl();
        return Reportstitle;
        }
    	
    	public String Customers6Homepage() throws InterruptedException {
        driver.findElement(Help).click();
        Thread.sleep(2000);
        String Helptitle= driver.getCurrentUrl();
        return Helptitle;
        }
    	
    	public String Promotions1Homepage() throws InterruptedException {
        driver.findElement(Promotions).click();
        Thread.sleep(2000);
        driver.findElement(Discounts).click();
        Thread.sleep(2000);
        String Discountstitle= driver.getCurrentUrl();
        return Discountstitle;
        }
    	
    	public String Promotions2Homepage() throws InterruptedException {
        driver.findElement(Affiliates).clear();
        Thread.sleep(2000);
        String Affiliatestitle= driver.getCurrentUrl();
        return Affiliatestitle;
        }
    	
    	public String Promotions3Homepage() throws InterruptedException {
        driver.findElement(Newsletter_subscribers).click();
        Thread.sleep(2000);
        String Newslettersubscriberstitle= driver.getCurrentUrl();
        return Newslettersubscriberstitle;
        }
    	
    	public String Promotions4Homepage() throws InterruptedException {
        driver.findElement(Campaigns).click();
        Thread.sleep(2000);
        String Campaignstitle= driver.getCurrentUrl();
        return Campaignstitle;
    	}
    	
}

