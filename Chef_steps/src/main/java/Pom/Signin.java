package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {
	public static WebDriver driver;

	@FindBy(id = "email")
	private WebElement email;
	
	

	public Signin(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSign_in() {
		return Sign_in;
	}

	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Sign_in;
	
	@FindBy(xpath="//a[text()='Forget password']")
	private WebElement forgotpass;



    public WebElement getForgotpass() {
		return forgotpass;
	}
	
	}
