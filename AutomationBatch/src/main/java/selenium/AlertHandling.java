package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php/r/n");
		driver.manage().window().maximize();
		WebElement cliclMeButton = driver.findElement(By.xpath("//button[@class = 'btn btn-success']"));
		cliclMeButton.click();
		driver.switchTo().alert().accept();
		WebElement clickMeButton2 = driver.findElement(By.xpath("//button[@class = 'btn btn-warning']"));
		clickMeButton2.click();
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().dismiss();
		WebElement clickMeButton3 = driver.findElement(By.xpath("//button[@class = 'btn btn-danger']"));
		clickMeButton3.click();
		driver.switchTo().alert().sendKeys("hello");
		/*Alert alertSend = driver.switchTo().alert();
		alertSend.sendKeys("hello");
		alertSend.accept();*/
		driver.switchTo().alert().accept();

	}

}
