package Week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
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
		
		WebElement ownerShip= driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		
		Select opt=new Select (ownerShip);
						
		opt.selectByIndex(3);
		
		Thread.sleep(3000);
	
		WebElement currency= driver.findElement(By.id("createLeadForm_currencyUomId"));
		
		Select opt1=new Select(currency);
			
		opt1.selectByValue("EUR");
	
		Thread.sleep(3000);
		
		WebElement country= driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		
		Select opt2= new Select(country);
		Thread.sleep(3000);
		
		opt2.selectByVisibleText("France");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		
		
		
		
		
		
		
		
	}

}
