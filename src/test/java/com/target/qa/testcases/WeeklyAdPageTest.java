package com.target.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.target.qa.pages.ClearancePage;
import com.target.qa.pages.HomePage;
import com.target.qa.pages.SignInPage;
import com.target.qa.pages.TopDealsPage;
import com.target.qa.pages.WeeklyAdPage;
import com.target.qa.util.CommonElements;
import com.target.qa.util.TestUtil;

public class WeeklyAdPageTest extends CommonElements{
	
	@Test
	public void verifyWeeklyAdPageDisplayed(){
		ExecutionStartLog("verifyWeeklyAdPageDisplayed");
		HomePage homePage = new HomePage();
		WeeklyAdPage weeklyAdPage = homePage.clickWeeklyAd();
		Assert.assertTrue(weeklyAdPage.getPageTitle().contains("Target Weekly Ad"), "Weakly Ad Link on Deals Not Working");
		ExecutionEndLog("verifyWeeklyAdPageDisplayed");
	}
	
	@Test
	public void verifyWeeklyAdsAndCatalogsSectionDisplayed(){
		ExecutionStartLog("verifyWeeklyAdsAndCatalogsSectionDisplayed");
		HomePage homePage = new HomePage();
		WeeklyAdPage weeklyAdPage = homePage.clickWeeklyAd();
		Assert.assertTrue(weeklyAdPage.isWeeklyAdsAndCatalogsSectionPresent(), "Weakly Ads & Catalogs Section Not Displayed");
		ExecutionStartLog("verifyWeeklyAdsAndCatalogsSectionDisplayed");
	}
	
	@Test
	public void verifyViewTheWeeklyAdButtonAndTargetTradeMarkLogoDisplayed(){
		ExecutionStartLog("verifyViewTheWeeklyAdButtonAndTargetTradeMarkLogoDisplayed");
		HomePage homePage = new HomePage();
		WeeklyAdPage weeklyAdPage = homePage.clickWeeklyAd();
		Assert.assertTrue(weeklyAdPage.isViewTheWeeklyAdButtonPresent(), "View The Weekly Ad Button Not Displayed");
		Assert.assertTrue(weeklyAdPage.isTargetTradeMarkLogoPresent(), "Target Trade Mark Logo Not Displayed");
		ExecutionEndLog("verifyViewTheWeeklyAdButtonAndTargetTradeMarkLogoDisplayed");
	}
}
