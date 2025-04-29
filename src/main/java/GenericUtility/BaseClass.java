package GenericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import ObjectRepositories.ContactPage;
import ObjectRepositories.ContactVerificationPage;
import ObjectRepositories.HomePage;

public class BaseClass {
	public WebDriver driver;
	public static WebDriver sDriver;
	public PropertyfileUtility fUtil=new PropertyfileUtility();
	public WebDriverUtility wUtil=new WebDriverUtility();
	public ExcelFileutility eUtil=new ExcelFileutility();
	
	@BeforeMethod
	public void configBM()  {
		String BROWSER=fUtil.readDataFromPropertyFile("browser");
		String URL=fUtil.readDataFromPropertyFile("url");
		
		if(BROWSER=="chrome") {
		driver=new ChromeDriver();}
		else if(BROWSER=="firefox") {
			driver=new FirefoxDriver();
		}else if(BROWSER=="edge") {
			driver=new InternetExplorerDriver();
		}else {
			driver=new ChromeDriver();
		}
		sDriver=driver;
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();	
	}
	@AfterMethod
	public void configAM() {
		driver.quit();
	}
	

}
