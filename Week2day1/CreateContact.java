package Week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        
        ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
					
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Malini");
		
		driver.findElement(By.id("lastNameField")).sendKeys("Periyasamy");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println("Malini");
		
	    String title= driver.getTitle();
	    
	    System.out.println(title);
	    
	    driver.close();
	    
	    
	    
	}

}
