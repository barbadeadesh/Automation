package selenium.automation107;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Web_element_interface_method2 {

	@Test

	public void usernameandpassalignment() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.id("email"));

		int username_Ycordinate = element.getLocation().getY();
		System.out.println(username_Ycordinate);

		WebElement elementt = driver.findElement(By.name("pass"));

		int password_Ycordinate = elementt.getLocation().getY();
		System.out.println(password_Ycordinate);

		if (username_Ycordinate == password_Ycordinate) {
			System.out.println("Both username and password fields are displayed in the same row");
		} else {
			System.out.println("username and password fields are NOT aligned in the same row");

		}
		driver.close();

	}

	@Test

	public void fbpage_heightandwidth_validate() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement element = driver.findElement(By.id("email"));
		// store the height of username
		int username_height = element.getSize().getHeight();
		// store the width of username
		int username_width = element.getSize().getWidth();
		System.out.println(username_height);
		System.out.println(username_width);

		WebElement elementt = driver.findElement(By.name("pass"));
		// store the height of password
		int password_height = elementt.getSize().getHeight();
		// store the width of password
		int password_width = elementt.getSize().getWidth();
		System.out.println(password_height);
		System.out.println(password_width);

		if (username_height == password_height && username_width == password_width) {
			System.out.println("Username and password fields are aligned");
		} else {
			System.out.println("Username and password fields are NOT aligned");

		}
		driver.close();
	}

	@Test

	public void mobilenofield_usernamefield() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.id("email"));
		int username_width = element.getSize().getWidth();
		System.out.println(username_width);

		WebElement elementt = driver
				.findElement(By.xpath("//input[contains(@aria-label,'Email address or phone number')]"));
		int mobNumWidth = elementt.getSize().getWidth();
		System.out.println(mobNumWidth);

		if (username_width == mobNumWidth) {
			System.out.println("Size of Both username and password fields are same\" +username_width+\" = \r\n"
					+ "\" + mobNumWidth");
		} else {
			System.out.println("Size of username and password fields are NOT same that is : " + username_width
					+ " Not equals to " + mobNumWidth);

		}
		driver.close();
	}

	@Test

	public void active_element() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("Adesh Barbade");
		Thread.sleep(3000);
		driver.close();

	}

	@Test

	public void remove_element_by_using_sendkeys() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("Adesh07");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("Adesh Barbade");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL + "a");
		driver.findElement(By.id("email")).sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		driver.close();

	}

	@Test

	public void tooltip_text() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement Checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));

		String tooltipText = Checkbox.getAttribute("title");
		System.out.println(tooltipText);
		Thread.sleep(2000);
		driver.close();

	}

	@Test

	public void checkbox_selection() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement KeepMeLogIN_Checkbox = driver.findElement(By.name("remember"));
		// select the checkbox
		KeepMeLogIN_Checkbox.click();

		if (KeepMeLogIN_Checkbox.isSelected()) {
			System.out.println("Checkbox is selected");
		} else {
			System.out.println("Checkbox is NOT selected");
		}
		driver.close();

	}

	@Test

	public void username_box_is_enableornot() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement UN = driver.findElement(By.id("username"));
		if (UN.isEnabled()) {
			System.out.println("Username text box is enabled");
		} else {
			System.out.println("Username text box is disabled");
		}
		driver.close();
	}

	@Test

	public void print_the_version() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String version = driver.findElement(By.xpath("//nobr[contains(text(),'actiTIME')]")).getText();
		System.out.println("Version of actitime on login page is : " + version);
		driver.close();

	}

	@Test
	public void click_on_button_by_click() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("vk18@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("mahi07");
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(1000);
		driver.close();

	}

	@Test
	public void click_on_button_by_sekdkeys() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("vk18@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("mahi07");
		Thread.sleep(1000);
		driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.close();

	}

	@Test
	public void click_on_button_by_submit() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("vk18@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("mahi07");
		Thread.sleep(1000);
		driver.findElement(By.name("login")).submit();
		Thread.sleep(1000);
		driver.close();

	}

	@Test

	public void erro_message_color() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");

	}
}