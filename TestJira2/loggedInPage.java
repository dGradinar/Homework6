
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class loggedInPage {
	private FirefoxDriver driver;
	
	public loggedInPage(FirefoxDriver driver){
		this.driver = driver;
		}
	
	public profilePage openProfile(){
		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[3]/ul/li[3]/a/span/span/img")).click();

		driver.findElement(By.id("summary")).click();

		return new profilePage(driver);
		
	}

}
