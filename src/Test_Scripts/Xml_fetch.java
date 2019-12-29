package Test_Scripts;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Xml_fetch {
@Parameters({"City","Country"})
@Test
public void Data(String City,String Country)
{
	Reporter.log(City, true);
	Reporter.log(Country, true);
}
}
