package Data_provider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Property_data {
	@Test
public Property_data fetchProperty() throws FileNotFoundException, IOException
{
	Properties p=new Properties();
	p.load(new FileInputStream("./p.properties"));
			 String username = p.getProperty("username");
			 String password = p.getProperty("password");
			 System.out.println(username);
			 System.out.println(password);
			return null;
}
}
