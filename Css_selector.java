package selenium.automation107;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class facebook_Css_SelectorTest {

	@Test
	public void css() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#email")).sendKeys("adeshbarbade7@gmail.com");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("Adesh@8888073562@gmail.com");
		driver.findElement(By.cssSelector("button[name='login']"));
		Thread.sleep(2000);
		driver.close();
	}
}
