package Generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scroll_Generic {
public void scrollTo(WebDriver driver,WebElement ele)
{
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Point loc = ele.getLocation();
	int x = loc.getX();
	int y = loc.getY();
	js.executeScript("window.scrollBy("+x+","+y+")");
	
	
}
}
