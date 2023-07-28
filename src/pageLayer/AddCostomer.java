package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddCostomer {
	
     private	WebElement firstname_textbx;
     private	WebElement lastname_textbx;
     private	WebElement postcode_textbx;
     private	WebElement addcustomer_btn;
     private   WebDriver driver;
    public AddCostomer (WebDriver driver)
    {
    	this.driver = driver;
    	firstname_textbx=driver.findElement(By.xpath("(//input[contains(@class,'form-control ng-pristine ng-')])[1]"));
    	lastname_textbx=driver.findElement(By.xpath("(//input[contains(@class,'form-control ng-pristine ng-')])[2]"));
    	postcode_textbx=driver.findElement(By.xpath("(//input[contains(@class,'form-control ng-pristine ng-')])[3]"));
    	addcustomer_btn=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
    }
    public void enterfirstname(String firstname)
    {
    	firstname_textbx.sendKeys(firstname);
    }
    public void enterlastname(String lastname)
    {
    	lastname_textbx.sendKeys(lastname);
    }
    public void entercode(String postcode)
    {
    	postcode_textbx.sendKeys(postcode);
    }
    public void clickaddbutton()
    {
    	addcustomer_btn.click();
    }
  public void clickonalerttopup()
  {
	 driver.switchTo().alert().accept(); 
  }
    
    


}
