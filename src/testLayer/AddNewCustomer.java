package testLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageLayer.AddCostomer;
import pageLayer.HomePage;
import pageLayer.ManagerPage;
import pageLayer.OpenAccount;

public class AddNewCustomer {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//-----------create obj of homepage class----------------
		HomePage home_obj = new HomePage(driver);
		Thread.sleep(3000);
		home_obj.clickonBankMngrloginbutton();
		
       //---creat obj of manager class------------------------------------------------
		ManagerPage m_page = new ManagerPage(driver);
              m_page.clickonaddaccbtn();
        OpenAccount  o_account = new OpenAccount(driver);
              o_account.userselect("Harry Potter");
              Thread.sleep(3000);
              o_account.currencyselect("Dollar");
              Thread.sleep(3000);
              o_account.clickonprosses();
              o_account.clickonalerttopup();
              
              
        //---creat obj of addcustomer page------------------------------------
        //AddCostomer  add_customer = new  AddCostomer(driver);
        //add_customer.enterfirstname("vilas");
       // add_customer.enterlastname("tuppat");
       // add_customer.entercode("401601");
        //add_customer.clickaddbutton();
        //Thread.sleep(3000);
        //add_customer.clickonalerttopup();
        //Thread.sleep(3000);
        
        
        
	}

}
