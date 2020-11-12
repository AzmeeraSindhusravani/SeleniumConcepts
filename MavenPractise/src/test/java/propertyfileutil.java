package test.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class propertyfileutil {
	
		public static String getvalueforkey(String key) throws Throwable, IOException{
			Properties configproperty=new Properties();
			configproperty.load(new FileInputStream(new File("C:\\Users\\User\\Desktop\\selenium_maven\\MavenPractise\\login\\data.properties")));
			return configproperty.getProperty(key);
	}

}
