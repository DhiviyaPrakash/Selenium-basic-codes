package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		List<WebElement> tableHeader = driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr//th"));
		for(int i=0;i<tableHeader.size();i++)
		{
			String headerText = tableHeader.get(i).getText();
			System.out.print(headerText + " ");
		}
		System.out.println();
		List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td"));
		for(int j=0;j<tableRows.size();j++)
		{
			String row1Text = tableRows.get(j).getText();
			System.out.print(row1Text + " ");
		}
		System.out.println();
		List<WebElement> tableColumn =driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		for(int k=0;k<tableColumn.size();k++)
		{
			String column1Text =tableColumn.get(k).getText();
			System.out.println(column1Text);
		}
		//Dynamic table find
		List<WebElement> tableColumnName =driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));//
		for(int l=0;l<tableColumnName.size();l++)
		{
			if(tableColumnName.get(l).getText().equals("Ashton Cox")) //Searching for aSingle name
			{
				String locator = "//table[@id='dtBasicExample']//tbody//tr["+(l+1)+"]//td[1]";
				System.out.println(locator);
				WebElement name = driver.findElement(By.xpath(locator));
				System.out.println(name.getText());

			}
		}
		//driver.close();

	}

}
