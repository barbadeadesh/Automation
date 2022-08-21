package selenium.automation107;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook_Automation_Test {

	@Test
	public void facebook_login() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("ab12@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("12345");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();

	}

}
