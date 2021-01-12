import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Day9 {
	
	static WebDriver driver;
	public static void main(String[]args)throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver","C://Users//god//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		/*driver.get("https://www.facebook.com/");
		WebElement uname=driver.findElement(By.id("email"));
		uname.sendKeys(new String[]{"shanmuga"});
		takescreenshot("1");
		
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys(new String[]{"abc123"});
		takescreenshot("2");
		
	}
	public static void takescreenshot(String imagename) throws IOException {
		TakesScreenshot srcshot=(TakesScreenshot)driver;
		File src=(File) srcshot.getScreenshotAs(OutputType.FILE);
		System.out.println("src file--->" + src);
		
		File dest=new File("C://Users//god//workspace//Demos//screenshot images//" + imagename + ".png");
		FileUtils.copyFile(src, dest);*/
		
		
		//1.GREENS TECHNOLOGIES
		
		/*driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='HOME']")).click();
		TakesScreenshot src=(TakesScreenshot)driver;
		File source=(File) src.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C://Users//god//workspace//Demos//screenshot images//greens.png");
		FileUtils.copyFile(source, dest);*/
		
		//2.TOOLSQA
		
		/*driver.get("http://toolsqa.com/");
		WebElement scdown=driver.findElement(By.xpath("//div[text()='Share this page']"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true)", scdown);*/
		
		//3.TOOLSQA
		
		/*driver.get("http://toolsqa.com/");
		WebElement scdown=driver.findElement(By.xpath("//div[text()='Share this page']"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true)", scdown);
		Thread.sleep(3000);
		
		WebElement scup=driver.findElement(By.xpath("//span[text()='Latest Tutorials']"));
		jse.executeScript("arguments[0].scrollIntoView(false)", scup);*/
		
		//9.FLIPKART
		
		/*driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement close=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		close.click();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(new String[]{"iphone"});
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("_3wU53n")));
		driver.findElement(By.xpath("//div[text()='Apple iPhone XR (Black, 64 GB) (Includes EarPods, Power Adapter)']")).click();
		
		TakesScreenshot src=(TakesScreenshot)driver;
		File source=(File) src.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C://Users//god//workspace//Demos//screenshot images//phone.png");
		FileUtils.copyFile(source, dest);*/
		
		//10.AMAZON
		
		/*driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(new String[]{"motorola"});
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		
		driver.findElement(By.xpath("//span[text()='Motorola Fixed Wireless Phone FW 200 L Black']")).click();
		TakesScreenshot src=(TakesScreenshot)driver;
		File source=(File) src.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C://Users//god//workspace//Demos//screenshot images//moto.png");
		FileUtils.copyFile(source, dest);*/
		
		//12.SNAPDEAL
		
		/*driver.get("https://www.snapdeal.com/");
		driver.findElement(By.id("inputValEnter")).sendKeys(new String[]{"HP laptop"});
		driver.findElement(By.className("searchTextSpan")).click();
		
		TakesScreenshot src=(TakesScreenshot)driver;
		File source=(File) src.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C://Users//god//workspace//Demos//screenshot images//laptop.png");
		FileUtils.copyFile(source, dest);*/
	}
}
