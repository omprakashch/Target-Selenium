package com.target.qa.pages;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.target.qa.util.CommonElements;
import com.target.qa.util.TestUtil;

public class TopDealsPage extends CommonElements{

	@FindBy(xpath = "//h2[contains(text(),'Deals on everyday essentials')]/../following-sibling::div")
	WebElement DealsOnEveryDayEssentialsSection;
	
	@FindBy(xpath = "//span[contains(text(),'More ways to save')]/../../following-sibling::ul/li")
	List<WebElement> SavingWays;
	
	public TopDealsPage(){
		PageFactory.initElements(driver, this);
	}

	public boolean isDealsOnEveryDayEssentialsPresent() {
		return isElementPresent(DealsOnEveryDayEssentialsSection);
	}

	public List<WebElement> getSavingWays() {
		return SavingWays;
	}

}
