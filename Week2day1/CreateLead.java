import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxDriver driver= new FirefoxDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//to enter login details
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Malini");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hema Malini");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Periyasamy");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("P");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Clothings");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Good Products");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("hmmalini3@gmail.com");
		
				
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println("The page is opentaps CRM");
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		

	}

}
