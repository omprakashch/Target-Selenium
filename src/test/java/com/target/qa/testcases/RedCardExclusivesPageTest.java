package com.target.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.target.qa.pages.ClearancePage;
import com.target.qa.pages.HomePage;
import com.target.qa.pages.RedCardExclusivesPage;
import com.target.qa.pages.SignInPage;
import com.target.qa.pages.WeeklyAdPage;
import com.target.qa.util.CommonElements;
import com.target.qa.util.TestUtil;

public class RedCardExclusivesPageTest extends CommonElements{
	
	@Test
	public void verifyRedCardExclusivesPageDisplayed(){
		ExecutionStartLog("verifyRedCardExclusivesPageDisplayed");
		HomePage homePage = new HomePage();
		RedCardExclusivesPage redcardExclusivesPage = homePage.clickRedCardExclusives();
		logInfo("Title : "+redcardExclusivesPage.getPageTitle());
		Assert.assertTrue(redcardExclusivesPage.getPageTitle().contains("RedCard :"), "RedCardExclusives Link on Deals Not Working");
		ExecutionEndLog("verifyRedCardExclusivesPageDisplayed");
	}
	
	@Test
	public void verifyCardApplyingOptions(){
		ExecutionStartLog("verifyCardApplyingOptions");
		HomePage homePage = new HomePage();
		RedCardExclusivesPage redcardExclusivesPage = homePage.clickRedCardExclusives();
		Assert.assertTrue(redcardExclusivesPage.getCardApplyingOptions().size()==2, "Card Applying Option Count is incorrect");
		ExecutionEndLog("verifyCardApplyingOptions");
	}
	
	@Test
	public void verifyCreditCardPaymentOptions(){
		ExecutionStartLog("verifyCreditCardPaymentOptions");
		HomePage homePage = new HomePage();
		RedCardExclusivesPage redcardExclusivesPage = homePage.clickRedCardExclusives();
		Assert.assertTrue(redcardExclusivesPage.getCreditCardPaymentOptions().size()==4, "Credit Card Payment Option Count is incorrect");
		ExecutionEndLog("verifyCreditCardPaymentOptions");
	}
}
