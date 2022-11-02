package Chefstep_Reg;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Po_Manager.Po_Update;
import Po_Manager.Po_signin;
import Pom.Signin;
import Pom.Updatepassword;
import breville.Chef_steps.Base_Class;

public class Update_password extends Base_Class {
	
	public static WebDriver driver = browserlaunch("chrome");
	 public static Signin login = new Signin(driver);
    public static Updatepassword newpass = new Updatepassword(driver);
    public static Po_signin pom = new Po_signin(driver);
    public static Po_Update Upom = new Po_Update(driver);
    public static Logger log = Logger.getLogger(Update_password.class);

	
	public static void main(String[] args) throws Throwable {
		PropertyConfigurator.configure("log4j.properties");
		
	        log.info("Browser launched Successfully");
		    url("https://www.vanillanimoy.com/users/preauth_init");
	        Thread.sleep(2000);
	        driver.navigate().to("https://www.vanillanimoy.com/sso/sign-in");
	        Thread.sleep(2000);
	        log.info("Url launched Successfully");

	        //Login
	        inputvalues(pom.getInstancesignin().getEmail(), perticular_Data("C:\\Users\\Vignesh\\eclipse-workspace\\Chef_steps\\xl\\Update password.xlsx", 8, 5));
	        Thread.sleep(1000);
	        inputvalues(pom.getInstancesignin().getPassword(), perticular_Data("C:\\Users\\Vignesh\\eclipse-workspace\\Chef_steps\\xl\\Update password.xlsx", 9, 5));
	        Thread.sleep(1000);
	        click(pom.getInstancesignin().getSign_in());
	        Thread.sleep(2000);
	        log.info("Credientials need to Update");

	        //Update password
	        inputvalues(Upom.getInstanceUpdate().getNpassword(), perticular_Data("C:\\Users\\Vignesh\\eclipse-workspace\\Chef_steps\\xl\\Update password.xlsx", 14, 5));
	        Thread.sleep(1000);
	        inputvalues(Upom.getInstanceUpdate().getCpassword(), perticular_Data("C:\\Users\\Vignesh\\eclipse-workspace\\Chef_steps\\xl\\Update password.xlsx", 15, 5));
	        Thread.sleep(1000);
	        click(Upom.getInstanceUpdate().getSubmit());
	        Thread.sleep(1000);
	        log.info("Credientials Updated Successfully");



	    }

	
		
	}
	



