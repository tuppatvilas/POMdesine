package TestLayer1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageLayer1.AddCustomer;
import PageLayer1.HomePage;
import PageLayer1.ManagerPage;

public class AddNewCstmr {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		HomePage home_obj = new HomePage(driver);
		ManagerPage mngpage_obj = new ManagerPage(driver);
		AddCustomer addnewcst = new AddCustomer(driver);
		home_obj.clickonBankMngrloginbutton();
		mngpage_obj.clickonaddcustomerbutton();
		Thread.sleep(3000);
		addnewcst.enterfirstname("harry");
		addnewcst.enterlastname("jems");
		addnewcst.enterpostcode("441601");
	}

}