package testDataPak;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExcelPac.ExcelUtil;

import com.mycompany.app.BaseClass;

//import SupportLibraries.ExcelUtil;
//import SupportLibraries.report;

public class testDataProvider extends BaseClass {

	@Test(dataProvider = "DataProvider1")
	public void testDataProvider2(String username, String password)
			throws Exception {
		try {

			
			
			System.out.println(username);
			System.out.println(password);

		} catch (Exception e) {

		}
	}

	@DataProvider(name = "DataProvider1")
	public Object[][] loginData5() throws Exception {
		ExcelUtil ex = new ExcelUtil();
		Object[][] arrayObject = ex.getTableArray(
				"C:\\Users\\Home\\Desktop\\test.xlsx", "Sheet1");
		return arrayObject;
	}

}
