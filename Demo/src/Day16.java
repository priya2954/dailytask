import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day16 {

	public static void main(String[]args)throws InterruptedException, IOException, AWTException{
		System.setProperty("webdriver.chrome.driver","C://Users//god//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("priya");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("abc123");
		driver.findElement(By.cssSelector("button[name='login']")).click();
}
}
