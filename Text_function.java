package selenium.automation107;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class text_Function_Test {

	@Test
	public void fb_Learnmore() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Learn more']")).click();

	}

	@Test
	public void fb_terms() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Terms']")).click();
	}

	@Test
	public void fb_privacy_policy() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Privacy Policy']")).click();
	}

	@Test
	public void fb_cookies() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Cookies Policy']")).click();
	}

	@Test
	public void fb_day() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='29']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='May']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='1997']")).click();
	}
}