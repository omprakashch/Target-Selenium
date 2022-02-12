package com.target.qa.util;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.target.qa.pages.ClearancePage;
import com.target.qa.pages.RedCardExclusivesPage;
import com.target.qa.pages.TargetCircleOffersPage;
import com.target.qa.pages.TopDealsPage;
import com.target.qa.pages.WeeklyAdPage;
import com.target.qa.util.TestUtil;

import io.qameta.allure.Step;

public class CommonElements extends TestUtil{
	
	@FindBy(xpath = "//a[@id='categories'][2]")
	WebElement Categories;
	
	@FindBy(xpath = "//a[@aria-label='deals menu']")
	WebElement Deals;
	
	@FindBy(xpath = "//a[@id='trending']")
	WebElement WhatsNew;
	
	@FindBy(xpath = "//a[@id='pickupAndDelivery']")
	WebElement PickupAndDelivery;
	
	@FindBy(xpath = "//input[@id='search']")
	WebElement SearchInputField;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement SearchIcon;
	
	@FindBy(xpath = "//div[text()='Clearance']")
	WebElement Clearance;
	
	@FindBy(xpath = "//div[text()='Weekly Ad']")
	WebElement WeeklyAd;
	
	@FindBy(xpath = "//div[text()='Top Deals']")
	WebElement TopDeals;
	
	@FindBy(xpath = "//div[text()='RedCard Exclusives']")
	WebElement RedCardExclusives;
	
	@FindBy(xpath = "//div[text()='Target Circle Offers']")
	WebElement TargetCircleOffers;
	
	@FindBy(xpath = "//div[@id='footer']")
	WebElement FooterSection;
	
	@FindBy(xpath = "//span[contains(text(),'Trending items')]/../../../../../../..")
	WebElement TrendingItemsSection;
	
	@FindBy(xpath = "//span[contains(text(),'Trending items')]/../../../../../../../li")
	List<WebElement> TrendingItemsList;
	
	
	public CommonElements(){
		PageFactory.initElements(driver, this);
	}
	
	public ClearancePage clickClearnce(){
		click(Deals);
		jseClick(Clearance);
		pause(3);
		return new ClearancePage();
	}
	
	public WeeklyAdPage clickWeeklyAd(){
		click(Deals);
		jseClick(WeeklyAd);
		pause(3);
		return new WeeklyAdPage();
	}
	
	public TopDealsPage clickTopDeals(){
		click(Deals);
		jseClick(TopDeals);
		pause(3);
		return new TopDealsPage();
	}

	public RedCardExclusivesPage clickRedCardExclusives(){
		click(Deals);
		jseClick(RedCardExclusives);
		pause(3);
		return new RedCardExclusivesPage();
	}
	
	public TargetCircleOffersPage clickTargetCircleOffers(){
		click(Deals);
		jseClick(TargetCircleOffers);
		pause(3);
		return new TargetCircleOffersPage();
	}
	
	@Step("getting trending items list step... ")
	public List<WebElement> getTrendingItemsList(){
		scroll(10);
		return TrendingItemsList;
	}
}
