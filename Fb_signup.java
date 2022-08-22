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

	@Test

	public void facebook_signup() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("Sachin");
		driver.findElement(By.name("lastname")).sendKeys("Tendulkar");
		driver.findElement(By.name("reg_email__")).sendKeys("sacten12@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sacten12@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("password_step_input")).sendKeys("123456789");
		Thread.sleep(3000);
		driver.findElement(By.id("day")).sendKeys("29");
		driver.findElement(By.id("month")).sendKeys("May");
		Thread.sleep(1000);
		driver.findElement(By.id("year")).sendKeys("1997");
		Thread.sleep(5000);
		driver.findElement(By.name("sex")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("websubmit")).click();

	}

}
