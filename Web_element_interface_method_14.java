package selenium.automation107;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v101.systeminfo.model.Size;
import org.testng.annotations.Test;

public class web_Element_Interface_Method {

	@Test

	public void getlocation() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		Point point = driver.findElement(By.name("login")).getLocation();

		System.out.println("The X co-ordinate of login Button is=> " + point.getX());
		System.out.println("The X co-ordinate of login Button is=> " + point.getY());
		driver.close();
	}

	@Test

	public void Getsize() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		Dimension size = driver.findElement(By.name("login")).getSize();

		System.out.println("The Height of login Button is=> " + size.getHeight());
		System.out.println("The Width  of login Button is=> " + size.getWidth());
		driver.close();
	}

	@Test

	public void IsDisplay() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		System.out.println(driver.findElement(By.name("login")).isDisplayed());
		driver.close();
	}

	@Test

	public void IsEnable() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		System.out.println(driver.findElement(By.name("login")).isEnabled());
		driver.close();
	}

	@Test
	public void SendKey() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();

		driver.findElement(By.name("email")).sendKeys("vk18@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("mahi7");
		Thread.sleep(2000);
		driver.close();

	}

	@Test
	public void Clear() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();

		driver.findElement(By.name("email")).sendKeys("vk18@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("mahi7");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).clear();
		Thread.sleep(2000);
		driver.close();

	}

	@Test

	public void IsSelected() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		System.out.println(driver.findElement(By.name("login")).isSelected());
		driver.close();
	}

	@Test

	public void getattribute() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		String textonButton = driver.findElement(By.name("login")).getAttribute("name");
		System.out.println("The value of name attribute is:" + textonButton);
		driver.close();
	}

	@Test

	public void GetText() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		String text = (driver.findElement(By.name("login")).getText());
		System.out.println(text);
		driver.close();
	}

	@Test

	public void GetTagname() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		String text = (driver.findElement(By.name("login")).getTagName());
		System.out.println(text);
		driver.close();
	}

	@Test
	public void Click() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		driver.close();

	}

	@Test
	public void Submit() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("vk18@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("mahi7");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).submit();
		Thread.sleep(2000);
		driver.close();

	}

	@Test

	public void GetCssValue() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		String lineheight = (driver.findElement(By.name("login")).getCssValue("line-Height"));
		System.out.println(lineheight);
		driver.close();
	}

	@Test

	public void getrect() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement element = driver.findElement(By.name("login"));

		Rectangle rect = element.getRect();

		System.out.println("The X co-ordinate of login Button is=> " + rect.getX());
		System.out.println("The X co-ordinate of login Button is=> " + rect.getY());
		System.out.println("The Height of login Button is=> " + rect.getHeight());
		System.out.println("The Width  of login Button is=> " + rect.getWidth());
		driver.close();
	}

}
