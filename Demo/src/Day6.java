import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day6 {
	public static void main(String[]args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C://Users//god//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//1.DRAG AND DROP
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement from=driver.findElement(By.id("credit2"));
		WebElement to=driver.findElement(By.id("bank"));
		Actions acc=new Actions(driver);
		acc.dragAndDrop(from, to).build().perform();
		Thread.sleep(3000);
		WebElement from1=driver.findElement(By.id("fourth"));
		WebElement to1=driver.findElement(By.id("amt7"));
		acc.dragAndDrop(from1, to1).build().perform();
		Thread.sleep(3000);
		WebElement from2=driver.findElement(By.id("credit1"));
		WebElement to2=driver.findElement(By.id("loan"));
		acc.dragAndDrop(from2, to2).build().perform();
		Thread.sleep(3000);
		WebElement from3=driver.findElement(By.id("fourth"));
		WebElement to3=driver.findElement(By.id("amt8"));
		acc.dragAndDrop(from3, to3).build().perform();
		
		//2.AMAZON
		
		/*driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement navbtn=driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']"));
		navbtn.click();
		Thread.sleep(1000);
		
		WebElement navbtn1=driver.findElement(By.xpath("//div[text()='Mobiles, Computers']"));
		navbtn1.click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Power Banks']")).click();*/
		
		//3.GETTY IMAGES
		
		/*driver.get("https://www.gettyimages.in/");
		driver.manage().window().maximize();
		WebElement editbtn=driver.findElement(By.xpath("(//a[text()='EDITORIAL'])[2]"));
		editbtn.click();
		Thread.sleep(100);
		
		WebElement entbtn=driver.findElement(By.xpath("//a[text()='Entertainment']"));
		entbtn.click();*/
		
		//4.SHOPCLUES
		
		/*driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		WebElement shop=driver.findElement(By.xpath("//a[text()='Mobiles & More']"));
		Actions click=new Actions(driver);
		click.moveToElement(shop).perform();
		Thread.sleep(1000);
		
		WebElement rate=driver.findElement(By.xpath("//a[text()='Rs.5001 - Rs.10000']"));
		rate.click();*/
		
		//5.HOMEDEPOT
		
		/*driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		WebElement dep=driver.findElement(By.xpath("//a[text()='All Departments']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(dep).perform();
		
		WebElement hc=driver.findElement(By.xpath("(//a[text()='Heating & Cooling'])[1]"));
	   	acc.moveToElement(hc).perform();
		
		WebElement ac=driver.findElement(By.xpath("(//a[text()='Air Conditioners'])[1]"));
		acc.moveToElement(ac).perform();
		Thread.sleep(1000);
		
		WebElement pac=driver.findElement(By.xpath("//a[text()='Portable Air Conditioners']"));
		pac.click();*/
		
		//6.HOMEDEPOT
		
		/*driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		WebElement dep1=driver.findElement(By.xpath("//a[text()='All Departments']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(dep1).perform();
		
		WebElement paint=driver.findElement(By.xpath("(//a[text()='Paint'])[1]"));
		acc.moveToElement(paint).perform();
		
		WebElement intp=driver.findElement(By.xpath("(//a[text()='Interior Paint'])[1]"));
		acc.moveToElement(intp).perform();
		
		WebElement intp1=driver.findElement(By.xpath("//a[text()='Ceiling Paint']"));
		intp1.click();
		Thread.sleep(1000);*/
		
		//7.SNAPDEAL
		
		/*driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement mblcover=driver.findElement(By.xpath("//span[text()='Mobile & Tablets']"));
		Actions mou=new Actions(driver);
		mou.moveToElement(mblcover).perform();
		
		WebElement newlau=driver.findElement(By.xpath("//span[text()='New Launches Covers']"));
		newlau.click();
		Thread.sleep(1000);*/
		
		//8.SNAPDEAL
		
		/*driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement wfash=driver.findElement(By.xpath("(//span[@class='catText'])[7]"));
		Actions mou1=new Actions(driver);
		mou1.moveToElement(wfash).perform();
		
		WebElement fclick=driver.findElement(By.xpath("(//span[text()='Footwear'])[2]"));
		fclick.click();
		Thread.sleep(1000);
		
		WebElement hclick=driver.findElement(By.xpath("//div[text()='Heels']"));
		hclick.click();*/
		
		//9.AMAZON
		
		/*driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement signin=driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		Actions sgnin=new Actions(driver);
		sgnin.moveToElement(signin).perform();
		
		WebElement signin1=driver.findElement(By.xpath("(//span[text()='Sign in'])[1]"));
		signin1.click();
	
		WebElement signinn=driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
		signinn.click();
		
		WebElement cname=driver.findElement(By.xpath("//input[@name='customerName']"));
		cname.sendKeys(new String[]{"anu"});
		
		WebElement numb=driver.findElement(By.xpath("//input[@type='tel']"));
		numb.sendKeys(new String[]{"8907564321"});
		
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys(new String[]{"abcd123@gmail.com"});
		
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys(new String[]{"ab1234"});
		
		WebElement cont=driver.findElement(By.xpath("//input[@id='continue']"));
		cont.click();*/
		
		//10.AMAZON
		
		/*driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement navbtn=driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']"));
		navbtn.click();
		Thread.sleep(1000);
		
		WebElement navbtn1=driver.findElement(By.xpath("//a[@data-menu-id='10']"));
		navbtn1.click();
		Thread.sleep(1000);
		
		WebElement navbtn2=driver.findElement(By.xpath("(//a[text()='Sunglasses'])[1]"));
		navbtn2.click();*/
		
		//11.AMAZON
		
		/*driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement signin=driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		Actions sgnin=new Actions(driver);
		sgnin.moveToElement(signin).perform();
		
		WebElement signin1=driver.findElement(By.xpath("(//a[text()='Start here.'])[1]"));
		signin1.click();
		
		WebElement cname=driver.findElement(By.xpath("//input[@name='customerName']"));
		cname.sendKeys(new String[]{"priya"});
		
		WebElement numb=driver.findElement(By.xpath("//input[@type='tel']"));
		numb.sendKeys(new String[]{"9807564321"});
		
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys(new String[]{"abc123@gmail.com"});
		
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys(new String[]{"ab@1234"});
		
		WebElement cont=driver.findElement(By.xpath("//input[@id='continue']"));
		cont.click();*/
		
		//12.FLIPKART
		
		/*driver.get("http://www.flipkart.com/");
		WebElement close=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		
		driver.manage().window().maximize();
		WebElement women=driver.findElement(By.xpath("//span[text()='Women']"));
		Actions wclick=new Actions(driver);
		wclick.moveToElement(women).perform();
		
		WebElement footw=driver.findElement(By.xpath("//a[text()='Footwear']"));
		footw.click();
		Thread.sleep(1000);
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		WebElement element=(WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("_2SvCnW")));
		WebElement flat=driver.findElement(By.xpath("//a[text()='Flats']"));
		flat.click();*/
		
		//13.SPRINT
		
		/*driver.get("https://www.sprint.com/");
		driver.manage().window().maximize();
		
		WebElement sign=driver.findElement(By.xpath("//button[@class='nav__link nav__link-button dropdown-toggles nav__link-button-desktop MAGENTA']"));
		sign.click();
		
		WebElement paybill=driver.findElement(By.xpath("//a[text()=' Bill pay ']"));
		paybill.click();*/
		
		//14.FLIPKART
		
		/*driver.get("http://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement homeappl=driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(homeappl).perform();

		driver.findElement(By.xpath("//a[text()='Dining Tables & Chairs']")).click();
		driver.findElement(By.xpath("//a[text()='limraz furniture Engineered Wood 2 Seater Dining Table']")).click();
		
		String pwid=driver.getWindowHandle();
		Set<String>cwid=driver.getWindowHandles();
		for(String chwid:cwid) {
			if(pwid!=chwid) {
				driver.switchTo().window(chwid);
			}
		}
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();*/
		
		//15.SHOPCLUES
		
		/*driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement spmore=driver.findElement(By.xpath("//a[text()='Sports & More']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(spmore).perform();
		driver.findElement(By.xpath("//a[text()='Weight Gainers']")).click();
		
		String pwid=driver.getWindowHandle();
		Set<String>cwid=driver.getWindowHandles();
		for(String chwid:cwid) {
			if(pwid!=chwid) {
				driver.switchTo().window(chwid);
			}
		}
		driver.findElement(By.xpath("//span[text()='Medisys Double Mass Gainer -Chocolate 1.5kg Free Multiv']")).click();
		Set<String> chwinid=driver.getWindowHandles();
		for(String chid:chwinid) {
			if(pwid!=chid) {
				driver.switchTo().window(chid);
			}
		}
		driver.findElement(By.id("add_cart")).click();
		WebElement cart=driver.findElement(By.xpath("//a[@class='cart_ic']"));
		acc.moveToElement(cart).perform();
		driver.findElement(By.xpath("//a[text()='View Cart']")).click();
		WebElement total=driver.findElement(By.xpath("//p[@class='total']"));
		String text=total.getText();
		System.out.println(text);*/
	}
}	
