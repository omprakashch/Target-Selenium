package com.target.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.target.qa.pages.ClearancePage;
import com.target.qa.pages.HomePage;
import com.target.qa.pages.RedCardExclusivesPage;
import com.target.qa.pages.SignInPage;
import com.target.qa.pages.TargetCircleOffersPage;
import com.target.qa.pages.WeeklyAdPage;
import com.target.qa.util.CommonElements;
import com.target.qa.util.TestUtil;

public class TargetCircleOffersPageTest extends CommonElements{
	
	@Test
	public void verifyTargetCircleOffersPageDisplayed(){
		ExecutionStartLog("verifyTargetCircleOffersPageDisplayed");
		HomePage homePage = new HomePage();
		TargetCircleOffersPage targetCircleOffersPage = homePage.clickTargetCircleOffers();
		Assert.assertTrue(targetCircleOffersPage.getPageTitle().contains("Offers"), "TargetCicleOffers Link on Deals Not Working");
		ExecutionEndLog("verifyTargetCircleOffersPageDisplayed");
	}
	
	@Test
	public void verifyAllCategoriesOptionSelected(){
		ExecutionStartLog("verifyAllCategoriesOptionSelected");
		HomePage homePage = new HomePage();
		TargetCircleOffersPage targetCircleOffersPage = homePage.clickTargetCircleOffers();
		Assert.assertTrue(targetCircleOffersPage.isAllCategoriesOptionSelected(), "All Categories Option Not Selected");
		ExecutionEndLog("verifyAllCategoriesOptionSelected");
	}
	
	@Test
	public void verifyAllCategoriesDisplayed(){
		ExecutionStartLog("verifyAllCategoriesDisplayed");
		HomePage homePage = new HomePage();
		TargetCircleOffersPage targetCircleOffersPage = homePage.clickTargetCircleOffers();
		Assert.assertTrue(targetCircleOffersPage.getCategoriesList().size()==14, "All the Categories Not Displayed");
		ExecutionEndLog("verifyAllCategoriesDisplayed");
	}
}
