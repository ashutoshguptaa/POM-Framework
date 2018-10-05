package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(xpath="//input[@placeholder='Search from millions of products']")
	private WebElement search;
	
	@FindBy(id="search-icon")
	private WebElement searchbtn;
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void searchtb(String name)
	{
		search.sendKeys(name);
	}
	
	public void searchbtn()
	{
		searchbtn.click();
	}
}