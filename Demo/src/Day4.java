import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4 {
	public static void main(String[]args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C://Users//god//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//FACEBOOK
		
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		WebElement text=driver.findElement(By.xpath("//span[text()='Continue to Gmail']"));
		System.out.println(text.getText());
		
		WebElement contain=driver.findElement(By.xpath("//span[contains(text(),'continue')]"));
		contain.getText();
		
		//1.ELIMGRC
		
		/*driver.get("https://elimgrc.com/category/appam/");
		
		//WebElement contain1=driver.findElement(By.xpath("//p[contains(text(),'Our heart')]"));
		//System.out.println(contain1.getText());
		
		WebElement contain=driver.findElement(By.xpath("(//div[@class='col-md-12 post-details'])[1]"));
		System.out.println(contain.getText());*/
}
}