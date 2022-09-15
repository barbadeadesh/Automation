package selenium.automation107;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Search_Context_Interface {

	@Test

	public void findElement() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		// get the total number of link elements
		int totalLinks = allLinks.size();
		System.out.println("total number of links present on the web page is : " + totalLinks);
		int visibleLinkCount = 0;
		int hiddenLinkCount = 0;
		// using foreach loop, iterate through all the links
		for (WebElement link : allLinks) {
			// if the link is displayed, then print the text of the link
			if (link.isDisplayed()) {
				visibleLinkCount++;
				System.out.println(visibleLinkCount + " --> " + link.getText());
			} else {
				hiddenLinkCount++;
			}
		}
		System.out.println("Total number of visible links :" + visibleLinkCount);
		System.out.println("Total number of hidden links :" + hiddenLinkCount);
		driver.close();
	}

}
