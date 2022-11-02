package Chefstep_Reg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Po_Manager.Po_signin;
import Pom.Signin;
import breville.Chef_steps.Base_Class;

public class Sign_in extends Base_Class {
	     public static WebDriver driver = browserlaunch("chrome");
	     public static Signin login = new Signin(driver);
	     public static Po_signin pom = new Po_signin(driver);

	
         public static void main(String[] args) throws Throwable {
        	 
			
        url("https://www.vanillanimoy.com/users/preauth_init");
        Thread.sleep(2000);
        driver.navigate().to("https://www.vanillanimoy.com/sso/sign-in");
        Thread.sleep(2000);

        //Login
        inputvalues(pom.getInstancesignin().getEmail(), "vignesh@gmail.com");
        Thread.sleep(1000);
        inputvalues(pom.getInstancesignin().getPassword(), "TEst@123");
        Thread.sleep(1000);
        click(pom.getInstancesignin().getSign_in());
        Thread.sleep(2000);

    }
}



