package ObjectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPage {
	@FindBy(xpath="//div/h4[text()='Stuffed Frog']/ancestor::li[@class='product ng-scope']/descendant::a[text()='Buy']")
	private WebElement buyFrogBtn;
	
	@FindBy(xpath="//div/h4[text()='Fluffy Bunny']/ancestor::li[@class='product ng-scope']/descendant::a[text()='Buy']")
	private WebElement buyBunnyBtn;
	
	@FindBy(xpath="//div/h4[text()='Valentine Bear']/ancestor::li[@class='product ng-scope']/descendant::a[text()='Buy']")
	private WebElement buyValentineBearBtn;
	
	@FindBy(xpath="//div/h4[text()='Stuffed Frog']/ancestor::li[@class='product ng-scope']/descendant::span")
	private WebElement frogPrice;
	
	@FindBy(xpath="//div/h4[text()='Fluffy Bunny']/ancestor::li[@class='product ng-scope']/descendant::span")
	private WebElement bunnyPrice;
	
	@FindBy(xpath="//div/h4[text()='Valentine Bear']/ancestor::li[@class='product ng-scope']/descendant::span")
	private WebElement bearPrice;
	
	public ShopPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getbuyFrogBtn() {
		return buyFrogBtn;
	}

	public WebElement getBuyBunnyBtn() {
		return buyBunnyBtn;
	}

	public WebElement getBuyValentineBearBtn() {
		return buyValentineBearBtn;
	}
	public WebElement getfrogPrice() {
		return frogPrice;
	}
	public WebElement getbunnyPrice() {
		return bunnyPrice;
	}
	public WebElement getbearPrice() {
		return bearPrice;
	}
	
	public void productToBuy() {
		for(int i=0;i<2;i++) {
		buyFrogBtn.click();}
		for(int i=0;i<5;i++) {
			buyBunnyBtn.click();}
		for(int i=0;i<3;i++) {
			buyValentineBearBtn.click();}
		
		
	}
	
	
	

}
