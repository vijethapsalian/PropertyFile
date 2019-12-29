package Data_provider;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic.Generic_select;
import Generic.Type_cast;

public class Facebook {
	public WebDriver driver;
@DataProvider(name="fb")
public Object[][] excelFetch() throws EncryptedDocumentException, InvalidFormatException, IOException
{
	Object[][] data = Dataprvdr.getData();
	return data;
}

@BeforeMethod
public void openApplctn() throws FileNotFoundException, IOException
{
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	driver=new FirefoxDriver();
	Type_cast t=new Type_cast();
	driver.manage().timeouts().implicitlyWait(t.Type(), TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
}

@Test(dataProvider="fb")
public void signUp(String fname,String lname,String no,String pwd,String date,String mnth,String yr)
{
	driver.findElement(By.name("firstname")).sendKeys(fname);
	driver.findElement(By.name("lastname")).sendKeys(lname);
	driver.findElement(By.name("reg_email__")).sendKeys(no);
	driver.findElement(By.name("reg_passwd__")).sendKeys(pwd);
	WebElement ele = driver.findElement(By.id("day"));
	WebElement ele1 = driver.findElement(By.id("month"));
	WebElement ele3 = driver.findElement(By.id("year"));
	Generic_select gs=new Generic_select();
	gs.selectText(ele, date);
	gs.selectText(ele1, mnth);
	gs.selectText(ele3, yr);
	driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
	driver.findElement(By.name("websubmit")).click();
	
	
}
@AfterMethod
public void closeApplctn() throws InterruptedException
{
	Thread.sleep(4000);
	driver.close();
}




















	
	
	
}