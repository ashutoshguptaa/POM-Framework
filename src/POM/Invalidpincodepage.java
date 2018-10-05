package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Invalidpincodepage
{
	@FindBy(id="zipCode")
	private WebElement zipcode;
	@FindBy(id="zipCheckSubmit")
	private WebElement zipsubmit;
	
	public Invalidpincodepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	public void enterzipcode()
	{
		zipcode.sendKeys("5686522828");;
	}
	public void zipsubmitbtn()
	{
		zipsubmit.click();
	}
   
}
