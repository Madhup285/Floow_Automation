package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Navigation {

public static void main(String[] args){
	WebDriver driver =new FirefoxDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("html/body/div[1]/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a")).click();
	
	driver.navigate().refresh();
	driver.findElement(By.xpath("html/body/div[1]/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a")).click();
	driver.navigate().back();
	System.out.println("now page navigate to backward successfully");
	driver.navigate().forward();
	System.out.println("now page navigate to forward successfully");
	Sleeper.sleepTight(2000);
	driver.findElement(By.xpath("html/body/div[1]/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a")).click();
	
	
	
	
	
	
	
}
}
