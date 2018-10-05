package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddWishlistpage 
{
	@FindBy(xpath="//img[@id='wimage1']")
	private WebElement addwishlist;
	@FindBy(xpath="//a[text()='Wishlist']")
	private WebElement checkwishlist;
	
	
	public AddWishlistpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	public void addwishlistbtn()
	{
		addwishlist.click();
	}
	public void checkwishlistbtn()
	{
		checkwishlist.click();
	}


}
