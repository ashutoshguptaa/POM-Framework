package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logoutpage 
{
	@FindBy(xpath="//a[text()='MY ACCOUNT ']")
	private WebElement myaccount;
	@FindBy(xpath="//a[@href='/jsp/logout.jsp']")
	private WebElement logout;
	
	public Logoutpage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	public void logout(WebDriver driver) throws InterruptedException
	{
	WebElement ele= driver.findElement(By.xpath("//a[text()='MY ACCOUNT ']"));
	Actions a=new Actions(driver);
	a.moveToElement(ele).build().perform();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[@href='/jsp/logout.jsp']")).click();
}
}
