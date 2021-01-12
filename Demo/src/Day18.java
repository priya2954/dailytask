import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
public class Day18 {

	public static void main(String[]args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C://Users//god//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		/*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_settimeout");
		driver.findElement(By.xpath("//button[text() = 'Try it']")).click();
		System.out.println("Timer JavaScript Alert is triggered but it is not yet opened");
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("Either Pop Up is displayed or it is Timed Out");*/
		
		//INSTAGRAM
		
		/*driver.get("https://www.instagram.com/accounts/login/?hl=en");
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		driver.findElement(By.name("username")).sendKeys("_priya.sha");
		driver.findElement(By.name("password")).sendKeys("Spriya");
		driver.findElement(By.xpath("//input[@class='login_button']")).click();*/
		
}
}