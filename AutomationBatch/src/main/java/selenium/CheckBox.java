package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();
		WebElement singleCheckBox = driver.findElement(By.id("gridCheck"));
		singleCheckBox.click();
		boolean checkBoxSelectedOrNot = singleCheckBox.isSelected();
		System.out.println(checkBoxSelectedOrNot);
		boolean checkBoxEnabledOrNot = singleCheckBox.isEnabled();
		System.out.println(checkBoxEnabledOrNot);
		WebElement checkBoxOne = driver.findElement(By.id("check-box-one"));
		checkBoxOne.click();
		WebElement checkBoxTwo = driver.findElement(By.xpath("//input[@id ='check-box-two']"));
		checkBoxTwo.click();
		WebElement checkBoxThree = driver.findElement(By.id("check-box-three"));
		checkBoxThree.click();
		WebElement checkBoxFour = driver.findElement(By.id("check-box-four"));
		checkBoxFour.click();
		WebElement selectAllButton = driver.findElement(By.xpath("//input[@value ='Select All']"));
		selectAllButton.click();
		WebElement unselectAllButton = driver.findElement(By.xpath("//input[@value ='Unselect All']"));
		unselectAllButton.click();
		driver.close();

	}

}
