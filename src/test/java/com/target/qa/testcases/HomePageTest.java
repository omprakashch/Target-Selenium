package com.target.qa.testcases;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.target.qa.base.TestBase;
import com.target.qa.pages.HomePage;
import com.target.qa.pages.SignInPage;
import com.target.qa.util.CommonElements;
import com.target.qa.util.TestUtil;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class HomePageTest  extends CommonElements{
	
	@Test(description = "Login in to the Target Application Test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: Verify Login Functionality")
	@Story("Story Name: To Check Login Functionality")
	public void verifyLoginFunctionality(){
		ExecutionStartLog("verifyLoginFunctionality");
		HomePage homePage = new HomePage();
		SignInPage signInPage = homePage.clickSignIn();
		homePage = signInPage.Login("username", "password");
		Assert.assertTrue(homePage.getAccountName().contains("om prakash"), "Login Functionality Not Working");
		ExecutionEndLog("verifyLoginFunctionality");
	}
	
	@Test(description = "Verifying SignIn Option List Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify SignIn Option List Test")
	@Story("Story Name: To Check SignIn Option List")
	public void verifySignInOptionList(){
		ExecutionStartLog("verifySignInOptionList");
		HomePage homePage = new HomePage();
		homePage.clickSignInIcon();
		Assert.assertTrue(homePage.getSignInOptionList().size()==8, "SignIn Options Displayed Incorrectly");
		ExecutionEndLog("verifySignInOptionList");
	}
	
	@Test(description = "Verifying Trending Items Displayed Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify Trending Items Displayed Test")
	@Story("Story Name: To Check Trending Items Displayed")
	public void verifyTrendingItemsDisplayed(){
		ExecutionStartLog("verifyTrendingItemsDisplayed");
		HomePage homePage = new HomePage();
		Assert.assertTrue(homePage.getTrendingItemsList().size()>1, "Trending Items Not Displayed");	
		ExecutionEndLog("verifyTrendingItemsDisplayed");
	}
	/*
	@DataProvider
	public Object[][] getTargetTestData(){
		Object data[][] = TestUtil.getTestData("Registration");
		return data;
	}
	
	@Test(dataProvider = "getTargetTestData")
	public void verifyAccountCreationFunctionality(String email, String firstName, String lastName, String password){
		ExecutionStartLog("verifyAccountCreationFunctionality");
		HomePage homePage = new HomePage();
		SignInPage signInPage = homePage.clickSignIn();
		homePage = signInPage.Login("username", "password");
		Assert.assertTrue(homePage.getAccountName().contains("om prakash"), "Login Functionality Not Working");
		ExecutionEndLog("verifyAccountCreationFunctionality");
	}*/
	
}
