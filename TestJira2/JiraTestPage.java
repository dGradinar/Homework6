import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class JiraTestPage {
	private FirefoxDriver driver;
	
	@Before

	public void startBrowser() {
		driver = new FirefoxDriver(); 
		 
		 //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.get("https://id.atlassian.com/login?application=jac&continue=https%3A%2F%2Fjira.atlassian.com%2Fprojects%2FDEMO");
		 driver.manage().window().maximize();
}
	
	@After
	
	public void closeBrowser(){
		
		driver.quit();
	}
		 
	@Test
	
	public void testIssueCreated(){
		
		startPage home = new startPage (driver);
		loggedInPage loggedin = home.login("gradinar95@gmail.com", "dima1dima");
		profilePage profile = loggedin.openProfile();
	}
}