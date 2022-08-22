package selenium.automation107;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class browser_Launch {

	@Test
	public void edgebrowser() {

		System.setProperty("webdriver.edge.driver", "D:\\Selenium Automation\\automation107\\Driver\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/login/");
	}
}
