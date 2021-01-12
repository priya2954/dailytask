import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By; 
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day13 {

	static WebDriver driver;
	public static void main(String[]args)throws InterruptedException, IOException, AWTException{
		System.setProperty("webdriver.chrome.driver","C://Users//god//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		/*driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER);
		
		driver.findElement(By.xpath("//span[text()='Apple iPhone 7 (32GB) - Black']")).click();
		
		String pwid=driver.getWindowHandle();
		System.out.println("ParentId-->" + pwid);
		
		Set<String>cwid=driver.getWindowHandles();
		System.out.println("ChildId-->" + cwid);
		
		for(String cwindowid:cwid){
			if(pwid!=cwindowid){
				driver.switchTo().window(cwindowid);
			}
		}
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.close();
		
		driver.switchTo().window(pwid);
		driver.findElement(By.xpath("//span[text()='New Apple iPhone 11 (128GB) - Black']")).click();*/
	
		//1.AMAZON
		
		/*driver.get("https://www.amazon.com/");
		WebElement icon=driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-us']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(icon).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[text()='Change country/region.'])[1]")).click();
		
		WebElement country=driver.findElement(By.id("a-autoid-0-announce"));
		country.click();
	
		driver.findElement(By.xpath("//span[text()='India']")).click();
		driver.findElement(By.className("a-button-input")).click();
		
		String parwid=driver.getWindowHandle();
		Set<String> chwid=driver.getWindowHandles();
		
		for(String eachwindowid:chwid){
			if(parwid!=eachwindowid){
				driver.switchTo().window(eachwindowid);
			}	
		}
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone x",Keys.ENTER);
		
		driver.findElement(By.xpath("//span[text()='Apple iPhone XR 128GB (Product) RED (Includes EarPods, Power Adapter)']")).click();
		
		Set<String>cwid=driver.getWindowHandles();
		for(String currentwindow:cwid){
			if(parwid!=currentwindow){
				driver.switchTo().window(currentwindow);
			}
		}
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[text()='Details'])[1]")).click();
		
		WebElement text=driver.findElement(By.xpath("//span[contains(text(),'The following charges')]"));
		System.out.println(text.getText());*/
		
		//2.SNAPDEAL
		
		/*driver.get("https://www.snapdeal.com/");
		driver.findElement(By.id("inputValEnter")).sendKeys("iphone 7",Keys.ENTER);
		
		driver.findElement(By.xpath("//p[text()='Apple iPhone 7 Plus Glass Cover drums - Black']")).click();
		
		String pwid=driver.getWindowHandle();
		Set<String>cwid=driver.getWindowHandles();
		for(String cwindow:cwid){
			if(pwid!=cwindow){
				driver.switchTo().window(cwindow);
			}
		}
		driver.findElement(By.id("add-cart-button-id")).click();
		Thread.sleep(2000);
		WebElement text=driver.findElement(By.xpath("//div[text()='You Pay: ']"));
		System.out.println(text.getText());*/
	
		//3.HOMEDEPOT
		
		/*driver.get("https://www.homedepot.com/");
		driver.findElement(By.id("headerSearch")).sendKeys("ceiling fan",Keys.ENTER);
		Thread.sleep(5000);

		WebElement sel=driver.findElement(By.xpath("//span[text()='Mercer 52 in. LED Indoor Brushed Nickel Ceiling Fan with Light Kit and Remote Control']"));
		sel.click();
		
		String pwid=driver.getWindowHandle();
		Set<String>cwid=driver.getWindowHandles();
		for(String cwindow:cwid){
			if(pwid!=cwindow){
				driver.switchTo().window(cwindow);
			}
		}
		
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
		
		WebElement text=driver.findElement(By.xpath("//div[@data-automation-id='cartTotalPrice']"));
		System.out.println(text.getText());*/
		
		//4.GREENSTECHNOLOGIES
		
		/*driver.get("http://www.greenstechnologys.com/");
		WebElement sel=driver.findElement(By.xpath("//a[text()='CONTACT US']"));
		Actions acc=new Actions(driver);
		acc.contextClick(sel).perform();
		
		Robot r=new Robot();
		for(int i=0;i<2;i++){
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement text=driver.findElement(By.xpath("//h5[text()='Greens Technologys In ']"));
		System.out.println(text.getText());*/
		
		//5.GREENS TECHNOLOGIES
		
		/*driver.get("http://www.greenstechnologys.com/");
		WebElement sel=driver.findElement(By.xpath("//a[text()='CONTACT US']"));
		Actions acc=new Actions(driver);
		acc.contextClick(sel).perform();
		
		Robot r=new Robot();
		for(int i=0;i<2;i++){
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		WebDriverWait wait=new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='col-sm-3'])[2]")));
		WebElement text=driver.findElement(By.tagName("address"));
		System.out.println(text.getText());*/
		
		//6.GREENS TECHNOLOGIES
		
		/*driver.get("http://www.greenstechnologys.com/");
		WebElement sel=driver.findElement(By.xpath("//a[text()='CONTACT US']"));
		Actions acc=new Actions(driver);
		acc.contextClick(sel).perform();
		
		Robot r=new Robot();
		for(int i=0;i<2;i++){
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		WebElement dbclick=driver.findElement(By.xpath("//a[text()='Courses ']"));
		Actions acc1=new Actions(driver);
		acc1.doubleClick(dbclick).perform();*/
		
		//7.GREENS TECHNOLOGIES
		
		//8.AMAZON
		
		/*driver.get("https://www.amazon.com/");
		WebElement icon=driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-us']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(icon).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[text()='Change country/region.'])[1]")).click();
		
		WebElement country=driver.findElement(By.id("a-autoid-0-announce"));
		country.click();
	
		driver.findElement(By.xpath("//span[text()='India']")).click();
		driver.findElement(By.className("a-button-input")).click();
		
		String parwid=driver.getWindowHandle();
		Set<String> chwid=driver.getWindowHandles();
		
		for(String eachwindowid:chwid){
			if(parwid!=eachwindowid){
				driver.switchTo().window(eachwindowid);
			}	
		}

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 8",Keys.ENTER);
		
		driver.findElement(By.xpath("//span[text()='New Apple iPhone 12 (64GB) - Green']")).click();
		
		Set<String>cwid=driver.getWindowHandles();
		for(String currentwindow:cwid){
			if(parwid!=currentwindow){
				driver.switchTo().window(currentwindow);
			}
		}
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("hlb-view-cart-announce")).click();
		WebElement text=driver.findElement(By.xpath("(//div[@data-name='Subtotals'])[1]"));
		System.out.println(text.getText());*/

	}
}
