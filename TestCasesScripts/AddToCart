package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Addtocart {

	public static void main(String[] args){
	 WebDriver driver=new FirefoxDriver();
	 
	 driver.get("http://automationpractice.com/index.php");
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.id("email")).sendKeys("palconda@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("lkkl123");
		driver.findElement(By.id("SubmitLogin")).click();
	driver.findElement(By.xpath("html/body/div[1]/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a"));
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("html/body/div[1]/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a"))).click().build().perform();
	driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li/div/div[2]")).click();
	//tshirts//
	driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/div[2]/a[1]/span")).click();
	Sleeper.sleepTight(4000);
	driver.findElement(By.xpath("html/body/div[1]/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span")).click();
	
	Sleeper.sleepTight(4000);
	
	//driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/p[2]/a[1]/span")).click();
	driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/p[2]/a[1]/span")).click();
	driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/form/p/button")).click();
	driver.findElement((By.id("cgv" ))).click();
	driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/p/button")).click();
	driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/div[3]/div[1]/div/p/a")).click();
	//driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/form/p/button")).click();
	driver.findElement((By.id("cart_navigation"))).click();
	System.out.println("successfully payment done");
	

	
		
		
	}
}
