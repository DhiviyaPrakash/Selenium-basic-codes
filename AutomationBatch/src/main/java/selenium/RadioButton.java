package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.manage().window().maximize();
		WebElement maleRadioButton = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		maleRadioButton.click();
		WebElement femaleRadioButton = driver.findElement(By.id("inlineRadio2"));
		femaleRadioButton.click();
		WebElement showRadioButton = driver.findElement(By.xpath("//button[text() ='Show Selected Value']"));
		showRadioButton.click();
		boolean maleSelectedOrNot = maleRadioButton.isSelected();
		System.out.println(maleSelectedOrNot);
		boolean femaleSelectedOrNot = femaleRadioButton.isSelected();
		System.out.println(femaleSelectedOrNot);
		boolean maleEnabledOrNot = maleRadioButton.isEnabled();
		System.out.println(maleEnabledOrNot);
		boolean femaleDisplayedOrNot = femaleRadioButton.isDisplayed();
		System.out.println(femaleDisplayedOrNot);
		WebElement maleGenderButton = driver.findElement(By.id("inlineRadio11"));
		maleGenderButton.click();
		WebElement femaleGenderButton = driver.findElement(By.xpath("//input[@id ='inlineRadio21']"));
		femaleGenderButton.click();
		WebElement age1To18 = driver.findElement(By.id("inlineRadio22"));
		age1To18.click();
		WebElement age19To44 = driver.findElement(By.id("inlineRadio23"));
		age19To44.click();
		WebElement age45To60 = driver.findElement(By.id("inlineRadio24"));
		age45To60.click();
		WebElement getresultButton = driver.findElement(By.xpath("//button[text() = 'Get Results']"));
		getresultButton.click();
		boolean maleGenderSelectedOrNot = maleGenderButton.isSelected();
		System.out.println(maleGenderSelectedOrNot);
		boolean femaleGenderSelectedOrNot = femaleGenderButton.isSelected();
		System.out.println(femaleGenderSelectedOrNot);
		boolean maleGenderEnabledOrNot = maleGenderButton.isEnabled();
		System.out.println(maleGenderEnabledOrNot);
		boolean femaleGenderEnabledOrNot = femaleGenderButton.isEnabled();
		System.out.println(femaleGenderEnabledOrNot);
		boolean maleGenderDisplayedOrNot = maleGenderButton.isDisplayed();
		System.out.println(maleGenderDisplayedOrNot);
		boolean femaleGenderDisplayedOrNot = femaleGenderButton.isDisplayed();
		System.out.println(femaleGenderDisplayedOrNot);
		

	}

}
