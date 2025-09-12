package Com.qa.openkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Com.qa.openkart.utility.ElementUtility;

public class AmazonHomePage {

	//1. Initialize driver:
	
		private WebDriver driver;
		private ElementUtility eleUtil;
		
	//2.Locators:
		
		private By Continue= By.xpath("/html/body/div/div[1]/div[3]/div/div/form/div/div/span/span/button");
		private By Searchbar= By.xpath("//*[@id=\"twotabsearchtextbox\"]");
		private By Search= By.xpath("//*[@id=\"nav-search-submit-button\"]");
		
		private By Addchoclatecart1= By.xpath("//*[@id=\"a-autoid-4-announce\"]");
		private By Addchoclatecart2= By.xpath("//*[@id=\"a-autoid-7-announce\"]");
		
		private By Addwatchcart1= By.xpath("//*[@id=\"a-autoid-9-announce\"]");
		private By Addwatchcart2= By.xpath("//*[@id=\"a-autoid-11-announce\"]");
		
        private By Addbagcart1= By.xpath("//*[@id=\"a-autoid-14-announce\"]");
        private By Addbagcart2= By.xpath("//*[@id=\"a-autoid-19-announce\"]");
                
		private By Cart= By.xpath("//*[@id=\"nav-cart-text-container\"]/span[2]");
		private By Click= By.xpath("//*[@id=\"gutterCartViewForm\"]/div/div[3]/div[1]/span/div/label/i");
		
		private By addchocolate1= By.xpath("");
		private By addchocolate2= By.xpath("");
		
		private By addwatch1= By.xpath("");
		private By addwatch2= By.xpath("");
		
		private By addbag1= By.xpath("");
		private By addbag2= By.xpath("");
	
		private By Proceedtopay= By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input");
       
		
	//3. Constructor:
         public AmazonHomePage(WebDriver driver){
         this.driver= driver;
         eleUtil= new ElementUtility(driver);
         }
    
    //4. Methods/Functions:
    
        public void search1() throws InterruptedException {
    	eleUtil.doclick(Continue);
    	eleUtil.doclick(Searchbar);
    	Thread.sleep(2000);
    	eleUtil.dosendkeys(Searchbar, "Chocolate");
    	Thread.sleep(2000);
    	eleUtil.doclick(Search);
    	Thread.sleep(2000);
        }
    	
        public void Chocolates() throws InterruptedException {
    	eleUtil.scrolldown();
    	eleUtil.doclick(Addchoclatecart1);
    	Thread.sleep(2000);
    	eleUtil.doclick(Addchoclatecart2);
    	Thread.sleep(2000);
    	eleUtil.backward();
    	Thread.sleep(2000);
        }
    
        public void search2() throws InterruptedException {
    	eleUtil.doclick(Searchbar);
    	Thread.sleep(2000);
    	eleUtil.doclear(Searchbar);
    	eleUtil.dosendkeys(Searchbar, "Watch for women");
    	Thread.sleep(2000);
    	eleUtil.doclick(Search);
    	Thread.sleep(2000);
        }
    
        public void watches() throws InterruptedException {
    	eleUtil.scrolldown();
    	eleUtil.doclick(Addwatchcart1);
    	Thread.sleep(2000);
    	eleUtil.doclick(Addwatchcart2);
    	Thread.sleep(2000);
    	eleUtil.backward();
    	Thread.sleep(2000);
        }
    
        public void search3() throws InterruptedException {
    	eleUtil.doclick(Searchbar);
    	Thread.sleep(2000);
    	eleUtil.doclear(Searchbar);
    	eleUtil.dosendkeys(Searchbar, "Sling bags for women");
    	Thread.sleep(2000);
    	eleUtil.doclick(Search);
    	Thread.sleep(2000);
        }
    
        public void slingbags() throws InterruptedException {
    	eleUtil.scrolldown();
    	Thread.sleep(2000);
    	eleUtil.doclick(Addbagcart1);
    	Thread.sleep(2000);
    	eleUtil.doclick(Addbagcart2);
    	Thread.sleep(2000);
        }
        
        public void addtocart() throws InterruptedException {
    	eleUtil.doclick(Cart);
    	Thread.sleep(2000);
    	eleUtil.doclick(Click);
    	Thread.sleep(2000);
        }
        
        public void check() throws InterruptedException {
        eleUtil.scrolldown();
        Thread.sleep(2000);
        eleUtil.doclick(addchocolate1);
        Thread.sleep(2000);
        eleUtil.doclick(addchocolate2);
        Thread.sleep(2000);
        eleUtil.doclick(addwatch1);
        Thread.sleep(2000);
        eleUtil.doclick(addwatch2);
        Thread.sleep(2000);
        eleUtil.doclick(addbag1);
        Thread.sleep(2000);
        eleUtil.doclick(addbag2);
        Thread.sleep(2000);
        }
        
        public void proceedtopay() throws InterruptedException {
        eleUtil.doclick(Proceedtopay);
    	Thread.sleep(2000);
        }
}
