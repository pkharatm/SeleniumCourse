import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
				
		WebDriver driver1=new FirefoxDriver();
		driver1.get("https://www.google.com");
		driver.close();
		driver1.close();

	}

}
