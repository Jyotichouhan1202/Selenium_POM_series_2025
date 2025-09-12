package Com.qa.openkart.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import Com.qa.openkart.base.BaseTest;


public class AmazonHomePageTest extends BaseTest{
	   WebDriver driver;
	
	   @Test (priority=1)
	   public void search1() throws InterruptedException{ 
	   amazonhomepage.search1();
	   }
	   
	   @Test (priority=2)
	   public void chocolates() throws InterruptedException{ 
	   amazonhomepage.Chocolates();
	   }
	   
	   @Test (priority=3)
	   public void search2() throws InterruptedException{ 
	   amazonhomepage.search2();
	   }

	   @Test (priority=4)
	   public void watches() throws InterruptedException{ 
	   amazonhomepage.watches();
	   }
	   
	   @Test (priority=5)
	   public void search3() throws InterruptedException{ 
       amazonhomepage.search3();
       }
	   
	   @Test (priority=6)
	   public void slingbags() throws InterruptedException{ 
	   amazonhomepage.slingbags();
	   }
	   	   
	   
	   @Test (priority=7)
	   public void addtocart() throws InterruptedException{ 
	   amazonhomepage.addtocart();
       }
	   
	   @Test (priority=8)
	   public void check() throws InterruptedException{ 
	   amazonhomepage.check();
       }
	   
	   @Test (priority=9)
	   public void proceedtopay() throws InterruptedException{ 
	   amazonhomepage.proceedtopay();
       }
	   
}