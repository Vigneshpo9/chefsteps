package Po_Manager;

import org.openqa.selenium.WebDriver;

import Pom.Signin;

public class Po_signin {
	public static WebDriver driver;
	
	private Signin login;
	
	public Po_signin(WebDriver driver2) {
		this.driver = driver2;
	}

	public Signin getInstancesignin() {
		if(login == null) {
			 login = new Signin(driver);
		}
		return login;

	}

}