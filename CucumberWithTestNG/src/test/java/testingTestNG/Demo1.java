package testingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {
	WebDriver driver;
	
	@Test
	public void test1()
	{
		System.out.println("Test Executed1235789");
	}

	@Test
	public void test2()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://google.com");
	}
	
	
}
