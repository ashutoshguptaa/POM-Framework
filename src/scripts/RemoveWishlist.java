package scripts;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import POM.AddWishlistpage;

import POM.Homepage;
import POM.Loginpage;
import POM.Logoutpage;
import POM.Productpage;

import POM.RmvWishlstpage;
import generic.Auto_constant;
import generic.Excel;

public class RemoveWishlist implements Auto_constant {
	static
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	}

	public static void main(String[] args)  {
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
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		AddWishlistpage w=new AddWishlistpage(driver);
		w.addwishlistbtn();
		w.checkwishlistbtn();
		RmvWishlstpage rvw= new RmvWishlstpage(driver);
		rvw.rmvwishlist(driver);
		Logoutpage lo=new Logoutpage(driver);
		try {
			lo.logout(driver);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
}
}		