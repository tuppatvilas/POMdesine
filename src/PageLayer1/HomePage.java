package PageLayer1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	// obj repo
	@FindBy(xpath="//button[text()='Bank Manager Login']")
	private WebElement bank_manager_login_button;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-lg']")
	private WebElement costomer_login_button;
	
	public void clickonBankMngrloginbutton()
	{
		bank_manager_login_button.click();
	}
	public void clickoncustomerloginbutton()
	{
		costomer_login_button.click();
	}

}
