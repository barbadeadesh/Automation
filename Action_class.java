package selenium.automation107;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action_class {

	@Test

	public void contextClick() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.name("login"));
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
		Thread.sleep(1000);
		actions.contextClick(element).perform();
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		driver.close();
	}

	@Test

	public void MoveToElement() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/");
		WebElement element = driver.findElement(By.id("pass"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
		Thread.sleep(2000);
		WebElement elementt = driver.findElement(By.name("email"));
		elementt.click();
		Thread.sleep(2000);
		driver.close();

	}

	@Test

	public void DragAndDrop() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement element = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement elementt = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(element, elementt).perform();
		Thread.sleep(3000);
		driver.close();
	}

	@Test

	public void DoubleClick() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/");
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(By.name("email"));
		actions.doubleClick(element).perform();
		driver.close();
	}

	@Test

	public void gmail() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://accounts.google.com/v3/signin/challenge/pwd?TL=AKqFyY-gfB7ViEXG22tHWSCYjFXWRf0LDRUe_oNlwlaGn9-hSgd7fPPr59LOjTd1&checkConnection=youtube%3A302%3A0&checkedDomains=youtube&cid=1&continue=https%3A%2F%2Fmail.google.com&dsh=S-2029234601%3A1662013591086540&flowEntry=AddSession&flowName=GlifWebSignIn&hl=en-GB&pstMsg=1&service=mail");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("barbadeadesh1997@gmail.com");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("//input[@type='email']")).sendKeys("Adesh@8888073562");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		driver.close();

	}
}