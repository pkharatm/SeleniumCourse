import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadioButtonCheckbox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pkharatm\\Downloads\\SeleniumWebDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		List<WebElement> radiobutton=driver.findElements(By.xpath("//input[@type='radio'][@name='lang']"));
		for(int i=0; i<radiobutton.size();i++)
		{
			WebElement local_radiobutton=radiobutton.get(i);
			String value=local_radiobutton.getAttribute("value");
			System.out.println("Value of the radiobuttons: "+value);
			if(value.equalsIgnoreCase("PYTHON"))
			{
				local_radiobutton.click();
				System.out.println("Clicked on PYTHON");
				
			}
		}
		
		
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(int p=0;p<checkbox.size();p++)
		{
			WebElement local_checkbox=checkbox.get(p);
			String value=local_checkbox.getAttribute("id");
			System.out.println("Values of Checkbox: "+value);
			
			if(value.equalsIgnoreCase("code"))
			{
				local_checkbox.click();
			}
		}
		
	}

}
