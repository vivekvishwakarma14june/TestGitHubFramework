package selenimPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debugging {
	
	public int fParamReturnSum(int a, int b) {
		return (a + b);
	}

	public int fParamReturnMul(int a, int b) {
		return (a * b);

	}

	public int fParamReturnSub(int a, int b) {
		return (a - b);
	}

	public int fParamReturnDiv(int a, int b) {
		return (a / b);
	}
public static void main(String[] args) {
	Debugging de = new Debugging();
	de.fParamReturnDiv(4, 2);
	de.fParamReturnMul(2, 3);
	de.fParamReturnSub(5, 3);
	de.fParamReturnSum(5, 3);
}

}
