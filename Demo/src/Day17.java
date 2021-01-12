import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day17 {

	public static void main(String[]args)throws InterruptedException, IOException, AWTException{
		System.setProperty("webdriver.chrome.driver","C://Users//god//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		/*driver.get("http://www.facebook.com");
		WebElement email=driver.findElement(By.id("email"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].setAttribute('value','Priya')",email);
		
		WebElement pass=driver.findElement(By.id("pass"));
		jse.executeScript("arguments[0].setAttribute('value','abc@123')", pass);
		
		String uname=(String) jse.executeScript("return arguments[0].getAttribute('value')", email);
		System.out.println(uname);
		
		String password=(String) jse.executeScript("return arguments[1].getAttribute('value')",email,pass);
		System.out.println(password);
		
		WebElement login=driver.findElement(By.id("u_0_b"));
		jse.executeScript("arguments[0].click()",login);*/
		
//SCROLLING METHOD
		
		/*driver.get("https://demoqa.com/");
		WebElement scroll=driver.findElement(By.xpath("//h5[text()='Book Store Application']"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true)",scroll);
		Thread.sleep(3000);
		WebElement scrollup=driver.findElement(By.xpath("//h5[text()='Elements']"));
		jse.executeScript("arguments[0].scrollIntoView(false)", scrollup);*/
		
		//1.GREENS TECHNOLOGIES
		
		/*driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		WebElement scroll=driver.findElement(By.xpath("(//p[text()='Greens Technologys Overall Reviews'])[1]"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true)", scroll);
		Thread.sleep(2000);
		String text=(String) jse.executeScript("return arguments[0].innerHTML", scroll);
		System.out.println(text);*/
		
		//2.TOOLSQA
		
		/*driver.get("http://toolsqa.com/");
		WebElement scroll=driver.findElement(By.xpath("//span[text()='Recent Articles']"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true)", scroll);
		Thread.sleep(2000);
		WebElement scroll1=driver.findElement(By.xpath("//span[text()='Latest Tutorials']"));
		jse.executeScript("arguments[0].scrollIntoView(true)", scroll1);*/
		
		//3.GREENS TECHNOLOGIES
		
		/*driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		WebElement scroll=driver.findElement(By.xpath("//b[text()='Best Selenium training center in OMR']"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true)", scroll);
		jse.executeScript("arguments[0].setAttribute('style','background: red;')", scroll);*/
		
		//4.FACEBOOK
		
		/*driver.get("http://www.facebook.com");
		WebElement email=driver.findElement(By.id("email"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].setAttribute('value','Priya')",email);
		
		WebElement pass=driver.findElement(By.id("pass"));
		jse.executeScript("arguments[0].setAttribute('value','abc@123')", pass);
		
		WebElement login=driver.findElement(By.id("u_0_b"));
		jse.executeScript("arguments[0].click()",login);*/
		
		//5.ADACTIN HOTELAPP
		
		/*driver.get("http://www.adactinhotelapp.com/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement email=driver.findElement(By.id("username"));
		jse.executeScript("arguments[0].setAttribute('value','Priya')", email);
		
		WebElement pass=driver.findElement(By.id("password"));
		jse.executeScript("arguments[0].setAttribute('value','abc@123')", pass);
		
		WebElement login=driver.findElement(By.id("login"));
		jse.executeScript("arguments[0].click()", login);*/
		
		//6.FLIPKART
		
		/*driver.get("https://www.flipkart.com/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement email=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		jse.executeScript("arguments[0].setAttribute('value','7894561230')", email);
		
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		jse.executeScript("arguments[0].setAttribute('value','abc@123')", pass);
		
		WebElement login=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		jse.executeScript("arguments[0].click()", login);*/
		
		
	}
}
