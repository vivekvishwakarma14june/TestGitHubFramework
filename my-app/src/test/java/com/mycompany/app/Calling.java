package com.mycompany.app;

import org.testng.annotations.Test;

public class Calling {

	public class toGettingData extends BaseClass {

		/*@Test
		
		public void Browser(){
			driver.get("URL");
		}*/
		
		@Test
		public void toReadDataFile() {
			System.out.println(p.getProperty("URL"));
			System.out.println(p.getProperty("BrowserName"));

		}

	}

}
