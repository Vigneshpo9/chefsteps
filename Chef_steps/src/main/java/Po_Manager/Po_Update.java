package Po_Manager;

import org.openqa.selenium.WebDriver;

import Pom.Signin;
import Pom.Updatepassword;

public class Po_Update {
	public static WebDriver driver;
	
	private Updatepassword Update;
	
	
	public Po_Update(WebDriver driver2) {
		this.driver = driver2;
	}


	public Updatepassword getInstanceUpdate() {
		if(Update == null) {
			 Update = new Updatepassword(driver);
		}
		return Update;

	}

	}


