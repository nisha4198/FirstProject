import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "/Users/nisha/Downloads/chromedriver-win64/chromedriver-win64.exe");
	      // WebDriver driver = new ChromeDriver();
	      // WebDriver driver = new FirefoxDriver();
	      // WebDriver driver = new EdgeDriver();
	       //driver.get("https://rahulshettyacademy.com/locatorspractice/");
	     // System.out.println(driver.getTitle());
	    //  System.out.println(driver.getCurrentUrl());
	      //driver.close();
	      
	      // Arrays
		
		List<String> app = new ArrayList<String>();
		app.add("Nisha");
		app.add("Sangeeta");
		app.add("Rahul");
		
		for(String d: app)
		{
		System.out.println(d);
		}

		System.out.println(app.contains("Sangeeta"));
	
		
		
		String[] str = {"Nisha","is","Learning"};
		for(int j= 0; j<str.length;j++)
		{
			// System.out.println(str[j]);
		}
		
		for(String s :str)
		{
			 //System.out.println(s);
		}
	      int[] arr = new int[5];
	      arr[0] =2;
	      arr[1] = 7;
	      arr[2] = 6;
	      arr[3]= 9;
	      arr[4] = 10;
	      for(int i = 0; i<arr.length;i++)
	      {
	      if(arr[i]%2 ==0)
	      {
	    	 // System.out.println(arr[i]);
	    	  break;
	      }
	      
	      else
	      {
	    	 // System.out.println(arr[i]+ "this is not a multiple of 2");
	      }
	      }
	      
	      
	      
	      int [] arr1 = {2,4,6,8,10};
	      for(int i = 0; i<arr1.length;i++)
	      {
	    	  //System.out.println(arr[i]);
	      }
	      //convert normal array to arraylist
	  List<int[]> nameArrayList = Arrays.asList(arr1);
	  
	  String message = "Success will be yours";
String[] messagesplit = message.split(" ");
for( String s :messagesplit)
{
System.out.println(s.trim());	
}
}
	  
	      }
	   
	
	


