import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Day7 {
	public static void main(String[]args)throws InterruptedException, AWTException{
//		System.setProperty("webdriver.chrome.driver","C://Users//god//Downloads//chromedriver_win32//chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		
		//1.RIGHTCLICK
		
		/*driver.get("http://www.google.com");
		WebElement btngmail=driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions acc=new Actions(driver);
		acc.contextClick(btngmail).perform();*/
		Libglobal global=new Libglobal();
		global.getDriver();
		global.url("http://www.google.com");
		global.actions();
		global.robot();
		
		//2.KEYBOARD ACTION
		
		/*driver.get("http://www.google.com");
		WebElement btngmail=driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions acc=new Actions(driver);
		acc.contextClick(btngmail).perform();
		
		//KEYPRESS & RELEASE
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		//KEYPRESS & RELEASE - using for loop

		Robot r=new Robot();
		for(int i=0;i<6;i++){
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		}
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);*/
			
		//3.DOUBLE CLICK
			
			/*driver.get("https://www.facebook.com/");
			WebElement email=driver.findElement(By.xpath("//input[@type='text']"));
			email.sendKeys(new String[]{"shanmuga"});
			Actions acc=new Actions(driver);
			acc.doubleClick(email).perform();*/
			
		//4.UPPERCASE
			
			/*driver.get("https://www.facebook.com/");
			WebElement email=driver.findElement(By.xpath("//input[@type='text']"));
			Actions acc=new Actions(driver);
			acc.moveToElement(email).keyDown(Keys.SHIFT).sendKeys(new String[]{"shanmuga"}).perform();*/
		
}
}