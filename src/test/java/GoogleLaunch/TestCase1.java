package GoogleLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 {

	// to check git 
	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("test");
	}
}
