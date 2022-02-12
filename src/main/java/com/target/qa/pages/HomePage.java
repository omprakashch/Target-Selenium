package com.target.qa.pages;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.target.qa.util.CommonElements;
import com.target.qa.util.TestUtil;

import io.qameta.allure.Step;

public class HomePage extends CommonElements{
	
	@FindBy(xpath = "//span[contains(text(),'Sign in')]")
	WebElement SignInIcon;
	
	@FindBy(xpath = "//div[contains(text(),'Sign in')]")
	WebElement SignInLink;
	
	@FindBy(xpath = "//span[contains(text(),'my account')]/following-sibling::span")
	WebElement AccountName;
	
	@FindBy(xpath = "//div[@id='accountMenu']//li")
	List<WebElement> SignInOptionList;
	
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	@Step("login with username: {0} and password: {1} step... ")
	public SignInPage clickSignIn(){
		click(SignInIcon);
		jseClick(SignInLink);
		return new SignInPage();
	}
	
	@Step("click on signin icon step... ")
	public void clickSignInIcon(){
		System.out.println("SignInIcon "+SignInIcon);
		click(SignInIcon);
	}
	
	public String getAccountName(){
		return AccountName.getText();
	}

	@Step("getting signin option list step... ")
	public List<WebElement> getSignInOptionList() {
		return SignInOptionList;
	}

}
