
package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	
	public static void main(String[] args){
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get( "http://automationpractice.com/index.php");
 driver.manage().window().maximize();
Sleeper.sleepTight(4000);
driver.findElement(By.xpath("html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
driver.findElement(By.id("email_create")).sendKeys("palconda2@gmail.com");
driver.findElement(By.id("SubmitCreate")).click();
Sleeper.sleepTight(4000);

driver.findElement(By.id("customer_firstname")).sendKeys("lk");
driver.findElement(By.id("customer_lastname")).sendKeys("kl");
driver.findElement (By.id("passwd")).sendKeys("lkkl123");
Sleeper.sleepTight(4000);
Select day =new Select(driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[1]/div/select")));
 day.selectByIndex(13);
 Sleeper.sleepTight(4000);
Select month=new Select(driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[2]/div/select")));
month.selectByValue("3");
Sleeper.sleepTight(4000);
Select year=new Select(driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[3]/div/select")));
year.selectByIndex(11);
driver.findElement(By.id("company")).sendKeys("THEFLOOW");
driver.findElement(By.id("address1")).sendKeys("sheffield","123","56");
driver.findElement(By.id("address2")).sendKeys("hamp","sheffield");
driver.findElement(By.id("city")).sendKeys("sheffiled");
Select state=new Select(driver.findElement(By.id("id_state")));
state.selectByVisibleText("Texas");

driver.findElement(By.id("postcode")).sendKeys("98123");
driver.findElement(By.id("other")).sendKeys("1234567892");
driver.findElement(By.id("phone")).sendKeys("012456789");
driver.findElement(By.id("phone_mobile")).sendKeys("0123456987");
driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/p[14]/input")).sendKeys("Reading");
driver.findElement(By.id("submitAccount")).click();

		
	}

}
