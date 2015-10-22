package basicSelenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatingStrategy1 
{

	public static void main(String []args) throws InterruptedException
	{
        WebDriver driver =new FirefoxDriver();
        Thread.sleep(2000);
        driver.get("http://www.naukri.com/");	
        
      //Locating elements by css selector
        /* driver.findElement(By.cssSelector("input.orangeBtn"))
        .click();
        Thread.sleep(2000);  */
 
        //Locating elements by tagName
        /* driver.findElement(By.tagName("input")).getSize();
        System.out.println(driver.findElement(By.tagName("li")).getSize());
        //output:(85, 89)   */
        
       //Locating by classNmae
        /* driver.findElement(By.className("active")).getSize();
        System.out.println(driver.findElement(By.className("active")).getSize());
        //output:(114, 41)  
        driver.findElement(By.className("sugInp")).sendKeys("Testing,Selenium"); */
        
        //Locating by DOM
        
	}}