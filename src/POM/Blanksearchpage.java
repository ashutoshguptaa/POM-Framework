package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Blanksearchpage {
	@FindBy(xpath="//input[@placeholder='Search from millions of products']")
	private WebElement search;
	
	@FindBy(id="search-icon")
	private WebElement searchbtn;
	
	public Blanksearchpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	public void searchbtn()
	{
		searchbtn.click();
	}
}