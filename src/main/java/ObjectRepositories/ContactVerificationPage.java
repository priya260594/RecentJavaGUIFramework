package ObjectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactVerificationPage {
	@FindBy(xpath="//div[@class='alert alert-error ng-scope']")
	private WebElement errorTxt;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement confirmedTxt;
	
	public ContactVerificationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement geterrorTxt() {
		return errorTxt;
	}
	
	public WebElement getconfirmedTxt() {
		return confirmedTxt;
	}
	

}
