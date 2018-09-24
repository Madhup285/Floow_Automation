package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class conductingsearch {

	public static void main(String[] args){
WebDriver driver =new FirefoxDriver();
Sleeper.sleepTight(4000);
	driver.get("http://automationpractice.com/index.php");
	
	driver.manage().window().maximize();

	driver.findElement(By.id("search_query_top")).sendKeys("printed dresses");
	driver.findElement(By.xpath("html/body/div[1]/div[1]/header/div[3]/div/div/div[2]/form/button")).click();
	}
	
}
