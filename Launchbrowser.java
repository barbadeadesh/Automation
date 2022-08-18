package selenium.automation107;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser_test {

	@Test

	public void launchbrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");

		// title of page

		String title = driver.getTitle();
		System.out.println("the title of the page is :" + title);

		// get url of page
		String currentUrl = driver.getCurrentUrl();
		System.out.println("the URL of the page is :" + currentUrl);

		// source code of page
		String pageSource = driver.getPageSource();
		System.out.println("the source code of the page is :" + pageSource);

		String h1 = driver.getWindowHandle();// original handle
		System.out.println("First handle = " + h1);

		Thread.sleep(2000);
		driver.close();

	}

}
