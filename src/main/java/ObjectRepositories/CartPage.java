package ObjectRepositories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	@FindBy(xpath="//td[@class='ng-binding' and text()=' Stuffed Frog']/ancestor::tr[@class='cart-item ng-scope']/td[2]")
	private WebElement frogProductPrice;
	
	@FindBy(xpath="//td[@class='ng-binding' and text()=' Fluffy Bunny']/ancestor::tr[@class='cart-item ng-scope']/td[2]")
	private WebElement bunnyProductPrice;
	
	@FindBy(xpath="//td[@class='ng-binding' and text()=' Valentine Bear']/ancestor::tr[@class='cart-item ng-scope']/td[2]")
	private WebElement bearProductPrice;
	
	@FindBy(xpath="//td[@class='ng-binding' and text()=' Stuffed Frog']/ancestor::tr[@class='cart-item ng-scope']/td[4]")
	private WebElement frogSubtotal;
	
	@FindBy(xpath="//td[@class='ng-binding' and text()=' Fluffy Bunny']/ancestor::tr[@class='cart-item ng-scope']/td[4]")
	private WebElement bunnySubtotal;
	
	@FindBy(xpath="//td[@class='ng-binding' and text()=' Valentine Bear']/ancestor::tr[@class='cart-item ng-scope']/td[4]")
	private WebElement bearSubtotal;
	
	@FindBy(xpath="//strong[@class='total ng-binding']")
	private WebElement total;
	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getfrogProductPrice() {
		return frogProductPrice;
	}

	public WebElement getbunnyProductPrice() {
		return bunnyProductPrice;
	}

	public WebElement getbearProductPrice() {
		return bearProductPrice;
	}

	public WebElement getTotal() {
		return total;
	}

    public WebElement getfrogSubtotal() {
		return frogSubtotal;
	}

	public WebElement getbunnySubtotal() {
		return bunnySubtotal;
	}

	public WebElement getbearSubtotal() {
		return bearSubtotal;
	}
	
	
	

}
