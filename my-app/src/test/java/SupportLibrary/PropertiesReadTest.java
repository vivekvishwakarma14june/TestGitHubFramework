package SupportLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReadTest {
	public static Properties PropertyRead() {

		try {
			Properties prop = new Properties();
			InputStream i = new FileInputStream(
					"F:\\selenium maven\\my-app\\TestData.properties");
			prop.load(i);
			return prop;

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
}
