package selenium.automation107;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Table_Test {

	@Test

	public void table() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\91762\\OneDrive\\Desktop\\table1.html");
		// TOTAL ROW'S
		List<WebElement> allRows = driver.findElements(By.xpath("//tr"));
		int totalRows = allRows.size();
		System.out.println("total number of rows present in the table is :" + totalRows);

		// TOTAL COLOUMN
		List<WebElement> allColumns = driver.findElements(By.xpath("//th"));
		int totalColumns = allColumns.size();
		System.out.println("Total number of columns in the table is :" + totalColumns);

		// Count number of cells present in the table
		List<WebElement> allCells = driver.findElements(By.xpath("//th|//td"));
		int totalCells = allCells.size();
		System.out.println("Total number of cells present in the table is :" + totalCells);

		// ONLY NUMBERS

		int countNumberValue = 0;
		int sum = 0;
		for (WebElement cell : allCells) {
			String cellValue = cell.getText();
			try {
				int number = Integer.parseInt(cellValue);
				System.out.println(" " + number);
				countNumberValue++;
				sum = sum + number;
			} catch (Exception e) {
			}
		}
		// TOTAL NUMERIC VALUE
		System.out.println("Total count of numeric values is :" + countNumberValue);

		// SUM OF NUMERIC VALUE
		System.out.println("Total sum of all the numeric values is :" + sum);
		driver.close();

	}

	@Test

	public void sum_of_marks() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium Automation\\automation107\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\91762\\OneDrive\\Desktop\\table2.html");
		
        // Count number of cells present in the table
		List<WebElement> allCells = driver.findElements(By.xpath("//th|//td"));
		int totalCells = allCells.size();
		System.out.println("Total number of cells present in the table is :" + totalCells);

		// ONLY NUMBERS

		int countNumberValue = 0;
		int sum = 0;
		for (WebElement cell : allCells) {
			String cellValue = cell.getText();
			try {
				int number = Integer.parseInt(cellValue);
				System.out.println(" " + number);
				countNumberValue++;
				sum = sum + number;
			} catch (Exception e) {
			}
		}
		// TOTAL NUMERIC VALUE
		System.out.println("Total count of numeric values is :" + countNumberValue);

		// SUM OF NUMERIC VALUE
		System.out.println("Total sum of all the numeric values is :" + sum);
		driver.close();

	}
}
