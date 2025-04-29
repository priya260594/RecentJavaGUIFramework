package interview_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookMyShow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		WebElement location=driver.findElement(By.xpath("//span[contains(text(),'Bengaluru')]"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(location));
		location.click();
		
		driver.findElement(By.xpath("(//h2[contains(text(),'Recommended Movies')]/ancestor::div[@class='sc-133848s-4 kFcBGr']/descendant::div[@class='sc-dv5ht7-0 XmXCP'])[position()=2]")).click();
		driver.findElement(By.xpath("//button[@data-phase='postRelease']/div/span[contains(text(),'Book tickets')]")).click();
		List<WebElement> allDates=driver.findElements(By.xpath("//div[@class='sc-9bxw9f-2 klGhPy']/div[not(@class='sc-6bpksa-0 jHByWH')]"));
		int lastDate=allDates.size()-1;
		System.out.println(allDates.get(lastDate).getText());
		allDates.get(lastDate).click();
	
		JavascriptExecutor js = (JavascriptExecutor) driver;

		long scrollHeight = (long) js.executeScript("return document.body.scrollHeight");
		long scrollStep = 200; // Scroll step in pixels
		long currentPosition = 0;
		while (currentPosition < scrollHeight) {
		    js.executeScript("window.scrollBy(0, arguments[0]);", scrollStep);
		    Thread.sleep(500); // Small delay to simulate smooth scrolling
		    currentPosition += scrollStep;
		}

        js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(3000);
	//	while(driver.findElement(By.xpath("//div[text()='Unable to find what you are looking for?']")).isDisplayed()) {
			
			List<WebElement> threatreNames=driver.findElements(By.xpath("//div[@class='ReactVirtualized__Grid__innerScrollContainer']/div/div/div/div/div/div/div[@class='sc-7o7nez-0 iueRmY']"));
			for(WebElement threatreName:threatreNames) {
				System.out.println(threatreName.getText());
			}
		
	}

}
