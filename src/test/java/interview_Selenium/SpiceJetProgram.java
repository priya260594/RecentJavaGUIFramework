package interview_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetProgram {

	public static void main(String[] args) {
		
//		HashMap<String,Integer> prefs=new HashMap<>();
//		prefs.put("profile.default_content_setting_values.geolocation", 2);
//		ChromeOptions option=new ChromeOptions();	
//		option.setExperimentalOption("prefs",prefs);
//		
		String fromPlace="MAA";
		String toPlace="BLR";
		String startmonth="March";
		String date="24";
		String endmonth="April";
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//div[text()='round trip']/../preceding-sibling::div[@class='css-1dbjc4n r-zso239']//*[local-name()='svg']")).click();
		WebElement from=driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/descendant::input[@autocapitalize='sentences']"));
		from.click();
		from.sendKeys(fromPlace);
		driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']/descendant::input[@autocapitalize='sentences']")).sendKeys(toPlace);
		driver.findElement(By.xpath("//div[contains(text(),'"+startmonth+"') and text()='2025']/ancestor::div[@class='css-1dbjc4n r-18u37iz' and not(@style='width: 660px;')]/descendant::div[text()='"+date+"']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'"+endmonth+"') and text()='2025']/ancestor::div[@class='css-1dbjc4n r-18u37iz' and not(@style='width: 660px;')]/descendant::div[text()='"+date+"']")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Search Flight')]")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']/div[contains(text(),'1 Adult')]")).click();
		driver.findElement(By.xpath("//div[text()='Adult']/parent::div[@class='css-1dbjc4n']/following-sibling::div/div[@data-testid='Adult-testID-plus-one-cta']")).click();
		

	}

}
