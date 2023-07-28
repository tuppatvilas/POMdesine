package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private WebElement bank_manager_login_button;
	
	public HomePage(WebDriver driver)
	{
		bank_manager_login_button = driver.findElement(By.xpath("//button[text()='Bank Manager Login']"));
	}
	public void clickonBankMngrloginbutton()
	{
		bank_manager_login_button.click();
	}
	

}
