package Generic;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Swich_TO {
public void switchTab(WebDriver driver)
{
	Set<String> allbh = driver.getWindowHandles();
	for(String wh:allbh)
	{
		driver.switchTo().window(wh);	
	}
	
	
	
}
	
	
	
}
