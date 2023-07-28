package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OpenAccount {
	
	private WebElement customer_selectbx;
	private WebElement currency_selectbx;
	private WebElement prosses_butn;
	private WebDriver driver;
	public OpenAccount(WebDriver driver)
	{
		this.driver = driver;
		customer_selectbx =driver.findElement(By.xpath("//select[@id='userSelect']"));
		currency_selectbx =driver.findElement(By.xpath("//select[@id='currency']"));
		prosses_butn =driver.findElement(By.xpath("//button[text()='Process']"));
	}
	
	public void userselect(String customer)
	{
		customer_selectbx.click();
		Select user =new Select(customer_selectbx);
		user.selectByVisibleText(customer);
	}
	public void currencyselect(String many)
	{
		currency_selectbx.click();
		Select  currency = new Select(currency_selectbx);
		currency.selectByVisibleText(many);
	}
	public void clickonprosses()
	{
		prosses_butn.click();
	}
	public void clickonalerttopup()
	{
		driver.switchTo().alert().accept();
	}
	
}
