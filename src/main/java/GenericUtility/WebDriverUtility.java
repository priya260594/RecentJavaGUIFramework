package GenericUtility;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	public void moveToElementAndClick(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).click().perform();
	}
	public void waitForElementToPresent(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void scrollToTop(WebDriver driver) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,0);");
	}
	public void scrollToDown(WebDriver driver) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}

	public float roundOfNumber(float value) {
		BigDecimal roundedValue= new BigDecimal(value).setScale(2, RoundingMode.HALF_UP);
		float d=roundedValue.floatValue();
		return d;
	}
	public float roundOfNumberMath(float value) {
		return (float) (Math.round(value * 100.0)/100.0);
	}
	public String screenshotForReport(WebDriver driver,String testName) throws Throwable {
		TakesScreenshot ts=(TakesScreenshot)driver;
		String path=ts.getScreenshotAs(OutputType.BASE64);
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/"+testName+new Date().toString().replace(" ", "_").replace(":", "_")+".png");
		FileUtils.copyFile(src, dest);
		return path;
		
	}
}
