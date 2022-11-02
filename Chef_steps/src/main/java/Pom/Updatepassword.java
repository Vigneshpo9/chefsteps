package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Updatepassword {
	public static WebDriver driver;
	
	
	@FindBy(id="new-password")
	private WebElement npassword;
	
	public Updatepassword(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getNpassword() {
		return npassword;
	}

	public WebElement getCpassword() {
		return cpassword;
	}

	public WebElement getSubmit() {
		return submit;
	}

	@FindBy(id="confirm-password")
	private WebElement cpassword;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
	
	



   
	}
	
	
	


