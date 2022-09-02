package selenium.automation107;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Javascript_Executor {

	@Test

	public void scroll_up_and_down() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.javatpoint.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 1; i < 10; i++) {

			js.executeScript("window.scrollBy(0, 1000)");
			Thread.sleep(3000);
		}
		for (int i = 1; i < 10; i++) {

			js.executeScript("window.scrollBy(0, -1000)");
			Thread.sleep(3000);
		}
	}

	@Test

	public void enter_Text() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/91762/OneDrive/Desktop/webpage.html");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);

		js.executeScript("document.getElementById('t1').value='Adesh'");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('t2').value=' '");
		js.executeScript("document.getElementById('t2').value='Barbade'");

		js.executeScript("document.getElementById('t2').type='button'");

	}

	@Test
	public void bottom_of_page() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		// driver.findElement(By.id("close")).click();
		// select an element which is present at the bottom of the page
		WebElement element = driver.findElement(By.name("login"));
		int x = element.getLocation().getX();
		int y = element.getLocation().getY();
		System.out.println("X coordinate is :" + x + " and Y coordinate is :" + y);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + "," + y + ")");
		Thread.sleep(3000);
		element.click();
		driver.close();
	}
}