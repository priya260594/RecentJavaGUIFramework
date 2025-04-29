package ObjectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//li[@id='nav-contact']")
	private WebElement contactBtn;
	
	@FindBy(xpath="//li[@id='nav-cart']")
	private WebElement cartBtn;
	
	@FindBy(xpath="//li[@id='nav-shop']")
	private WebElement shopBtn;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getContactBtn() {
		return contactBtn;
	}
	public WebElement getshopBtn() {
		return shopBtn;
	}
	public WebElement getcartBtn() {
		return cartBtn;
	}
	
}
