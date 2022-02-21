package com.target.qa.pages;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.target.qa.util.CommonElements;
import com.target.qa.util.TestUtil;

public class TargetCircleOffersPage extends CommonElements{

	@FindBy(xpath = "//div[contains(text(),'All')]/parent::a//span")
	WebElement AllCategoriesSelectionMark;
	
	@FindBy(xpath = "//ul[contains(@data-test,'offer-categories')]/li")
	List<WebElement> CategoriesList;
	
	public TargetCircleOffersPage(){
		PageFactory.initElements(driver, this);
	}


	public boolean isAllCategoriesOptionSelected() {
		return isElementPresent(AllCategoriesSelectionMark);
	}


	public List<WebElement> getCategoriesList() {
		return CategoriesList;
	}

}
