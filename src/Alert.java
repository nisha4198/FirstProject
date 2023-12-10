import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Alert {

	public static void main(String[] args) {
		
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	driver.findElement(By.id("name")).sendKeys("Nisha");
	driver.findElement(By.xpath("//input[@value ='Alert']")).click();
	System.out.println(	driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	
	driver.findElement(By.id("confirmbtn")).click();
	driver.switchTo().alert().dismiss();

		// TODO Auto-generated method stub

	}
	public void Print_A()
	{
	 System.out.println("Using Gith first time");
	}
	public void Print_B()
	{
	 System.out.println("Using Gith second time");
	}
	public void Print_C()
	{
	 System.out.println("Using Gith first time");
	}
	public void Print_D()
	{
	 System.out.println("Using Gith second time");
	}
	public void Print_E()
	{
	 System.out.println("Using Gith first time");
	}
	public void Print_F()
	{
	 System.out.println("Using Gith second time");
	}

}
