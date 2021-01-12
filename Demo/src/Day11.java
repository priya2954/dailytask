import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Day11 {
	public static void main(String[]args)throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver","C://Users//god//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement  signupButton = driver.findElement(By.xpath("//a[@id='u_0_2']"));
		signupButton.click();
		Thread.sleep(2000);
		
		WebElement month  = driver.findElement(By.id("month"));
		month.click();
		
		Select s  = new Select(month);
		//s.selectByIndex(4);
		//s.selectByValue("5");
		//s.selectByVisibleText("May");
		//s.getOptions();
		
		List<WebElement> list= s.getOptions();
		WebElement first= list.get(10);
		System.out.println("firstIndex-->"+first);
		
		String firstValue = first.getText();
		System.out.println(firstValue);
	
	//To find total size
	
		int length =  s.getOptions().size();
		System.out.println("Total size-->"+length);
		
		WebElement last = list.get(length-1);
		String lastValue = last.getText();
		System.out.println(lastValue);
	
	//To print all values in the list
	
		for(int i=0;i<s.getOptions().size();i++) {
			WebElement index	= list.get(i);
			String indexV = index.getAttribute("value");
			String indexValue = index.getText();
			System.out.println(indexV+"-->"+indexValue);
		}
		
		//1.PRINT ALL THE TEXT OPTIONS(YEARS)
		
		/*driver.get("https://www.facebook.com/");
		WebElement  signupButton = driver.findElement(By.xpath("//a[@id='u_0_2']"));
		signupButton.click();
		Thread.sleep(2000);
		
		WebElement year=driver.findElement(By.id("year"));
		year.click();
		
		Select s=new Select(year);
		List<WebElement> list= s.getOptions();
		for(int i=0;i<s.getOptions().size();i++){
			WebElement option = list.get(i);
			String textopt = option.getText();
			System.out.println(textopt);
		}*/
		
		//2.PRINT ALL ATTRIBUTE OPTION(DAYS)
		
		/*driver.get("https://www.facebook.com/");
		WebElement  signupButton = driver.findElement(By.xpath("//a[@id='u_0_2']"));
		signupButton.click();
		Thread.sleep(2000);

		WebElement days=driver.findElement(By.id("day"));
		days.click();
		
		Select s=new Select(days);
		List<WebElement> list=s.getOptions();
		for(int i=0;i<s.getOptions().size();i++){
			WebElement attr=list.get(i);
			String attropt=attr.getAttribute("value");
			System.out.println(attropt);
		}*/
		
		//3.PRINT LAST 5 TEXT OPTION(MONTHS)

		/*driver.get("https://www.facebook.com/");
		WebElement  signupButton = driver.findElement(By.xpath("//a[@id='u_0_2']"));
		signupButton.click();
		Thread.sleep(2000);
		
		WebElement month  = driver.findElement(By.id("month"));
		month.click();
		
		Select s  = new Select(month);
		List<WebElement> list= s.getOptions();
		int length=list.size();
		System.out.println("Total size-->"+length);
		for(int i=(length-5);i<s.getOptions().size();i++) {
			WebElement textmonth = list.get(i);
			String optmonth=textmonth.getAttribute("value");
			String attrvalue=textmonth.getText();
			System.out.println(optmonth + "-->" + attrvalue);
		}*/
		
		//4.PRINT FIRST 5 TEXT OPTION(MONTHS)
		
		/*driver.get("https://www.facebook.com/");
		WebElement  signupButton = driver.findElement(By.xpath("//a[@id='u_0_2']"));
		signupButton.click();
		Thread.sleep(2000);
		
		WebElement month  = driver.findElement(By.id("month"));
		month.click();
		
		Select s  = new Select(month);
		List<WebElement> list= s.getOptions();
		for(int i=1;i<6;i++) {
			WebElement textmonth = list.get(i);
			String optmonth=textmonth.getAttribute("value");
			String attrvalue=textmonth.getText();
			System.out.println(optmonth + "-->" + attrvalue);
		}*/
		
		//5.PRINT MIDDLE TEXT OPTION(MONTHS)

		/*driver.get("https://www.facebook.com/");
		WebElement  signupButton = driver.findElement(By.xpath("//a[@id='u_0_2']"));
		signupButton.click();
		Thread.sleep(2000);

		WebElement month  = driver.findElement(By.id("month"));
		month.click();
		
		Select s  = new Select(month);
		List<WebElement> list= s.getOptions();
		int length =  s.getOptions().size();
		System.out.println("Total size-->"+length);
		System.out.println("Half size-->"+length/2);
		WebElement last = list.get(length/2);
		String midtext = last.getText();
		System.out.println(midtext);*/
		
		//6.PRINT ALTERNATE TEXT OPTION (MONTHS)
		
		/*driver.get("https://www.facebook.com/");
		WebElement month  = driver.findElement(By.id("month"));
		month.click();
		
		Select s  = new Select(month);
		List<WebElement> list= s.getOptions();
		for(int i=0;i<s.getOptions().size();i=i+2) {
			WebElement textmonth = list.get(i);
			String altermonth=textmonth.getAttribute("value");
			String attrvalue=textmonth.getText();
			System.out.println(altermonth + "-->" + attrvalue);
		}*/
		
		//7.PRINT ALL TEXT OPTION WITHOUT USING SELECT CLASS(MONTHS)
		
		/*driver.get("https://www.facebook.com/");
		WebElement month  = driver.findElement(By.id("month"));
		month.click();
		
		List <WebElement> allmonths=driver.findElements(By.xpath("//select[@id='month']/option"));
		for(WebElement text:allmonths){
			String value=text.getAttribute("value");
			String alltext=text.getText();
			System.out.println(value + "-->" + alltext);
		}*/
		
		//8.PRINT ALL TEXT OPTION WITHOUT USING SELECT CLASS(DAYS/MONTHS/YEARS)
		
		/*driver.get("https://www.facebook.com/");
		WebElement day=driver.findElement(By.id("day"));
		day.click();
		
		List<WebElement> alldays=driver.findElements(By.xpath("//select[@id='day']"));
		System.out.println("Days:");
		for(WebElement textdays:alldays){
			String alltextdays=textdays.getText();
			System.out.println(alltextdays);
		}
		Thread.sleep(1000);
		WebElement month  = driver.findElement(By.id("month"));
		month.click();
		
		List <WebElement> allmonths=driver.findElements(By.xpath("//select[@id='month']/option"));
		for(WebElement textmonths:allmonths){
			String value=textmonths.getAttribute("value");
			String alltextmonths=textmonths.getText();
			System.out.println(value + "-->" + alltextmonths);
		}
		Thread.sleep(1000);
		WebElement years=driver.findElement(By.id("year"));
		years.click();
		
		List <WebElement> allyears=driver.findElements(By.xpath("//select[@id='year']/option"));
		System.out.println("Years:");
		int length=allyears.size();
		System.out.println("Total years: " + length);
		for(WebElement textyear:allyears){
			String alltextyears=textyear.getText();
			System.out.println(alltextyears);
		}*/
		
}
}