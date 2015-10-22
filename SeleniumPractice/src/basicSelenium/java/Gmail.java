package basicSelenium.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail 
{

public static void main(String[] args) 
{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
		
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Need help?")).click();
		
		/*driver.findElement(By.id("Email")).sendKeys("seleniumpractice9");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.tagName("input")).sendKeys("testing12345");
		driver.findElement(By.id("signIn")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
		
		driver.findElement(By.xpath(".//*[@id=':2m']/div[2]")).click();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath(".//*[@id=':4u']/div/div[1]/span/a")).click();
		driver.findElement(By.xpath(".//*[@id='ms']/div")).click();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div/div[4]/div[1]/a")).click();
		driver.findElement(By.id("gb_71")).click();*/
		
		driver.close();
			
	}   
}
