package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveCartpage 
{
	@FindBy(xpath="//span[@class='img']")
	private WebElement cart;
	@FindBy(xpath="//a[@title='Delete From Shopping List']")
	private WebElement removecart;
	
	
	public RemoveCartpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	public void cartbtn()
	{
		cart.click();
	}
	public void removeCartbtn()
	{
		removecart.click();
	}

}
