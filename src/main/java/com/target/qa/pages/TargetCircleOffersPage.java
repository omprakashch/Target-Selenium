package com.target.qa.pages;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.target.qa.util.CommonElements;
import com.target.qa.util.TestUtil;

public class TargetCircleOffersPage extends CommonElements{

	@FindBy(xpath = "//span[contains(text(),'All')]/preceding-sibling::div/div/following-sibling::span")
	WebElement AllCategoriesSelectionMark;
	
	@FindBy(xpath = "//ul[@data-test='category-menu']/li")
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
