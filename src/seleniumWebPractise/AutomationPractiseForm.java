package seleniumWebPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractiseForm {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\pkharatm\\Downloads\\SeleniumWebDrivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.findElement(By.id("at-cv-lightbox-close")).click();
		
	
		driver.findElement(By.id("user-message")).sendKeys("My name is pooja");
		
		driver.findElement(By.xpath("//button[text()='Show Message']")).click();
		
		String actual_msg=driver.findElement(By.xpath("//span[@id='display']")).getText();
		String expected_msg="My name is pooja";

		
		System.out.println("Test Passed Successfully");
		
		driver.quit();
		
	}

}
