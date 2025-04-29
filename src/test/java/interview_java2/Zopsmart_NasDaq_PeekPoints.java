package interview_java2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zopsmart_NasDaq_PeekPoints {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.nasdaq.com/market-activity/index/ndx");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
//		driver.get("https://www.nasdaq.com/market-activity/economic-calendar");
//		SearchContext shadow_host=driver.findElement(By.xpath("//div[@class='jupiter22-economic-calendar__table']/nsdq-table-accordion")).getShadowRoot();	
//		List<WebElement> cell=shadow_host.findElements(By.cssSelector("tr[role='row']"));
//		
//		for(int i=0;i<cell.size();i++) {
//			
//			System.out.println(cell.get(i).getText()+"------");}
//	    List<WebElement> country=shadow_host.findElements(By.cssSelector("td[role='cell']:nth-child(2)"));
//		List<WebElement> event=shadow_host.findElements(By.cssSelector("td[role='cell']:nth-child(3)"));
//
//		for(int i=0;i<event.size();i++) {
//			System.out.println(country.get(i).getText()+"=======");
//			System.out.println(event.get(i).getText()+"---");
//		}
		
//        // Get the size of the element (width, height, position)
      try {
//            // Open the desired website
//            //driver.get("http://example.com");
//
//            // Wait for the element to be visible (the line or area you want to hover over)
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//          //  WebElement lineElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
            JavascriptExecutor js=(JavascriptExecutor)driver;
            js.executeScript("window.scrollBy(0,500)");
WebElement lineElement=driver.findElement(By.xpath("(//*[local-name()='g']/*[name()='path' and @class='highcharts-plot-line '])[position()=2]"));
System.out.println("done");

        Dimension elementSize = lineElement.getSize();
        System.out.println(elementSize);
        Point elementLocation = lineElement.getLocation();
        System.out.println(elementLocation);
//        int startX = elementLocation.getX();
//        int startY = elementLocation.getY();
//        int width = elementSize.getWidth();
//        int stepSize = 10;  // Small step size to move along the line
//
//        // Create an Actions instance to move the mouse
//        Actions actions = new Actions(driver);
//
//        // Loop to move the mouse step by step along the line
//        for (int i = 0; i < width; i += stepSize) {
//            // Move the mouse to the new position along the x-axis
//            actions.moveToElement(lineElement, startX + i, startY).perform();
//            
//            // Wait briefly for the tooltip to appear
//            WebElement tooltip = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='highcharts-tooltip']/div/span/div/span")));  // Change to the actual tooltip selector
//            String tooltipText = tooltip.getText();
//            
//            // Print the tooltip text at this step
//            System.out.println("Step: " + (i / stepSize + 1) + " | Tooltip text: " + tooltipText);
//            
//            // Optional: You can add a small delay to simulate natural mouse movement
//            try {
//                Thread.sleep(500); // sleep for 500 milliseconds between moves
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

    } finally {
        // Close the browser
        driver.quit();}
		
		//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript(null, args)
//
//        // Find the graph's line or path element (replace with correct XPath if different)
//        WebElement graphLine = driver.findElement(By.xpath("//svg//path"));  // Example for SVG path, adjust as needed
//
//        // Create an Actions object to simulate mouse movements
//        Actions actions = new Actions(driver);
//
//        // Get the starting point of the path (can also be the first data point, or any point along the path)
//        // You can use JavaScript to get the exact path points, but for simplicity, we'll assume basic hover functionality
//        double moveX = 0;
//        double moveY = 0;;

	}

}
