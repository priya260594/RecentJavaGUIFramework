package ObjectRepositories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.WebDriverUtility;

public class ContactPage extends WebDriverUtility {
	public WebDriverUtility wUtil=new WebDriverUtility();
	@FindBy(xpath="//input[@id='forename']")
	private WebElement foreNameTxtBox;
	
	@FindBy(id="email")
	private WebElement emailTxtBox;
	
	@FindBy(id="message")
	private WebElement messageTxtBox;

	@FindBy(xpath="//a[text()='Submit']")
	private WebElement submitBtn;
	
	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getForeNameTxtBox() {
		return foreNameTxtBox;
	}

	public WebElement getEmailTxtBox() {
		return emailTxtBox;
	}

	public WebElement getMessageTxtBox() {
		return messageTxtBox;
	}
	public WebElement getsubmitBtn() {
		return submitBtn;
	}
	
	public void fillMandatoryFields(String forename,String email,String message) throws Throwable {
		foreNameTxtBox.sendKeys(forename);
		emailTxtBox.sendKeys(email);
		messageTxtBox.sendKeys(message);
		submitBtn.click();
	}
}
