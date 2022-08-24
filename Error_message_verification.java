package selenium.automation107;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class error_Message_Validation_Test {

	@Test
	public void fb_login_page() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		String actual_result = driver.findElement(By.xpath("//a[text()='Find your account and log in.']")).getText();
		String expected_result = "Find your account and log in.";
		Assert.assertEquals(actual_result, expected_result);
	}
}
