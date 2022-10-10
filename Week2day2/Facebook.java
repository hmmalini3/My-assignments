package Week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
	
		driver.findElement(By.linkText("Create New Account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Malini");
	
		driver.findElement(By.name("lastname")).sendKeys("P");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9566430885");
		
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Mal@12");
		
		WebElement Day= driver.findElement(By.id("day"));
		
		Select date = new Select(Day);
		
		date.selectByIndex(0);
			
		WebElement month= driver.findElement(By.id("month"));
		
		Select opt = new Select(month);
		
		opt.selectByVisibleText("Oct");
		
		WebElement year= driver.findElement(By.id("year"));
		
		Select opt1 = new Select(year);
		
		opt1.selectByValue("1991");
				
		driver.findElement(By.xpath("(//input[@name = 'sex'])[1]")).click();
					
		driver.findElement(By.name("websubmit")).click();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
