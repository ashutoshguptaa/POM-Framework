package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SelectColorpage
{
	@FindBy(id="color")
	private WebElement selectcolor;
	public SelectColorpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
    public void selectcolorbtn(int i)
    {
    	Select s=new Select(selectcolor);
    	s.selectByIndex(i);
    	System.out.println("color selected");
    }
}
