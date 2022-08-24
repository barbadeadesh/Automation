package selenium.automation107;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class contains_Function_Test {

	@Test
	public void fb_login_text() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[contains(text(),'29')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[contains(text(),'May')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[contains(text(),'1997')]")).click();
	}

	@Test
	public void fb_login_attribute() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[contains(@value,'29')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[contains(@value,'1997')]")).click();

	}
}
