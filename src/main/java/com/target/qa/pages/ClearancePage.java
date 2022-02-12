package com.target.qa.pages;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.target.qa.util.CommonElements;
import com.target.qa.util.TestUtil;

public class ClearancePage extends CommonElements{

	@FindBy(xpath = "//div[text()='Clothing & Accessories Clearance']")
	WebElement ClothingAndAccessoriesClearanceLink;
	
	@FindBy(xpath = "//span[text()='Brand']/preceding-sibling::span")
	WebElement BrandLink;
	
	@FindBy(xpath = "//label[contains(text(),'Search Brand')]/following-sibling::input")
	WebElement BrandInput;
	
	@FindBy(xpath = "//div[@id='mainContainer']/div[2]//ul/li")
	List<WebElement> ClearanceList;
	
	@FindBy(xpath = "//div[contains(@data-test,'product-list')]//li")
	List<WebElement> ProductList;
	
	String BrandOption1 = "//label[contains(text(),'Search Brand')]/../../following-sibling::div/div[";
	String BrandOption2 = "]//input[@type='checkbox']";
	
	String BrandNameOption1 = "//label[contains(text(),'Search Brand')]/../../following-sibling::div/div[";
	String BrandNameOption2 = "]/label/div/div/div";
	
	String ProductBrandOption1 = "//div[contains(@data-test,'product-list')]//li[";
	String ProductBrandOption2 = "]//div[contains(@class,'Brand')]";
	
	
	public ClearancePage(){
		PageFactory.initElements(driver, this);
	}
	
	public ClothingAndAccessoriesClearancePage clickClothingAndAccessoriesClearance(){
		click(ClothingAndAccessoriesClearanceLink);
		return new ClothingAndAccessoriesClearancePage();
	}

	public List<WebElement> getClearanceList() {
		return ClearanceList;
	}
	
	public void clickBrand(){
		click(BrandLink);
	}
	
	public void SelectBrand(int option){
		jseClick(BrandOption1+option+BrandOption2);
	}
	
	public String getBrandName(int option){
		return getText(BrandNameOption1+option+BrandNameOption2).trim();
	}
	public String getProductBrandName(int option){
		return getText(ProductBrandOption1+option+ProductBrandOption2).trim();
	}

	public List<WebElement> getProductList() {
		return ProductList;
	}
}
