import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5 {
	public static void main(String[]args)throws InterruptedException{
//		System.setProperty("webdriver.chrome.driver","C://Users//god//Downloads//chromedriver_win32//chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
	
		//1.FACEBOOK
		Libglobal global=new Libglobal();
		global.getDriver();
		global.url("https://www.facebook.com/");
		WebElement element = null;
		global.email(element, "priya");
//		driver.get("https://www.facebook.com/");
//		WebElement uname=driver.findElement(By.id("email"));
//		uname.sendKeys(new String[] {"Priya"});
//		String text=uname.getAttribute("value");
//		System.out.println(text);
//		WebElement pass=driver.findElement(By.id("pass"));
//		pass.sendKeys(new String[] {"abc@123"});
//		String text1=pass.getAttribute("value");
//		System.out.println(text1);
		
		//2.GOOGLE
	
		/*driver.get("http://www.google.com/");
		WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys(new String[]{"selenium"});
		search.click();
		Thread.sleep(250);
	
		WebElement select=driver.findElement(By.xpath("(//div[@class='sbl1'][1])"));
		select.click();
	
		WebElement link=driver.findElement(By.xpath("//span[text()='Selenium WebDriver']"));
		link.click();*/
		
		//3.ADACTINHOTEL APP
		
		/*driver.get("http://www.adactinhotelapp.com/");
		WebElement email=driver.findElement(By.id("username"));
		email.sendKeys(new String[]{"priya"});
		
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys(new String[]{"abc123"});
		
		String value=email.getAttribute("value");
		System.out.println("email-->" + value);
		
		String value1=pass.getAttribute("value") ;
		System.out.println("password-->" + value1);*/
		
		//4.GOOGLE ACCOUNT
		
		/*driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		WebElement fname=driver.findElement(By.xpath("//input[@id='firstName']"));
		fname.sendKeys(new String[]{"Shanmuga"});
		String print=fname.getAttribute("data-initial-value");
		System.out.println("firstname-->" + print);
		
		WebElement lname=driver.findElement(By.xpath("//input[@id='lastName']"));
		lname.sendKeys(new String[]{"priya"});
		String print1=fname.getAttribute("data-initial-value");
		System.out.println("lastname-->" + print1);
		
		WebElement email=driver.findElement(By.xpath("//input[@id='username']"));
		email.sendKeys(new String[]{"anu123@gmail.com"});
		String print2=fname.getAttribute("data-initial-value");
		System.out.println("email-->" + print2);
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='Passwd']"));
		pass.sendKeys(new String[]{"Anu123@"});
		String print3=fname.getAttribute("data-initial-value");
		System.out.println("password-->" + print3);
		
		WebElement cpass=driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		cpass.sendKeys(new String[]{"Anu123@"});
		String print4=fname.getAttribute("data-initial-value");
		System.out.println("confirm password-->" + print4);*/
		
		//5.FLIPKART
		
		/*driver.get("https://www.flipkart.com/");
		WebElement find=driver.findElement(By.xpath("//input[@name='q']"));
		find.sendKeys(new String[]{"electronic,tv and applicances,men,women,baby&kids,home&furniture and offerzone."});
		
		String type=find.getAttribute("value");
		System.out.println(type);*/
		
		//6.FLIPKART
		
		/*driver.get("https://www.flipkart.com/");
		WebElement newlog=driver.findElement(By.xpath("//a[@class='oZoRPi']"));
		newlog.click();
		
		WebElement num=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		num.sendKeys(new String[]{"7896543210"});
		String p=num.getAttribute("value");
		System.out.println("Mobile no: " + p);
		
		//WebElement btn=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		//btn.click();
		//Thread.sleep(1000);
		
		//Existing user
		
		WebElement exuser=driver.findElement(By.xpath("(//a[@class='_2AkmmA _1LctnI jUwFiZ'])[1]"));
		exuser.click();
		
		WebElement mbl=driver.findElement(By.xpath("(//input[@class='_2zrpKA _1dBPDZ'])[1]"));
		mbl.sendKeys(new String[]{"9443288230"});
		String out=mbl.getAttribute("value");
		System.out.println("Mobile num:" + out);
		
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys(new String[]{"thankam"});
		String output=pass.getAttribute("value");
		System.out.println("password:" + output);
		
		WebElement submit=driver.findElement(By.xpath("(//button[@class='_2AkmmA _1LctnI _7UHT_c'])[1]"));
		submit.click();*/
		
		//8.SNAPDEAL
		
		/*driver.get("https://www.snapdeal.com/");
		driver.findElement(By.xpath("(//div[text()='PRd PU Tan Casual regular Wallet'])[1]")).click();
		String pwid=driver.getWindowHandle();
		Set<String>cwid=driver.getWindowHandles();
		for(String chwin:cwid) {
			if(pwid!=chwin) {
				driver.switchTo().window(chwin);
			}
		}
		
		driver.findElement(By.id("add-cart-button-id")).click();
		Thread.sleep(5000);
		driver.switchTo().window(pwid);
		driver.findElement(By.xpath("(//div[text()='bhawna collection  Loard Shiv Trishul Damru Locket With Puchmukhi Rudraksha Mala Gold-plated Brass, Wood'])[1]")).click();
		Set<String>chid=driver.getWindowHandles();
		for(String chwid:chid) {
			if(pwid!=chwid) {
				driver.switchTo().window(chwid);
			}
		}
		driver.findElement(By.id("add-cart-button-id")).click();
		Thread.sleep(5000);
		WebElement total=driver.findElement(By.className("you-pay"));
		String totalcost=total.getText();
		System.out.println(totalcost);*/
		
		//9.SHOPCLUES
		
		/*driver.get("https://www.shopclues.com/wholesale.html");
		driver.findElement(By.id("autocomplete")).sendKeys("fastrack watches"); 
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		driver.findElement(By.xpath("//span[text()='Fastrack Quartz White Round Men Watch 3124SM01']")).click();
		String pwid=driver.getWindowHandle();
		Set<String> cwid=driver.getWindowHandles();
		for(String chwid:cwid) {
			if(pwid!=chwid) {
				driver.switchTo().window(chwid);
				
			}
		}
		driver.findElement(By.id("add_cart")).click();
		Thread.sleep(2000);
		WebElement cart=driver.findElement(By.xpath("//a[@class='cart_ic']"));
		Actions acc=new Actions(driver);
		acc.moveToElement(cart).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='View Cart']")).click();
		WebElement cost=driver.findElement(By.className("total"));
		String text=cost.getText();
		System.out.println(text);*/
}
}
