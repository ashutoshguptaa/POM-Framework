package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PomExe
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}

	public static void main(String args[])
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.vtiger.com/");
		PomSample s=new PomSample(driver);
		s.username("admin");
		s.password("admin");
		s.submitbut();
	}
}
