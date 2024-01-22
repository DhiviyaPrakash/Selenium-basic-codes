package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		WebElement newTabClick = driver.findElement(By.id("tabButton"));
		newTabClick.click();
		String parentWindow =driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for(String childWindow :allWindows)
		{
			if(!parentWindow.equals(childWindow))
			{
				driver.switchTo().window(childWindow);
				WebElement childTabText = driver.findElement(By.id("sampleHeading"));
				System.out.println(childTabText.getText());
			}
		}
		driver.switchTo().window(parentWindow);
		

	}
 
}
