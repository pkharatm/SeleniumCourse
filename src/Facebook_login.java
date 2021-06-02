import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pkharatm\\Downloads\\DownloadSetUp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("poojasrk1997@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("pooresha");
		driver.findElement(By.name("login")).click();
		driver.close();
		

	}

}
