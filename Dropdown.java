package selenium.automation107;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class List_Box_Test {

	public static WebDriver driver;

	@BeforeTest
	public void browserlaunch() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\Selenium Automation\\\\automation107\\\\Driver\\\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void list_box_example() {

		driver.get("file:///C:/Users/91762/OneDrive/Desktop/dropdown.html");
		WebElement list = driver.findElement(By.id("mtr"));
		Select s = new Select(list);
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println("Number of elements present inside the listbox is : " + size);
		for (WebElement webElement : options) {
			String text = webElement.getText();
			System.out.println(text);
		}
		s.selectByIndex(0);
		s.selectByValue("v");
		System.out.println(s);
		s.selectByVisibleText("POORI");
		System.out.println("*****Print all selected options****");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		int size2 = allSelectedOptions.size();
		System.out.println("Number of items that is selected in the list box is : " + size2);
		System.out.println(" Selected items are printed below ");
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());
		}
		System.out.println("check whether it is a multiple select listbox or not");
		boolean multiple = s.isMultiple();
		System.out.println(multiple + " yes , it is multi select");
		if (multiple) {
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			System.out.println(firstSelectedOption.getText() + "is the first selected item in the list box");
			s.deselectByIndex(0);
			WebElement firstSelectedOption1 = s.getFirstSelectedOption();
			System.out.println(firstSelectedOption1.getText() + " is the first selected item");
			s.deselectByValue("v");
			WebElement firstSelectedOption2 = s.getFirstSelectedOption();
			System.out.println(firstSelectedOption2.getText() + " is the first selected item");
			s.deselectByVisibleText("POORI");
		}
		driver.close();

	}

	@Test
	public void printlistvalues_sorted_order() {
		driver.get("file:///C:/Users/91762/OneDrive/Desktop/dropdown.html");
		WebElement listElement = driver.findElement(By.id("mtr"));
		Select s = new Select(listElement);
		List<WebElement> allOptions = s.getOptions();
		int count = allOptions.size();
		System.out.println(count);
		System.out.println("-----print the values in the list ----");
		ArrayList<String> list = new ArrayList<String>();
		for (WebElement option : allOptions) {
			String text = option.getText();
			System.out.println(text);
			list.add(text);
		}
		Collections.sort(list);
		System.out.println("-----print the value in sorted order----");
		for (String value : list) {
			System.out.println(value);
		}
		driver.close();

	}

	@Test
	public void print_unique_element_in_the_listbox() {
		driver.get("file:///C:/Users/91762/OneDrive/Desktop/dropdown.html");
		WebElement listElement = driver.findElement(By.id("mtr"));
		Select s = new Select(listElement);
		List<WebElement> allOptions = s.getOptions();
		int count = allOptions.size();
		System.out.println(count);
		System.out.println("-----print the values in the list ----");
		HashSet<String> allElements = new HashSet<String>();
		for (WebElement option : allOptions) {
			String text = option.getText();
			System.out.println(text);
			allElements.add(text);
		}
		System.out.println(allElements);
		driver.close();
	}

}
