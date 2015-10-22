package basicSelenium.java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopup
{
	public static void main(String []args)throws InterruptedException
	{
  WebDriver driver =new FirefoxDriver();
  Thread.sleep(2000);
  driver.get("https://mypage.rediff.com/login/dologin");
  driver.findElement(By.id("btn_go")).click();
  Alert alert = driver.switchTo().alert();
        
  alert.getText();
 // Thread.sleep(2000);
  System.out.println("Alert Text:"+alert.getText());
        
  alert.accept();
  driver.switchTo().defaultContent();
  //driver.findElement(By.id("btn_go")).getAttribute("Continue");
  System.out.println("Go Button text:"+driver.findElement(By.id("btn_go")).getAttribute("value"));
       //output:Alert Text:Please enter a valid email
                // Go Button text:Continue

 
        
}
}
