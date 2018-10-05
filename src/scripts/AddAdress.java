package scripts;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import POM.AddAdresspage;
import POM.Cartpage;
import POM.Homepage;
import POM.Loginpage;
import POM.Logoutpage;
import POM.Productpage;
import generic.Auto_constant;
import generic.Excel;

public class AddAdress implements Auto_constant {
	static
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException  {
		String us = Excel.abc(excelpath,"Sheet1",1,0);
		String pass = Excel.abc(excelpath,"Sheet1",1,1);
		String name = Excel.abc(excelpath,"Sheet1",1,2);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.infibeam.com/");
		Loginpage l=new Loginpage(driver);
		l.login_register_btn();
		l.emailaddtb(us);
		l.passwordtb(pass);
		l.login();
		Homepage h=new Homepage(driver);
		h.searchtb(name);
		h.searchbtn();
		Productpage p=new Productpage(driver);
		p.productbtn();
		Thread.sleep(10000);
		AddAdresspage ad=new AddAdresspage(driver);
		ad.buynowbtn();
		ad.addaddress();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text()='SAVE ADDRESS']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ad.mobno();
		driver.findElement(By.xpath("//button[text()='Confirm Shipping & Billing Address']")).click();
		
	}
}