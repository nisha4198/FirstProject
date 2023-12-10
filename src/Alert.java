import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

}
