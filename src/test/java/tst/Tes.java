package tst;


import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.Baseclass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Tes extends Baseclass{

	Baseclass obj = new Baseclass();
	
	
	
	@Test
	public void login() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
   driver.get("https://www.facebook.com/");
 
	}
	
	@Test
	public void clicking() {
	WebElement obj = driver.findElement(By.id("email"));
	obj.sendKeys("Abishek");
	WebElement obj1 = driver.findElement(By.xpath("//button[@value='1']"));
	obj.click();
	 

	}
}
