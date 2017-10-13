package friday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoA
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	
	@Parameters({"browser"})
	@Test
	public void testA(String browser) throws InterruptedException
	{
		WebDriver driver;
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		
		driver.get("http://localhost/login.do");
		WebElement un=driver.findElement(By.id("username"));
		for(int i=1; i<=50; i++)
		{
			Thread.sleep(500);
			un.sendKeys("admin");
			un.clear();
		}
	}

}
