package basicSelenium.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Facebook 
{
	public static void main(String[] args) 
	{
		/*System.setProperty("webdriver.chrome.driver","D:\\SelenioumChromeDriver jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
		   
		/* System.setProperty("webdriver.ie.driver","D:\\SeleniumIEdriver jars\\IEDriverServer.exe");
		   WebDriver driver=new InternetExplorerDriver();*/
		
		    WebDriver driver=new FirefoxDriver();
		    driver.get("https://www.facebook.com");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
			System.out.println(driver.getTitle());
			//driver.manage().window().maximize();
			
			driver.findElement(By.id("email")).sendKeys("seleniumpractice9@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("testing12345");
			driver.findElement(By.id("loginbutton")).click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
			driver.findElement(By.id("userNavigationLabel")).click();
			driver.findElement(By.cssSelector("#u_2_1 > div > div > div.uiScrollableAreaWrap.scrollable > div > div > ul > li:nth-child(12) > a > span > span")).click();
			driver.close();
			
}
}
