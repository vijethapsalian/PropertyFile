package Generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_Test implements Framework_constants{
	public WebDriver driver;
	@BeforeMethod
	public void openApplctn()
	{
	System.setProperty(GECKO_KEY,GECKO_VALUE);
driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://localhost/login.do");	
}
	
@AfterMethod
public void closeApplctn(ITestResult res) throws IOException
{
	int status=res.getStatus();
	System.out.println(status);
	String tcname = res.getName();
	if(status==2 || status==1)
	{
		Generic_photo.getphoto(driver,tcname);
}
	driver.quit();
}
}
