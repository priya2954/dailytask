import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Day10 {
	static WebDriver driver;
	public static void main(String[]args)throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver","C://Users//god//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//1.DEMOAUTOMATION
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Alert al=driver.switchTo().alert();
		Thread.sleep(1000);
		al.accept();
		
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(5000);
		al.accept();
		
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'demonstrate the prompt box ')]")).click();
		al.sendKeys("hello");
		Thread.sleep(5000);
		al.accept();
		
		//2.CANARA BANK
		
		/*driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Alert al=driver.switchTo().alert();
		Thread.sleep(1000);
		al.accept();*/
		
		//3.SBI
		
		/*driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.findElement(By.xpath("(//a[text()='CONTINUE TO LOGIN'])[1]")).click();
		driver.findElement(By.id("Button2")).click();
		
		Alert al=driver.switchTo().alert();
		Thread.sleep(1000);
		al.accept();*/
		
		//4.ICICI
		
		/*driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		//driver.findElement(By.xpath("//span[@id='HDisplayDefault.Rb14.C3']")).click();
		
		driver.findElement(By.id("DUMMY1")).sendKeys(new String[]{"priya"});
		driver.findElement(By.id("user-id-goahead")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("AuthenticationFG.ACCESS_CODE")));
		
		WebElement accessCode = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		accessCode.sendKeys(new String[]{"abc@123"});*/
}
}