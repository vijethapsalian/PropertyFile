package Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Generic_property {
	public void data(String path,String key) throws FileNotFoundException, IOException
	{
	Properties p=new Properties();
	p.load(new FileInputStream(path));
	String value = p.getProperty(key);
	System.out.println(value);
	}	
}
