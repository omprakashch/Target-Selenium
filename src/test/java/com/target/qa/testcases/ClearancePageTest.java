package com.target.qa.testcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.target.qa.pages.ClearancePage;
import com.target.qa.pages.HomePage;
import com.target.qa.pages.SignInPage;
import com.target.qa.pages.WeeklyAdPage;
import com.target.qa.util.CommonElements;
import com.target.qa.util.TestUtil;

public class ClearancePageTest extends CommonElements{

	
	@Test
	public void verifyClearancePageDisplayed(){
		ExecutionStartLog("verifyClearancePageDisplayed");
		HomePage homePage = new HomePage();
		ClearancePage clearancePage = homePage.clickClearnce();
		Assert.assertTrue(clearancePage.getPageTitle().contains("Clearance : "), "Clearance Link on Deals Not Working");
		ExecutionEndLog("verifyClearancePageDisplayed");
	}
	
	@Test
	public void verifyClearanceList(){
		ExecutionStartLog("verifyClearanceList");
		HomePage homePage = new HomePage();
		ClearancePage clearancePage = homePage.clickClearnce();
		Assert.assertTrue(clearancePage.getClearanceList().size()==7, "Clearance List is incorrect");
		ExecutionEndLog("verifyClearanceList");
	}
	
	@Test
	public void verifyBrandFilterFunctionality(){
		ExecutionStartLog("verifyBrandFilterFunctionality");
		HomePage homePage = new HomePage();
		ClearancePage clearancePage = homePage.clickClearnce();
		clearancePage.clickBrand();
		String brandName = clearancePage.getBrandName(2); 
		clearancePage.clickBrand(2);
		pause(2);
		List<WebElement> productList = clearancePage.getProductList();
		for(int i=1;i<=productList.size();i++){
		Assert.assertTrue(clearancePage.getProductBrandName(i).equals(brandName), "Brand Filter Functionality For Product"+i+" Not Working");
		}
		ExecutionEndLog("verifyBrandFilterFunctionality");
	}

}
