package com.target.qa.pages;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.target.qa.util.CommonElements;
import com.target.qa.util.TestUtil;

public class RedCardExclusivesPage extends CommonElements{

	@FindBy(xpath = "//h2[contains(text(),'Credit Card payment')]/../../following-sibling::div[1]/div")
	List<WebElement> CreditCardPaymentOptions;
	
	@FindBy(xpath = "//div[contains(text(),'In store & online.')]/../../../../following-sibling::div[contains(@role,'list')]//div[contains(@role,'listitem')]//a")
	List<WebElement> CardApplyingOptions;
	
	
	public RedCardExclusivesPage(){
		PageFactory.initElements(driver, this);
	}
	
	public List<WebElement> getCardApplyingOptions() {
		return CardApplyingOptions;
	}

	public List<WebElement> getCreditCardPaymentOptions() {
		return CreditCardPaymentOptions;
	}

}
