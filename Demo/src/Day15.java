import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day15 {

	public static void main(String[]args)throws InterruptedException, IOException, AWTException{
		System.setProperty("webdriver.chrome.driver","C://Users//god//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		/*driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table=driver.findElement(By.id("customers"));
		List<WebElement> row1=table.findElements(By.tagName("tr"));
		WebElement firstrow=row1.get(1);
		
		// To get first row datas
		
		List<WebElement>data1=firstrow.findElements(By.tagName("td"));
		System.out.println("First Row datas:");
		for(WebElement data:data1){
			String name=data.getText();
			System.out.println(name);
		}
		
		//To get last row datas
		
		int length=row1.size()-1;
		System.out.println("Total size-->" + length);
		WebElement lastrow=row1.get(row1.size()-1);
		String lastdata=lastrow.getText();
		System.out.println(lastdata);
		
		//To print all data
		
		for(int i=0; i<row1.size();i++){
			WebElement firstrow=row1.get(i);
			List<WebElement>data1=firstrow.findElements(By.tagName("td"));
			System.out.println("Datas:");
			for(WebElement data:data1){
				String alldata=data.getText();
				System.out.println(alldata);
			}
		}
		
		//To print particular data
		
		WebElement firstrow=row1.get(3);
		List<WebElement>data=firstrow.findElements(By.tagName("td"));
		WebElement coldata=data.get(2);
		System.out.println(coldata.getText());
		
		//To print 1st column data
		
		List<WebElement> col=table.findElements(By.tagName("tr"));
		List<WebElement> column=driver.findElements(By.tagName("th"));
		int length=column.size();
		System.out.println("Total column-->" + length);
		List<WebElement>col1=table.findElements(By.tagName("td"));
		for(WebElement text:col1){
			String alltext=text.getText();
			System.out.println(alltext);
		}
		
		List<WebElement>col=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
		int length=col.size();
		System.out.println("Total column-->" + length);
		for(WebElement text:col){
			String alltext=text.getText();
			System.out.println(alltext);
	}*/
		
		//1.PRINT FIRST 2ROWS ALL DATA
		
		/*driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table=driver.findElement(By.id("customers"));
		
		List<WebElement>row=table.findElements(By.tagName("tr"));
		System.out.println("First 2rows data:");
		for(int i=1;i<3;i++){
			WebElement rows2=row.get(i);
			List<WebElement>rowdata=rows2.findElements(By.tagName("td"));
			for(WebElement data:rowdata){
				String alldata=data.getText();
				System.out.println(alldata);
			}
		}*/
		
		//2.PRINT LAST 2 ROWS ALL DATA
		
		/*driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table=driver.findElement(By.id("customers"));
		
		
		List<WebElement>row=table.findElements(By.tagName("tr"));
		int length=(row.size()-2);
		for(int i=length;i<row.size();i++){
			WebElement lastrow=row.get(i);
			List<WebElement>lastdata=lastrow.findElements(By.tagName("td"));
			for(WebElement data:lastdata){
				String alldata=data.getText();
				System.out.println(alldata);
			}
		}*/
		
		//3.PRINT ALTERNATIVE ROW DATA
		
		/*driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table=driver.findElement(By.id("customers"));
		
		List<WebElement>row=table.findElements(By.tagName("tr"));
		System.out.println("Alternate data-->");
		int length=row.size();
		System.out.println(length);
		for(int i=0;i<length;i=i+2){
			WebElement altrow=row.get(i);
			List<WebElement>altdata=altrow.findElements(By.tagName("td"));
			for(WebElement data:altdata){
				String alldata=data.getText();
				System.out.println(alldata);
			}
		}*/
		
		//4.PRINT LAST COLUMN ALL ROW DATA
		
		/*driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table=driver.findElement(By.id("customers"));
		
		List<WebElement>col=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
		int length=col.size();
		System.out.println("Total column-->" + length);
		for(WebElement text:col){
			String alltext=text.getText();
			System.out.println(alltext);
		}*/
		
		//5.TOTAL COUNT OF TABLES
		
		/*driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table=driver.findElement(By.id("customers"));
		
		List<WebElement>row=table.findElements(By.tagName("tr"));
		int length=row.size();
		System.out.println("Total rows-->" + length);
		
		List<WebElement>col=table.findElements(By.tagName("th"));
		int length1=col.size();
		System.out.println("Total column-->" + length1);*/
		
		//7.PRINT ALTERNATIVE COLUMN ALL ROW DATA
		
		/*driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table=driver.findElement(By.id("customers"));
		
		List<WebElement>col=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
		int length=col.size();

		System.out.println("Alternative column-->");
		for(int i=0;i<length;i=i+2){
			WebElement altcol=col.get(i);
			String alldata=altcol.getText();
			System.out.println(alldata);
		}
		
		List<WebElement>col1=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
		int length1=col1.size();

		for(int i=0;i<length1;i=i+2){
			WebElement altcol=col1.get(i);
			String alldata=altcol.getText();
			System.out.println(alldata);
		}*/
		
		//8.PRINT ALL DATA WITH LOOPING
		
		/*driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table=driver.findElement(By.id("customers"));
		
		List<WebElement>alldata=table.findElements(By.tagName("tr"));
		List<WebElement>datas=driver.findElements(By.tagName("th"));
		for(WebElement alldatas:alldata){
			List<WebElement>alldats=table.findElements(By.tagName("td"));
			String alltext=alldatas.getText();
			System.out.println(alltext);	
		}*/
		
		//9.PRINT THE MIDDLE ROW DATA
		
		/*driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table=driver.findElement(By.id("customers"));
		
		List<WebElement>row=table.findElements(By.tagName("tr"));
		List<WebElement>row1=table.findElements(By.tagName("td"));
		int length=(row.size()-1)/2;
		WebElement midrow=row.get(length);
		String alltext=midrow.getText();
		System.out.println(alltext);*/
		
		//10.PRINT ALTERNATE DATA IN EACH COLUMN
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table=driver.findElement(By.id("customers"));
		
	}
}
