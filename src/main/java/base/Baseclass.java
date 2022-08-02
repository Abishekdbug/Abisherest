package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static  WebDriver driver;
	public void getDriver(String browser) {
	switch (browser) {
	case "chrome":
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	break;
	case "firefox":
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
	break;
	case "edge":
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
	default:
	break;
	}
	driver.manage().window();
}
	public void dragAndDrop(WebElement source, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
		}
		public static void hovering(WebElement hover) {
		Actions a = new Actions(driver);
		a.moveToElement(hover).perform();
		}
		public static void rightClick(WebElement rc) {
		Actions a = new Actions(driver);
		a.contextClick(rc).perform();
		}
		public static void doubleClick(WebElement dc) {
		Actions a = new Actions(driver);
		a.doubleClick(dc).perform();
		}
		public static  void mouseClick(WebElement mc) {
		Actions a = new Actions(driver);
		a.click(mc).perform();
		}
}