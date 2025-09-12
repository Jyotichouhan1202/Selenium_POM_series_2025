package Com.qa.openkart.test; 

import org.testng.Assert;
import org.testng.annotations.Test;
import Com.qa.openkart.base.BaseTest;
import Com.qa.openkart.constants.AppConstants;
import Com.qa.openkart.errors.AppError;
import Com.qa.openkart.pages.LoginPage;

public class LoginPageTest extends BaseTest{
	
	//1. Apply Methods:

	@Test //TC-001
	public void geturl() {
    String Acturl= loginpage.getloginpageurl();
   //System.out.println("URL of the page is: "+Acturl);
    System.out.println(AppError.URL_IS+Acturl);
  //Assert.assertEquals(Acturl, "https://admin-demo.nopcommerce.com/login");
    Assert.assertEquals(Acturl, AppConstants.LOGIN_PAGE_URL);
	}
	
	@Test //TC-002
	public void gettitle() {
    String Acttitle= loginpage.getloginpagetitle();
  //System.out.println("Title of the page is: "+Acttitle);
    System.out.println(AppError.TITLE_IS+Acttitle);
  //Assert.assertEquals(Acttitle, "nopCommerce demo store. Login");
    Assert.assertEquals(Acttitle, AppConstants.LOGIN_PAGE_TITLE);
	}
	
	@Test //TC-003
	public void remembermeloginpage() throws InterruptedException {
	loginpage.rememberme();
	}
	
	@Test //TC-004
	public void textdisplayedloginpage() throws InterruptedException {
	loginpage.textdisplayed();
	}
	
	@Test //TC-005
	public void validLogin() throws InterruptedException {	
	//loginpage.dologin("admin@yourstore.com", "admin");
	loginpage.dologin(prop.getProperty("email"), prop.getProperty("password"));
	}
	
}
	
