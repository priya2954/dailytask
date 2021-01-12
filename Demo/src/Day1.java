import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Day1 {
	public static void main(String[]args)throws InterruptedException{

//Launch the below url in Firefox browser
		
//	System.setProperty("webdriver.gecko.driver","C://Users//Anu//Downloads//geckodriver-v0.27.0-win64//geckodriver.exe");
//	WebDriver driver=new FirefoxDriver();
	
	//1.FACEBOOK
	
//	driver.get("http://www.facebook.com/");
//	Thread.sleep(2500L);
//	driver.close();
		/*Libglobal global=new Libglobal();
		global.getDriver();
		global.url("http://www.facebook.com/");
//		global.wait(2000L);
		global.closebrowser();*/
	
	//2.AMAZON
	
	/*driver.get("http://www.amazon.in/");
	Thread.sleep(2500L);
	driver.close();

	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	String result=("Hello");

	if(result.equals(driver.getTitle())){
	System.out.println("Its correct url");
	}
	else{
	System.out.println("Not correct url");
	}
	driver.close();*/
		
//Launch the below url in chrome browser
		
	//3.GMAIL
		
	System.setProperty("webdriver.chrome.driver","C://Users//god//Downloads//chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://gmail.com/");
	Thread.sleep(2500L);

	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	driver.close();
	
	//4.FLIPKART
	
	/*driver.get("http://flipkart.com/");
	Thread.sleep(2500L);

	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	String result=("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");

	if(result.equals(driver.getTitle())){
	System.out.println("Its correct url");
	}
	else{
	System.out.println("Not correct url");
	}
	driver.close();*/
	
	//5.DEMOQA REGISTRATION
	
	/*driver.get("http://demo.automationtesting.in/Register.html");
	Thread.sleep(2500L);

	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	String result=("Hello");

	if(result.equals(driver.getTitle())){
	System.out.println("Its correct url");
	}
	else{
	System.out.println("Not correct url");
	}
	driver.close();*/
	

	

}
}

