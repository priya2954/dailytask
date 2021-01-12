import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day14 {

	public static void main(String[]args)throws InterruptedException, IOException, AWTException{
		System.setProperty("webdriver.chrome.driver","C://Users//god//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement radiobtn=driver.findElement(By.xpath("(//input[@name='radiooptions'])[2]"));
		radiobtn.click();
		boolean b=radiobtn.isSelected();
		System.out.println("Is Selected-->" + b);
		
		WebElement email=driver.findElement(By.id("eid"));
		boolean b1=email.isDisplayed();
		System.out.println("Is Displayed-->" + b1);
		
		boolean b2=email.isEnabled();
		System.out.println("Is Enabled-->" + b2);
}
}
