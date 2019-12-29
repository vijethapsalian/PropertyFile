package Data_provider;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic.Generic_Test;
import Generic.Type_cast;

public class ReadData{
public WebDriver driver;
@DataProvider(name="Authentication")
public Object[][] loginData() throws EncryptedDocumentException, InvalidFormatException, IOException
{
	Object[][] arrobj = Dataprvdr.getData();
	
	return arrobj;
}

@BeforeMethod
public void openApplctn() throws FileNotFoundException, IOException
{
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	driver=new FirefoxDriver();
	Type_cast t=new Type_cast();
	driver.manage().timeouts().implicitlyWait(t.Type(), TimeUnit.SECONDS);
	driver.get("http://localhost/login.do");
}

@Test(dataProvider="Authentication")
public void login(String username,String pwd) throws InterruptedException
{
	driver.findElement(By.id("username")).sendKeys(username);
	//Thread.sleep(2000);
	driver.findElement(By.name("pwd")).sendKeys(pwd);
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	Thread.sleep(5000);
	String atitle=driver.getTitle();
	System.out.println(atitle);
	Assert.assertEquals(atitle, "actiTIME - Enter Time-Track");
	}	

@AfterMethod
public void closeApplctn()
{
	driver.close();
}


}
