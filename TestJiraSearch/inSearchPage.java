
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class inSearchPage {
	private FirefoxDriver driver;
	
	public inSearchPage(FirefoxDriver driver){
		this.driver = driver;
		}	

	public SearchPage openSearchPage(FirefoxDriver driver){
	
		
		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div[3]/ul/li[3]/a/span/span/img")).click();

		driver.findElement(By.id("find_link")).click();
		driver.findElement(By.id("issues_new_search_link_lnk")).click();

		return new SearchPage(driver);
		
	}
}
