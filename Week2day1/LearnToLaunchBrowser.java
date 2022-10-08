import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnToLaunchBrowser {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver= new ChromeDriver ();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		
		
		
		
	}

}
