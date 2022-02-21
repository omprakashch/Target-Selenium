package com.target.qa.pages;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.target.qa.util.CommonElements;
import com.target.qa.util.TestUtil;

public class TopDealsPage extends CommonElements{

	@FindBy(xpath = "//span[contains(text(),'Shop more deals')]/../../../parent::div[contains(@data-test,'picture')]")
	WebElement ShopMoreDealsSection;
	
	@FindBy(xpath = "//div[@data-test='filmstrip']//ul/li/a[contains(@class,'Link')]")
	List<WebElement> Deals;
	
	public TopDealsPage(){
		PageFactory.initElements(driver, this);
	}

	public boolean isShopMoreDealsPresent() {
		return isElementPresent(ShopMoreDealsSection);
	}

	public List<WebElement> getDeals() {
		return Deals;
	}

}
