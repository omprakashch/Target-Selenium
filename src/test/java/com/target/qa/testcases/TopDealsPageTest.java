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

public class TopDealsPageTest extends CommonElements{
	
	@Test
	public void verifyTopDealsPageDisplayed(){
		ExecutionStartLog("verifyTopDealsPageDisplayed");
		HomePage homePage = new HomePage();
		TopDealsPage topDealsPage = homePage.clickTopDeals();
		Assert.assertTrue(topDealsPage.getPageTitle().contains("Target Coupons"), "Top Deals Link on Deals Not Working");
		ExecutionEndLog("verifyTopDealsPageDisplayed");
	}
	
	@Test
	public void verifyShopMoreDealsSectionDisplayed(){
		ExecutionStartLog("verifyShopMoreDealsSectionDisplayed");
		HomePage homePage = new HomePage();
		TopDealsPage topDealsPage = homePage.clickTopDeals();
		Assert.assertTrue(topDealsPage.isShopMoreDealsPresent(), "Shop More Deals Section Not Displayed");
		ExecutionEndLog("verifyShopMoreDealsSectionDisplayed");
	}
	
	@Test
	public void verifyDealsCount(){
		ExecutionStartLog("verifyDealsCount");
		HomePage homePage = new HomePage();
		TopDealsPage topDealsPage = homePage.clickTopDeals();
		Assert.assertTrue(topDealsPage.getDeals().size()==6, "Deals Count is incorrect");
		ExecutionEndLog("verifyDealsCount");
	}
}
