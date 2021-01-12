import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
public class Day21 {

	public static void main(String[]args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C://Users//god//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		/*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_settimeout");

//finding frame using id
		
		driver.switchTo().frame("iframeResult");
		
//finding frame using xpath
		
		//WebElement frame=driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
		//driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//button[text() = 'Try it']")).click();
		System.out.println("Timer JavaScript Alert is triggered but it is opened");
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert al=driver.switchTo().alert();
		al.accept();
		System.out.println("Pop Up is displayed");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[text()='Run »']")).click();*/
		
		//2.HDFC BANK
		
		/*driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		driver.switchTo().frame("login_page");
		WebElement frame=driver.findElement(By.xpath("(//img[@alt='continue'])[1]"));
		frame.click();
		
		Alert al=driver.switchTo().alert();
		Thread.sleep(3000);
		al.accept();*/
		
		//5.SPRINT
		
		/*driver.get("https://www.sprint.com/");
		driver.findElement(By.id("user-links-dropdown")).click();
		driver.findElement(By.xpath("(//span[text()='Log in'])[2]")).click();*/
		
		//6.PAYTM
		
		/*driver.get("https://paytm.com/");
		driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();*/
		
		//7.HDFC BANK
		
		/*driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame("login_page");
		driver.findElement(By.name("fldLoginUserId")).sendKeys("12345");
		driver.findElement(By.xpath("(//img[@alt='continue'])[1]")).click();
		driver.findElement(By.name("fldPassword")).sendKeys("abc@123");*/
		
}
}