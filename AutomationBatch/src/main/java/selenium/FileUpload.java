package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/selenium/upload/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));//implicit wait
		WebElement chooseFile = driver.findElement(By.id("uploadfile_0"));
		//chooseFile.sendKeys("C:\\Users\\DhiviyaPrakash\\OneDrive\\Pictures\\download.jpg");
		
		Actions obj = new Actions(driver);
	    obj.moveToElement(chooseFile).click().perform();
	  
	    //put path to your image in a clipboard
	   StringSelection s1=new  StringSelection("C:\\Users\\DhiviyaPrakash\\OneDrive\\Pictures\\download.jpg");	 
	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
	   
	   Robot robot = new Robot();
	     robot.delay(1000 );
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     
	     robot.delay(250);
	      robot.keyRelease(KeyEvent.VK_CONTROL);
	      robot.keyRelease(KeyEvent.VK_V);
	     
	     robot.delay(250);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     
	     WebElement iAcceptCheckBox = driver.findElement(By.id("terms"));
	     iAcceptCheckBox.click();
	     WebElement submitButton = driver.findElement(By.id("submitbutton"));
	     submitButton.click();



	}

}
