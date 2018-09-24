
package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Login {
	
	public static void main(String[] args){
WebDriver driver =new FirefoxDriver();
Sleeper.sleepTight(4000);
	driver.get("http://automationpractice.com/index.php");
	
	driver.manage().window().maximize();
	driver.findElement(By.xpath("html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
	driver.findElement(By.id("email")).sendKeys("palconda@gmail.com");
	driver.findElement(By.id("passwd")).sendKeys("lkkl123");
	driver.findElement(By.id("SubmitLogin")).click();
	//signout
	//driver.findElement(By.xpath("html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[2]/a")).click();
		// check sing out //
}
}
