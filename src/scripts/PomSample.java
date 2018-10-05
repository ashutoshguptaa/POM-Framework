package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomSample
{
	@FindBy(name="username")
	private WebElement usernametb;
	@FindBy(name="password")
	private WebElement passwordtxtbox;
	@FindBy(xpath="//button[.=\"Sign in\"]")
	private WebElement submitbtn;
	public PomSample(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void username(String dummy)
	{
		usernametb.sendKeys(dummy);
	}

	public void password(String passw)
	{
		passwordtxtbox.sendKeys(passw);
	}
	public void submitbut()
	{
		submitbtn.click();
	}
}
