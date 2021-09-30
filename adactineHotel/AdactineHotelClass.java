package adactineHotel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AdactineHotelClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Pooja Tetu Java Practice\\Practice Programs\\src\\com\\tcs\\delta\\billing\\webDriver.java");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.name("username"));
	    username.sendKeys("");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.id("login")).click();
	}

}
