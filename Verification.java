package selenium.automation107;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class verification_Test {

	@Test

	public void uniqueelement() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("sacten@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("Ab8888073562");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		WebElement loginbutton = driver.findElement(By.name("login"));
		if (loginbutton.isDisplayed()) {
			System.out.println("Home page is displayed");
		} else {
			System.out.println("Home page is NOT displayed");
		}

	}

	@Test

	public void currenturl() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("sacten@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("Ab8888073562");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		String expectedUrl = "login";
		String actualUrl = driver.getCurrentUrl();
		if (actualUrl.contains(expectedUrl)) {
			System.out.println("Home page is displayed");
		} else {
			System.out.println("Home page is NOT displayed");
		}

	}

	@Test

	public void title() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("sacten@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("Ab8888073562");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		String expectedTitle = "Log in to Facebook";
		String actualTitle = driver.getTitle();

		if (actualTitle.contains(expectedTitle)) {
			System.out.println("Home page is displayed");
		} else {
			System.out.println("Home page is NOT displayed");

		}

	}
}