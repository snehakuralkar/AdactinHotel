package adactineHotel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdactinhotelTest {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\Pooja Tetu Java Practice\\Practice Programs\\src\\com\\tcs\\delta\\billing\\webDriver.java");
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.get("https://adactinhotelapp.com/");
	    
	}
	@Test(priority=1)
	public void verifypageTitleTest() {
		String title=driver.getTitle();
		System.out.println("the page title:"+title);
		Assert.assertEquals(title, "Adactine.com - Hotel Reservation System");
	}
     @Test(priority=2)
     public void verifyAdactinLogoTest() {
    	 boolean thelogo=driver.findElement(By.xpath("//img[@class='logo']")).isDisplayed();
    	 Assert.assertTrue(thelogo);
     }
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
