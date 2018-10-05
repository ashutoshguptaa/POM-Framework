package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage {
	@FindBy(xpath="//a[@title='Samsung Galaxy Note 8 (64GB,Midnight Black)']")
	private WebElement product;
	
	public Productpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void productbtn()
	{
		product.click();	
	}
	
	
}