package interview_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class IBM_LoginTestWithAPI {
	@Test
	public void loginPageTest() {
		/*`
		 * Validation through UI
		 */
		//String expectedText="HomePage";
		
		WebDriver driver=new ChromeDriver();
	    try {
		driver.get("http://testEnv.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("username")).sendKeys("username");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("submitButton")).click();
		//String actualText=driver.findElement(By.id("")).getText();
		//Assert.assertEquals(actualText, expectedText);
		String pageTitle=validateThroughApi();
		if(pageTitle.equals("Home")) {
			System.out.println("Gui validated through API");
		}else {
			System.out.println("Gui not validated through API");
		}} catch(Exception e) {
			e.printStackTrace();
		}finally {
			driver.quit();
		}

}
	/*
	 * Validation through API
	 */
	public static String validateThroughApi() {
	String apiUrl="http://testEnv.com/validatePage";
	Response res=RestAssured.when().get(apiUrl);
	if(res.getStatusCode()!=200) {
		throw new RuntimeException("Api request got failed with "+res.getStatusCode());
	}
	String pageTitle=res.jsonPath().getString("pageTitle");
	return pageTitle;
	}
}
	
