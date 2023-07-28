package PageLayer1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomer {
	
	public AddCustomer(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[contains(@class,'form-control ng')])[1]")
	WebElement firstname_textbx;
	
	@FindBy(xpath="(//input[contains(@class,'form-control ng')])[2]")
	WebElement laststname_textbx;
	
	@FindBy(xpath="(//input[contains(@class,'form-control ng')])[3]")
	WebElement postcode_textbx;
	
	public void enterfirstname(String name)
	{
		firstname_textbx.sendKeys(name);
	}
	public void enterlastname(String lname)
	{
		laststname_textbx.sendKeys(lname);
	}
	public void enterpostcode(String code)
	{
		postcode_textbx.sendKeys(code);
	}
	
	
	
}
