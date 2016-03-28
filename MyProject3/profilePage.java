package automationFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class profilePage {

	private FirefoxDriver driver;
	
	public profilePage(FirefoxDriver driver){
		this.driver = driver;
		}
	
	public String getUserName(){
		
		return driver.findElement(By.id("up-user-title-name")).getText();
	}
	
}