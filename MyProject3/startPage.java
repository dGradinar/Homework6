package automationFramework;
import org.openqa.selenium.By;
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
		driver.findElement(By.id("create_link")).click();
		driver.findElement(By.id("summary")).clear();
		driver.findElement(By.id("summary")).sendKeys("Demo_Bug3");
		driver.findElement(By.id("priority-field")).clear();
		driver.findElement(By.id("priority-field")).sendKeys("Minor");
		driver.findElement(By.id("description")).sendKeys("TEsssst");
		driver.findElement(By.id("create-issue-submit")).click();
		driver.findElement(By.id("find_link")).click();
		driver.findElement(By.id("issue_lnk_585360_lnk")).click();
		
		return new loggedInPage(driver);
	}
}
