package Week2day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DupLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
				
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("JH");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Isaivi");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("JH");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Isaivi");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Cosmetics");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Good");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("hmmalini3@gmail.com");		

		driver.findElement(By.name("submitButton")).click();
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("IsaiviMalini");
		
		driver.findElement(By.name("submitButton")).click();
		
		String Y= driver.getTitle();
		
		System.out.println("My page is"  + Y);
		
		
	}

}
