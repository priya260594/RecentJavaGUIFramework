package interview_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MicTestPermissionHandling {

	public static void main(String[] args) {
		FirefoxOptions option=new FirefoxOptions();

//		option.addArguments("--use-fake-ui-for-media-stream");
//		option.addArguments("--disable-media-stream");
//		option.addArguments("--use-fake-device-for-media-stream");
		option.addPreference("media.navigator.streams.fake", true);
		option.addPreference("media.navigator.permission.disabled", true);

		option.addArguments("media-navigator");
		WebDriver driver=new FirefoxDriver(option);
		driver.get("https://mictests.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("mic-launcher"))));
		driver.findElement(By.id("mic-launcher")).click();
		
	}

}
//HashMap<String,Integer> contentSettings=new HashMap<String,Integer>();
//HashMap<String,Object> profile=new HashMap<String,Object>();
//HashMap<String,Object> prefs=new HashMap<String,Object>();
//
//contentSettings.put("notifications", 1);
//profile.put("managed_default_content_settings", contentSettings);
//prefs.put("profile", profile);
//option.setExperimentalOption("prefs", prefs);