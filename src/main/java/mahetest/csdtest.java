package mahetest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

@Test

public class csdtest {
	
	WebDriver driver;
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOIS\\Desktop\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://172.16.51.98/moodle/login");
		 driver.findElement(By.id("username")).sendKeys("admin");
         driver.findElement(By.id("password")).sendKeys("Moodle@123");
         driver.findElement(By.id("loginbtn")).click();
	}

}
