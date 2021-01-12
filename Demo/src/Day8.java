import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By; 
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day8 {
	public static void main(String[]args)throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver","C://Users//god//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys(new String[]{"shanmuga"});
		
		TakesScreenshot srcshot=(TakesScreenshot)driver;
		File src=(File) srcshot.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C://Users//god//workspace//Demos//screenshot images//test.png");
		FileUtils.copyFile(src, dest);
}
}