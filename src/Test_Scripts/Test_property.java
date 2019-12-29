package Test_Scripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.annotations.Test;
import Generic.Generic_fetch;

public class Test_property {
@Test
public void Data() throws FileNotFoundException, IOException
{
	Generic_fetch g=new Generic_fetch();
	 g.Property("./p.properties", "iw");
	 g.Property("./p.properties", "ew");
}
}
