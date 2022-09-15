package selenium.automation107;

import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Pop_up {

	@Test

	public void alert_popup() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.close();
	}

	@Test

	public void confirm_alert_popup() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		driver.close();
	}

	@Test
	public void File_upload() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		driver.findElement(By.xpath("//input[@type='file'][@multiple='']")).sendKeys("D:\\Doc1.pdf");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='button'][@ng-click='item.upload()']")).click();
		Thread.sleep(3000);
		driver.close();

	}

	/*@Test

	public void File_Upload_AutoIt() throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freepdfconvert.com/pdf-to-word");
		driver.findElement(By.linkText("Choose PDF file")).click();
		Runtime.getRuntime().exec("C:\\Users\\91762\\OneDrive\\Documents\\abc.exe");

	}*/

	@Test

	public void file_download() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", "C:\\Users\\Shree\\Downloads");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver();
		driver.get("http://www.seleniumhq.org/download/");
		Thread.sleep(3000);
		String xp = "32 bit Windows IE";
		driver.findElement(By.linkText(xp)).click();
		driver.close();
	}

	@Test
	public void child_popup() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("Number of browser windows opened on the system is : " + count);
		for (String windowHandle : allWindowHandles) {
			driver.switchTo().window(windowHandle);
			String title = driver.getTitle();
			System.out.println("Window handle id of page -->" + title + " --> is : " + windowHandle);
		}
		Thread.sleep(3000);
		driver.close();

	}

	@Test

	public void child_popup2() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String parentID = driver.getWindowHandle();
		System.out.println("Parent Id :" + parentID);
		driver.findElement(By.linkText("Register now")).click();
		Set<String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("Number of browser windows opened on the system is : " + count);
		for (String windowHandle : allWindowHandles) {
			driver.switchTo().window(windowHandle);
			if (windowHandle.equals(parentID)) {
				driver.close();

			}
		}
	}
}
