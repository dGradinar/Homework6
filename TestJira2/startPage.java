
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class startPage {

	private FirefoxDriver driver;
	
	public startPage(FirefoxDriver driver){
		this.driver = driver;
		}
	
	public loggedInPage login(String login, String password) {
		
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(login);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.id("find_link")).click();
		driver.findElement(By.id("issues_new_search_link_lnk")).click();
		driver.findElement(By.id("searcher-query")).clear();
		driver.findElement(By.id("searcher-query")).sendKeys("Demo_Bug3");
		driver.findElement(By.id("searcher-query")).sendKeys(Keys.ENTER);
		
		return new loggedInPage(driver);
	}
}
