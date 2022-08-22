package selenium.automation107;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class launching_Browser_user_Input_Test {

	@Test

	public void userinput() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Browswer Name");

		String Browser = sc.nextLine();
		System.out.println("User is entered the browser name: " + Browser);

		WebDriver driver;

		if (Browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/login/");

			// title of page

			String title = driver.getTitle();
			System.out.println("the title of the page is :" + title);

		} else if (Browser.equals("Edge")) {
			System.setProperty("webdriver.edge.driver",
					"D:\\Selenium Automation\\automation107\\Driver\\msedgedriver.exe");

			driver = new EdgeDriver();
			String currentUrl = driver.getCurrentUrl();
			System.out.println("the URL of the page is :" + currentUrl);
		} else {
			System.out.println("User Enter Invalid Browser");
		}

	}
}
