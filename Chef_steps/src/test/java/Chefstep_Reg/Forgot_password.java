package Chefstep_Reg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Po_Manager.Po_forgot;
import Po_Manager.Po_signin;
import Pom.Forgotpassword;
import Pom.Signin;
import breville.Chef_steps.Base_Class;

public class Forgot_password extends Base_Class {
	public static WebDriver driver = browserlaunch("chrome");
	 
	  public static Forgotpassword FP = new Forgotpassword(driver);
	  public static Po_signin pom = new Po_signin(driver);
	  public static Po_forgot fpom = new Po_forgot(driver);
	
	 public static void main(String[] args) throws InterruptedException {

	    
	     
	        
	        url("https://www.vanillanimoy.com/users/preauth_init");
	        Thread.sleep(2000);
	        driver.navigate().to("https://www.vanillanimoy.com/sso/sign-in");
	        Thread.sleep(2000);

	        //Forgot Password
	        click(pom.getInstancesignin().getForgotpass());
	        Thread.sleep(1000);
	        inputvalues(fpom.getInstancesforgot().getEmail(), "vignesh@gmail.com");
	        Thread.sleep(1000);
	        click(fpom.getInstancesforgot().getSubmit());




	    }

}
