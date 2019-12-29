package Test_Scripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Generic.Type_cast;

public class Launch {
@Test()
public void firefox() throws FileNotFoundException, IOException
{
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	//Type_cast t=new Type_cast();
	//System.out.println(t.Type());
	//driver.manage().timeouts().implicitlyWait(t.Type(), TimeUnit.SECONDS);
	driver.get("https://www.google.com");
	WebDriverWait wait=new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.titleContains("Google"));
	driver.quit();
}
}
