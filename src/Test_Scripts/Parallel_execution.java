package Test_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel_execution {
	public WebDriver driver;
	@Parameters({"browser"})
@Test
public void parallel(String brow)
{
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	if(brow.equals("firefox"))
	{
		driver=new FirefoxDriver();
		driver.get("https://www.google.com");
	}
	else
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
}
@AfterMethod
public void close()
{
	driver.close();
}
	
	
	
	
}
