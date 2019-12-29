package Test_Scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;

public class CopyOfFetchProperty_data {
@Test
public void test_property() throws FileNotFoundException, IOException
{
	Properties p=new Properties();
	p.load(new FileInputStream("./p.properties"));
	 String value = p.getProperty("iw");
	 System.out.println(value);
}
}
