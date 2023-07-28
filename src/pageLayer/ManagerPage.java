package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManagerPage 
{
		WebElement add_customer_btn;// = driver.findElement(By.xpath(""));
		WebElement add_account_btn ;//=driver.findElement(By.xpath(""));
		WebElement customers_btn ;//=driver.findElement(By.xpath(""));
		public ManagerPage(WebDriver driver)
	{
			add_customer_btn =driver.findElement(By.xpath("//button[@class='btn btn-lg tab'][1]"));
			add_account_btn = driver.findElement(By.xpath("//button[@class='btn btn-lg tab'][2]"));
			customers_btn =driver.findElement(By.xpath("//button[@class='btn btn-lg tab'][3]"));
	}
		public void clickonaddcustorebtn()
		{
			add_customer_btn.click();
		}
		public void clickonaddaccbtn()
		{
			add_account_btn.click();
		}
		public void clickonCostomerbtn()
		{
			customers_btn.click();
		}


}
