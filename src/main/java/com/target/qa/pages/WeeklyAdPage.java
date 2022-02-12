package com.target.qa.pages;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.target.qa.util.CommonElements;
import com.target.qa.util.TestUtil;

public class WeeklyAdPage extends CommonElements{

	@FindBy(xpath = "//h2[contains(text(),'Deals on everyday essentials')]/../following-sibling::div")
	WebElement WeeklyAdsAndCatalogsSection;
	
	@FindBy(xpath = "//button[contains(text(),'View the Weekly Ad')]")
	WebElement ViewTheWeeklyAdButton;
	
	@FindBy(xpath = "//span[contains(text(),'target trademark logo')]/preceding-sibling::img")
	WebElement TargetTradeMarkLogo;
	
	public WeeklyAdPage(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean isWeeklyAdsAndCatalogsSectionPresent() {
		return isElementPresent(WeeklyAdsAndCatalogsSection);
	}

	public boolean isViewTheWeeklyAdButtonPresent() {
		return isElementPresent(ViewTheWeeklyAdButton);
	}
	
	public boolean isTargetTradeMarkLogoPresent() {
		return isElementPresent(TargetTradeMarkLogo);
	}

}
