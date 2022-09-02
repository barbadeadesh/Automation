package selenium.automation107;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frame_handling {

	@Test

	public void text_Into_Element_Byusing_Index() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91762/OneDrive/Desktop/page2.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("t1")).sendKeys("Adesh");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("Barbade");
		Thread.sleep(1000);
		driver.close();

	}

	@Test

	public void text_Into_Element_Byusing_idAttribute() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91762/OneDrive/Desktop/page2.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t1")).sendKeys("Adesh");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("Barbade");
		Thread.sleep(1000);
		driver.close();

	}

	@Test

	public void text_Into_Element_Byusing_nameAttribute() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91762/OneDrive/Desktop/page2.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.switchTo().frame("n1");
		driver.findElement(By.id("t1")).sendKeys("Adesh");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("Barbade");
		Thread.sleep(1000);
		driver.close();

	}

	@Test

	public void text_Into_Element_Byusing_WebElement() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91762/OneDrive/Desktop/page2.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.className("c1"));
		driver.switchTo().frame(element);
		driver.findElement(By.id("t1")).sendKeys("Adesh");
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.id("t2")).sendKeys("Barbade");
		Thread.sleep(1000);
		driver.close();

	}
}
