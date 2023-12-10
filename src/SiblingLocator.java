import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/practice-project");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//List<String> elemEnts =  driver.findElements(By.xpath(//"div[@class='nav-outer clearfix']/nav/div[2]/ul"));
	}

}
