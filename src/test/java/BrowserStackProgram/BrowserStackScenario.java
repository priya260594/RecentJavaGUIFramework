package BrowserStackProgram;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserStackScenario {

	public static void main(String[] args) throws MalformedURLException {
//	String username="priyankab_WNk6uD";
//	String password="Egp4TELTQo9njuCALqfn";
	
	MutableCapabilities capabilities = new MutableCapabilities();
	HashMap<String, Object> bstackOptions = new HashMap<String, Object>();
	capabilities.setCapability("browserName", "Chrome");
	bstackOptions.put("os", "Linux");
	bstackOptions.put("osVersion", "11");
	bstackOptions.put("browserVersion", "132.0");
	bstackOptions.put("userName", "priyankab_WNk6uD");
	bstackOptions.put("accessKey", "Egp4TELTQo9njuCALqfn");
	bstackOptions.put("consoleLogs", "info");
	capabilities.setCapability("bstack:options", bstackOptions);

	RemoteWebDriver driver=new RemoteWebDriver(new URL("https://hub-cloud.browserstack.com/wd/hub"),capabilities);
	driver.get("https://www.amazon.in/");	
	System.out.println(driver.getTitle());
	
	
	}
}
