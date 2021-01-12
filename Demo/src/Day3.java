import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day3 {
	public static void main(String[]args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C://Users//god//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//1.FACEBOOK
		
		/*driver.get("http://www.facebook.com");
		WebElement email=driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys(new String[]{"shanmuga"});
		
		WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys(new String[]{"abc@123"});
		
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		login.click();*/
		
		//2.DEMOAUTOMATION
		
		/*driver.get("http://demo.automationtesting.in/Register.html");
		WebElement fname=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		fname.sendKeys(new String[]{"shanmuga"});
		
		WebElement lname=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		lname.sendKeys(new String[]{"priya"});
		
		WebElement addrs=driver.findElement(By.xpath("//textarea[@class='form-control']"));
		addrs.sendKeys(new String[]{"9 69 temple road"});
		
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys(new String[]{"abc@gmail.com"});
		
		WebElement phnum=driver.findElement(By.xpath("//input[@type='tel']"));
		phnum.sendKeys(new String[]{"9876543210"});
		
		WebElement gender=driver.findElement(By.xpath("//input[@value='FeMale']"));
		gender.click();
		
		WebElement hob=driver.findElement(By.xpath("//input[@id='checkbox2']"));
		hob.click();
		
		///*WebElement lang=driver.findElement(By.xpath("//div[@id='msdd']]"));
		lang.sendKeys(new String[]{"Tamil"});
		
		WebElement skills=driver.findElement(By.xpath("(//select[@type='text'])[1]/option[4]"));
		skills.click();
		Thread.sleep(1000);
	
		WebElement country=driver.findElement(By.xpath("//select[@id='countries']/option[5]"));
		country.click();
		Thread.sleep(1000);
		
		///*WebElement selcon=driver.findElement(By.xpath("(//div[@class='form-group'])[1]/option[5]"));
		selcon.click();
		Thread.sleep(1000);
		
		WebElement date=driver.findElement(By.xpath("//select[@id='yearbox']/option[6]"));
		date.click();
		Thread.sleep(1000);
		
		WebElement month=driver.findElement(By.xpath("//select[@ng-model='monthbox']/option[6]"));
		month.click();
		Thread.sleep(1000);
		
		WebElement day=driver.findElement(By.xpath("//select[@id='daybox']/option[6]"));
		day.click();
		Thread.sleep(1000);
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='firstpassword']"));
		pass.sendKeys(new String[]{"SSabc123"});
		Thread.sleep(1000);
		
		WebElement cpass=driver.findElement(By.xpath("//input[@id='secondpassword']"));
		cpass.sendKeys(new String[]{"SSabc123"});
		
		WebElement loginbtn=driver.findElement(By.xpath("//button[@type='submit']"));
		loginbtn.click();*/
		
		//3.TOOLSQA
		
		/*driver.get("http://toolsqa.com/automation-practice-form/");
		WebElement fname=driver.findElement(By.xpath("//input[@id='firstName']"));
		fname.sendKeys(new String[]{"Shanmuga"});
		
		WebElement lname=driver.findElement(By.xpath("//input[@id='lastName']"));
		lname.sendKeys(new String[]{"priya"});
		
		WebElement email=driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys(new String[]{"abc@gmail.com"});
		
		WebElement gender=driver.findElement(By.xpath("(//input[@value='Female']"));
		gender.click();
		
		WebElement phnum=driver.findElement(By.xpath("//input[@id='userNumber']"));
		phnum.sendKeys(new String[]{"9876543210"});
		
		WebElement dob=driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		dob.click();
		WebElement month=driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']/option[5]"));
		month.click();
		WebElement year=driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']/option[9]"));
		year.click();
		WebElement date=driver.findElement(By.xpath("//div[@class='react-datepicker__month-container']"));
		date.click();
		Thread.sleep(1000);
		
		//WebElement sub=driver.findElement(By.xpath("//div[@id='subjectsContainer']"));
		sub.sendKeys(new String[]{"maths,tamil,english"});
		Thread.sleep(1000);
		
		WebElement hob=driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']"));
		hob.click();
		Thread.sleep(1000);
		
		//WebElement pic=driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		pic.click();
		
		WebElement addrs=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		addrs.sendKeys(new String[]{"9 69 temple road"});
		
		//WebElement selstate=driver.findElement(By.xpath("//div[@id='state']/option[4]"));
		selstate.click();
		//WebElement selcity=driver.findElement(By.xpath("//div[@id='city']/option[3]"));
		selcity.click();
		
		WebElement submit=driver.findElement(By.xpath("//button[@id='submit']"));
		submit.click();*/
		
		//4.FLIPKART
		
		/*driver.get("https://www.flipkart.com/");
		//WebElement newlog=driver.findElement(By.xpath("//a[@class='oZoRPi']"));
		//newlog.click();
		
		WebElement num=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		num.sendKeys(new String[]{"7896543210"});
		
		WebElement btn=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		btn.click();
		Thread.sleep(1000);
		
		WebElement otp=driver.findElement(By.xpath("(//input[@class='_2zrpKA _1dBPDZ'])[1]"));
		otp.sendKeys(new String[]{"987654"});
		
		WebElement setpass=driver.findElement(By.xpath("//input[@type='password']"));
		setpass.sendKeys(new String[]{"abc123"});*/
		
		//EXISTING
		/*WebElement exuser=driver.findElement(By.xpath("(//a[@class='_2AkmmA _1LctnI jUwFiZ'])[1]"));
		exuser.click();
		
		WebElement mbl=driver.findElement(By.xpath("(//input[@class='_2zrpKA _1dBPDZ'])[1]"));
		mbl.sendKeys(new String[]{"9443288230"});
		
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys(new String[]{"thankam"});
		
		WebElement submit=driver.findElement(By.xpath("(//button[@class='_2AkmmA _1LctnI _7UHT_c'])[1]"));
		submit.click();
		
		WebElement myacc=driver.findElement(By.xpath("(//div[@class='_2aUbKa'])[1]"));
		myacc.click();
		
		WebElement prof=driver.findElement(By.xpath("(//a[@class='_2k68Dy']"));
		prof.click();*/
		
		//5.AMAZON
		
		/*driver.get("https://www.amazon.in/");
		WebElement signin=driver.findElement(By.xpath("(//span[@class='nav-line-1'])[2]"));
		signin.click();
		
		WebElement signinn=driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
		signinn.click();
		
		WebElement cname=driver.findElement(By.xpath("//input[@name='customerName']"));
		cname.sendKeys(new String[]{"anu"});
		
		//WebElement ccode=driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']/option[1]"));
		//ccode.click();
		//Thread.sleep(1000);
		
		WebElement numb=driver.findElement(By.xpath("//input[@type='tel']"));
		numb.sendKeys(new String[]{"8907564321"});
		
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys(new String[]{"abcd123@gmail.com"});
		
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys(new String[]{"ab1234"});
		
		WebElement cont=driver.findElement(By.xpath("//input[@id='continue']"));
		cont.click();*/
		
		//6.GOOGLE ACCOUNT
		
		/*driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		WebElement fname=driver.findElement(By.xpath("//input[@id='firstName']"));
		fname.sendKeys(new String[]{"Anu"});
		
		WebElement lname=driver.findElement(By.xpath("//input[@id='lastName']"));
		lname.sendKeys(new String[]{"Achu"});
		
		WebElement email=driver.findElement(By.xpath("//input[@id='username']"));
		email.sendKeys(new String[]{"anu123@gmail.com"});
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='Passwd']"));
		pass.sendKeys(new String[]{"Anu123@"});
		
		WebElement cpass=driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		cpass.sendKeys(new String[]{"Anu123@"});
		
		WebElement btn=driver.findElement(By.xpath("//div[@class='ZFr60d CeoRYc']"));
		btn.click();*/
		
		//7.SNAPDEAL
		
		/*driver.get("https://www.snapdeal.com/");
		WebElement signin=driver.findElement(By.xpath("//div[@class='accountInner']"));
		signin.click();
		
		WebElement newuser=driver.findElement(By.xpath("//span[@class='newUserRegister']"));
		newuser.click();
		
		WebElement numb=driver.findElement(By.xpath("//input[@id='userName']"));
		numb.sendKeys(new String[]{"9443288230"});
		
		
		WebElement cont=driver.findElement(By.xpath("//button[@id='checkUser']"));
		cont.click();
		
		WebElement email=driver.findElement(By.xpath("//input[@id='j_username_new']"));
		email.sendKeys(new String[]{"abc123@gmail.com"});
		Thread.sleep(500);
		
		WebElement name=driver.findElement(By.xpath("//input[@id='j_name']"));
		name.sendKeys(new String[]{"priya"});
		Thread.sleep(500);
		
		WebElement dob=driver.findElement(By.xpath("//input[@id='j_dob']"));
		dob.click();
		WebElement month=driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]/option[3]"));
		month.click();
		WebElement year=driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[2]/option[5]"));
		year.click();
		WebElement date=driver.findElement(By.xpath("//div[@class='datepicker-days']/option[29]"));
		date.click();
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='j_password']"));
		pass.sendKeys(new String[]{"abc123"});Thread.sleep(500);
		
		WebElement submit=driver.findElement(By.xpath("//button[@id='userSignup']"));
		submit.click();*/
		
		//8.BANK DETAILS
		
		/*driver.get("https://management.ind.in/forum/lakshmi-vilas-bank-net-banking-application-form-157353.html");
		WebElement uname=driver.findElement(By.xpath("//input[@id='navbar_username']"));
		uname.sendKeys(new String[]{"priya"});
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='navbar_password']"));
		pass.sendKeys(new String[]{"abc123"});
		
		WebElement chk=driver.findElement(By.xpath("//input[@id='cb_cookieuser_navbar']"));
		chk.click();
		
		WebElement submit=driver.findElement(By.xpath("//input[@class='button']"));
		submit.click();*/
		
		//9.SWIGGY
		
		/*driver.get("https://www.swiggy.com/");
		WebElement signin=driver.findElement(By.xpath("//a[@class='r2iyh']"));
		signin.click();
		
		WebElement numb=driver.findElement(By.xpath("//input[@id='mobile']"));
		numb.sendKeys(new String[]{"9443288230"});
		
		WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys(new String[]{"priya"});
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys(new String[]{"abc123@gmail.com"});
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys(new String[]{"abc123"});
		
		WebElement cont=driver.findElement(By.xpath("//a[@class='a-ayg']"));
		cont.click();*/
		
		//10.REDBUS
		
		/*driver.get("https://www.redbus.in/");
		driver.findElement(By.id("sign-in-icon-down")).click();
		driver.findElement(By.xpath("//li[text()='Sign In/Sign Up']")).click();
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("mobileNoInp")).sendKeys("7894621305");*/
		
		//11.CLEARTRIP
		
		/*driver.get("https://www.cleartrip.com/trains");
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Sign up for one »']")).click();
		driver.findElement(By.id("username1")).sendKeys("abc@gmail.com");*/
		
		//12.IRCTC
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		driver.findElement(By.xpath("//a[text()=' REGISTER ']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("userName")).sendKeys("Priya");
		driver.findElement(By.id("usrPwd")).sendKeys("Spriya@12");
		driver.findElement(By.id("cnfUsrPwd")).sendKeys("Spriya@12");
//		WebElement secques=driver.findElement(By.xpath("(//div[@class='ui-dropdown-trigger ui-state-default ui-corner-right'])[1]"));
//		secques.click();
//		Select s=new Select(secques);
//		s.selectByValue("4");
		driver.findElement(By.id("firstName")).sendKeys("Shanmuga");
		driver.findElement(By.id("F")).click();
		WebElement dob=driver.findElement(By.className("ng-tns-c12-9 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted"));
		dob.click();
		

}
}