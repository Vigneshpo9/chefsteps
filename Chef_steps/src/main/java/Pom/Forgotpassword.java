package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgotpassword {
	public static WebDriver driver;
	
	@FindBy(name="vignesh@gmail.com")
	private WebElement email;
	
	


	

	public Forgotpassword(WebDriver driver2) {
		this.driver = driver2;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	@FindBy(className="button solid orange")
	private WebElement Submit;

}
