import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day12 {

	public static void main(String[]args)throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver","C://Users//god//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		//1.TOOLSQA
		
		/*driver.get("http://toolsqa.com/automation-practice-form/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,750)", args);

		WebElement sel=driver.findElement(By.xpath("//div[text()='Select State']"));
		sel.click();
		
		Select s=new Select(sel);
		List<WebElement>list=s.getOptions();
		for(WebElement options:list){
			System.out.println(options.getText());
		}*/
		
		//2.
		//3.PASSPORT OFFICE FORM FILL
		
		/*driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		//driver.manage().window().maximize();
		
		WebElement offsel=driver.findElement(By.id("dcdrLocation"));
		offsel.click();
		Select s=new Select(offsel);
		s.selectByVisibleText("Madurai");
		
		driver.findElement(By.id("givenName")).sendKeys(new String[]{"shanmuga"});
		driver.findElement(By.id("surname")).sendKeys(new String[]{"priya"});
		driver.findElement(By.id("dob")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@class='ui-datepicker-month']/option[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@class='ui-datepicker-year']/option[10]")).click();
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)", args);
		driver.findElement(By.xpath("//a[text()='29']")).click();
		driver.findElement(By.id("email")).sendKeys(new String[]{"abc@gmail.com"});
		driver.findElement(By.id("emailloginSameyes")).click();
		driver.findElement(By.id("pwd")).sendKeys(new String[]{"Spriya@1"});
		driver.findElement(By.id("confirmPwd")).sendKeys(new String[]{"Spriya@1"});
		WebElement hintq=driver.findElement(By.id("hintQues"));
		hintq.click();
		Select hint=new Select(hintq);
		hint.selectByVisibleText("Favourite Colour");
		driver.findElement(By.id("hintAns")).sendKeys(new String[]{"violet"});*/
		
		//4.PRINT ALL PASSPORT OFFICE
		
		/*driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		WebElement off=driver.findElement(By.id("dcdrLocation"));
		off.click();
		Select s=new Select(off);
		List<WebElement>list=s.getOptions();
		for(int i=0;i<s.getOptions().size();i++){
			WebElement option=list.get(i);
			String alloff=option.getText();
			System.out.println(alloff);
		}*/

	}
}
