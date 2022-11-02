package Po_Manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pom.Forgotpassword;
import Pom.Signin;

public class Po_forgot {
	public static WebDriver driver;
	
	private Forgotpassword FP;
	
	public Po_forgot(WebDriver driver2) {
		this.driver = driver2;
	}

	public Forgotpassword getInstancesforgot() {
		if(FP == null) {
			 FP = new Forgotpassword(driver);
		}
		return FP;

	}

}


