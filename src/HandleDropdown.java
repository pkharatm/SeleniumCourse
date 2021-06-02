import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pkharatm\\Downloads\\SeleniumWebDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?&campaign_id=973072061&extra_1=s%7Cc%7C256741341323%7Ce%7Cfacebook%7C&placement=&creative=256741341323&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D973072061%26adgroupid%3D54006406691%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-297690534863%26loc_physical_ms%3D9062241%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIoML8l_CA8AIVQdtMAh3lUwInEAAYASAAEgKFXfD_BwE");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		WebElement day=driver.findElement(By.id("day"));
		Select day_value=new Select(day);
		day_value.selectByIndex(15);
		
		WebElement month=driver.findElement(By.id("month"));
		Select month_value=new Select(month);
		month_value.selectByValue("5");
		
		
		WebElement year=driver.findElement(By.id("year"));
		Select year_value=new Select(year);
		year_value.selectByVisibleText("2020");
		
		
		
		
		
		

	}

}
