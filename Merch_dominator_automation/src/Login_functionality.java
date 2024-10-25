import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_functionality {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver1 = new ChromeDriver();
//		System.setProperty("webdriver.edge.driver", "D:\\harshad\\edgedriver_win64\\msedgedriver.exe");
//		WebDriver driver1 = new EdgeDriver();
		driver1.get("https://dev.merchdominator.com/login");
		
		driver1.findElement(By.id("login-email")).sendKeys("harshad.w@crestinfosystems.com");
		WebElement lg1 = driver1.findElement(By.id("login-email"));
		lg1.sendKeys(Keys.TAB);
		
		driver1.findElement(By.id("login-password")).sendKeys("12345678");
		
		Thread.sleep(500);
		driver1.switchTo().defaultContent();
		driver1.findElement(By.cssSelector("#btnSubmit")).click();
	}

}
