package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage {
	
	@FindBy(xpath="//input[@value='Add To Cart']")
	private WebElement addcart;
	
	public Cartpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	public void addcartbtn()
	{
		addcart.click();
	}
}
