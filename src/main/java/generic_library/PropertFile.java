package generic_library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertFile {

	public String getPropertydata(String key) throws Throwable
	{
		Properties p= new Properties();
		FileInputStream fis=new FileInputStream(IPathConstant.propertFilePath);
		p.load(fis);
	    
		return 	p.getProperty(key);
		
	}
}
