package com.target.qa.pages;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.target.qa.base.TestBase;
import com.target.qa.util.CommonElements;
import com.target.qa.util.TestUtil;

public class SignInPage extends CommonElements{
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement emailInputField;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordInputField;
	
	@FindBy(xpath = "//button[@id='login']")
	WebElement signInButton;
	
	@FindBy(xpath = "//a[contains(text(),'Skip')]")
	WebElement skipLink;
	
	
	public SignInPage(){
		PageFactory.initElements(driver, this);
	}
	
	public HomePage Login(String userName, String password){
		enterText(emailInputField,prop.getProperty(userName));
		enterText(passwordInputField,prop.getProperty(password));
		click(signInButton);
		//click(skipLink);
		return new HomePage();
	}

}
