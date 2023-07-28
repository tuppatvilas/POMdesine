package PageLayer1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagerPage {
	
	public ManagerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//obj repo
	@FindBy(xpath="//button[@class='btn btn-lg tab'][1]")
	private WebElement Add_customer;
	@FindBy(xpath="//button[@class='btn btn-lg tab'][2]")
	private WebElement open_account;
	@FindBy(xpath="//button[@class='btn btn-lg tab'][3]")
	private WebElement customers;
	
	public void clickonaddcustomerbutton()
	{
		Add_customer.click();
	}
	public void clickonopenaccountbutton()
	{
		open_account.click();
	}
	public void clickoncustomersbutton()
	{
		customers.click();
	}
	
	

}
