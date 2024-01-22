package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","driver Path");
		//System.setProperty("webdriver.chrome.driver","D:\\Driver\\chrome\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.edge.driver","D:\\Driver\\Microsoft Edge\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		System.setProperty("webdriver.gecko.driver","D:\\Driver\\Firefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		/*driver.navigate().to("https://www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		//driver.close();
		driver.quit();
		
	}

}
