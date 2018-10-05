package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAdresspage
{
	@FindBy(xpath="//input[@value='BUY NOW']")
	private WebElement buynow;
	@FindBy(xpath="//input[@placeholder='Name']")
	private WebElement name;
	@FindBy(xpath="//input[@placeholder='Phone']")
	private WebElement phone;
	@FindBy(xpath="//textarea[@placeholder='Address']")
	private WebElement adrs;
	@FindBy(xpath="//input[@placeholder='Landmark']")
	private WebElement landmark;
	@FindBy(xpath="//input[@placeholder='Zip']")
	private WebElement zip;
	@FindBy(xpath="//input[@placeholder='City']")
	private WebElement city;
	@FindBy(xpath="//input[@placeholder='Enter Your Phone Number']")
	private WebElement mobno;
	
	
	
	
	public AddAdresspage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	public void buynowbtn()
	{
		buynow.click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void addaddress()
	{
		name.sendKeys("Ashu");
		phone.sendKeys("8296316333");
		adrs.sendKeys("banglore");
		landmark.sendKeys("Murgeshpallaya");
		zip.sendKeys("560017");
		city.sendKeys("Banglore");
	}
    public void mobno()
    {
    	mobno.sendKeys("8296316333");
 
    }
}
