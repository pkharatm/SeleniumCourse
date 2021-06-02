package way2Automation;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandleDemo {

	public static void main(String[] args) {
				
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\pkharatm\\Downloads\\SeleniumWebDrivers\\chromedriver.exe");
				
				 WebDriver driver=new ChromeDriver();
				 
				 driver.get("http://way2automation.com/way2auto_jquery/automation-practice-site.html");
				 
				 driver.manage().window().maximize();
				 
				 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 
				 String parent=driver.getWindowHandle();
				 
				 System.out.println("Parent Window"+parent);
				 
				 driver.findElement(By.linkText("Alert")).click();
				 
				 Set<String> allwindows= driver.getWindowHandles();
				 
				 int count=allwindows.size();
				 
				 System.out.println("Total Window"+count);
				 
				 for(String child:allwindows) {
					 if(!parent.equalsIgnoreCase(child))
					 {
						 driver.switchTo().window(child);
						 System.out.println(driver.getCurrentUrl());
						 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='alert/simple-alert.html']")));
						 driver.findElement(By.xpath("//button[text()='Click the button to display an alert box:']")).click();
						 System.out.println(driver.switchTo().alert().getText()); 
						 driver.switchTo().alert().accept();
						 System.out.println("Alert handled successfully");
			
			
						 //driver.quit();
						 
					 }
				 }
				 
				//WebDriverWait wait= new WebDriverWait(driver, 50);
				//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.xpath("//iframe[@src='alert/simple-alert.html']"))));
				 
				 
	}
	
}