package testClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase03 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Velocity class\\\\Automation class\\\\Automation\\\\Driver\\\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	     driver.manage().window().maximize();
	     Thread.sleep(2000);
	     ((JavascriptExecutor)driver).executeScript("scroll(0,100)");
	     Thread.sleep(2000);
	     ((JavascriptExecutor)driver).executeScript("scroll(0,-100)");
	     driver.close();
	}

}
