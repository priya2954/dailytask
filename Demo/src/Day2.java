import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day2 {
	public static void main(String[]args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C://Users//god//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		//1.FACEBOOK
		
		/*driver.get("http://www.facebook.com");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys(new String[]{"priya"});

		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys(new String[]{"abc123"});

		WebElement login=driver.findElement(By.id("u_0_b"));
		login.click();*/
		
		//2.REDBUS
		
		/*driver.get("http://www.redbus.com");
		WebElement source=driver.findElement(By.id("src"));
		source.sendKeys(new String[]{"Tirunelveli"});

		WebElement dest=driver.findElement(By.id("dest"));
		dest.sendKeys(new String[]{"chennai"});

		Thread.sleep(4000L);
		driver.close();*/
		
		//3.GOOGLE
		
		/*driver.get("http://www.google.com");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys(new String[]{"Greens Technologies"});*/
		
		//4.ICICI
		
		/*driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		WebElement userName = driver.findElement(By.id("DUMMY1"));
		userName.sendKeys(new String[]{"851754687"});

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("AuthenticationFG.ACCESS_CODE")));
		
		WebElement accessCode = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		accessCode.sendKeys(new String[]{"abc@123"});*/
		
		//5.HDFC
		
		/*driver.get("https://netbanking.hdfcbank.com/netbanking/");
		WebElement userid=driver.findElement(By.name("fldLoginUserId"));
		userid.sendKeys(new String[]{"priya"});

		Thread.sleep(4000);
		driver.close();*/
		
		//6.SWIGGY
		
		/*driver.get("http://www.swiggy.com");
		WebElement srcloc=driver.findElement(By.id("location"));
		srcloc.sendKeys(new String[]{"nagercoil"});

		WebElement srcbtn=driver.findElement(By.className("_3iFC5"));
		srcbtn.click();

		Thread.sleep(5000);
		driver.close();*/
		
		//7.SNAPDEAL
		
		/*driver.get("https://www.snapdeal.com/login");
		WebElement email=driver.findElement(By.id("userName"));
		email.sendKeys(new String[]{"abc@gmail.com"});

		Thread.sleep(5000);
		driver.close();*/
		
		//8.INSTAGRAM
		
		/*driver.get("https://www.instagram.com/accounts/login/?hl=en");
		WebElement uname=driver.findElement(By.name("username"));
		uname.sendKeys(new String[]{"priysha"});

		WebElement pass=driver.findElement(By.name("password)"));
		pass.sendKeys(new String[]{"abc@123"});

		WebElement login=driver.findElement(By.className("sqdOP yWX7d y3zKF"));
		login.click();*/
		
		//9.DEMOAUTOMATION
		
		/*driver.get("http://demo.automationtesting.in/Register.html");
		WebElement fname=driver.findElement(By.className("form-control"));
		fname.sendKeys(new String[]{"Shanmuga"});

		WebElement lname=driver.findElement(By.className("form-control"));
		lname.sendKeys(new String[]{"priya"});

		WebElement addr=driver.findElement(By.className("form-control"));
		addr.sendKeys(new String[]{"9 69 Temple road"});

		WebElement email=driver.findElement(By.className("form-control"));
		email.sendKeys(new String[]{"abc@gmail.com"});

		WebElement phnum=driver.findElement(By.className("form-control"));
		phnum.sendKeys(new String[]{"9876543210"});

		WebElement lang=driver.findElement(By.id("msdd"));
		lang.sendKeys(new String[]{"Tamil,English"});

		WebElement pass=driver.findElement(By.id("firstpassword"));
		pass.sendKeys(new String[]{"abc@123"});

		WebElement cpass=driver.findElement(By.id("secondpassword"));
		cpass.sendKeys(new String[]{"abc@123"});

		Thread.sleep(5000);
		driver.close();*/
		
		//10.ADACTIN HOTEL APP
		
		
		/*driver.get("http://www.adactinhotelapp.com/");
		WebElement email=driver.findElement(By.id("username"));
		email.sendKeys(new String[]{"priya"});

		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys(new String[]{"abc123"});

		WebElement loginbtn=driver.findElement(By.id("login"));
		loginbtn.click();*/
		
}
}	
