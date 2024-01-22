package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		List<WebElement> tableHeader = driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr//th"));
		for (int i = 0; i < tableHeader.size(); i++) {
			String headerText = tableHeader.get(i).getText();
			System.out.print(headerText + "   ");
		}
		System.out.println();

		// Get all the table row elements from the table
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr"));
		for (int j = 0; j < allRows.size(); j++) {
			System.out.println(allRows.get(j).getText() + " ");
		}

	}

}
