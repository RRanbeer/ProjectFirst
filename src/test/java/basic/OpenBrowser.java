package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowser 
{
	@Test
	public void test_BrowserOpening()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser get open");
		
	}
}
