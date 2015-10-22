package basicSelenium.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PaytmEx
{
	public static void main(String[] args) 
	{
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.paytm.com");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
			driver.manage().window().maximize();
			
			driver.findElement(By.cssSelector(".login")).click();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.MILLISECONDS);
			
			/*driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/ul/li[1]")).click();
			driver.findElement(By.id("input_10")).sendKeys("9543736528");
			driver.findElement(By.id("input_11")).sendKeys("mouni54321");
			driver.findElement(By.tagName("button")).click();
			
			//driver.findElement(By.className("selected one-tab")).sendKeys("952866");
		
			driver.findElement(By.cssSelector(".leftmenu.style-3>ul>li>a")).click();
			driver.findElement(By.cssSelector(".leftmenu.style-3>ul>li>a")).click();
			*/
			
			
           driver.close();
			
			
}
}
   //  