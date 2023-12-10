import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
				
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();
		
		//checking that checkbox is not selected earlier after clicking it the checkbox got selected.
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[value = 'red']")).isSelected());
		driver.findElement(By.cssSelector("input[value = 'red']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[value = 'red']")).isSelected());
	
		//To find the number of checkbox available on a page using Size() method
	
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type ='checkbox']")).size(), 6); */
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@data-testid ='round-trip-radio-button']")).click();

		driver.findElement(By.xpath("//*[@data-testid ='one-way-radio-button']")).click();
	
		
		if(driver.findElement(By.xpath("(//div[@data-focusable='true'])[17]")).getAttribute("style").contains("background"))
		{
			Assert.assertTrue(true);
	
		}
		else
		{
			Assert.assertFalse(false);
			
		}
		
		
		/*driver.get("https://www.delta.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='calenderDepartSpan']")).click();
		driver.findElement(By.xpath("//*[@class ='dl-state-default']")).click(); */
                            
		
		
		

	}
	
	public void Print_A1()
	{
	 System.out.println("Using Gith first time");
	}
	public void Print_B2()
	{
	 System.out.println("Using Gith second time");
	}  

}
