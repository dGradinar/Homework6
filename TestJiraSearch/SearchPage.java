
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchPage {

	private FirefoxDriver driver;
	
	public SearchPage(FirefoxDriver driver){
		this.driver = driver;
		}
	
	public String getSearchResult(){
		
		return driver.findElement(By.id("Demo_Bug3")).getText();
	}
	
}