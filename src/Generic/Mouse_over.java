package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouse_over {
	Actions act;
	public void mouseOver(WebDriver driver,WebElement ele)
	{
	act=new Actions(driver);
	act.moveToElement(ele).perform();
	}

}