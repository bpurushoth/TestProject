package testpackage;  
import static org.testng.AssertJUnit.assertEquals;
import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;  
import org.testng.annotations.BeforeTest;  
import org.testng.annotations.Test;
public class MavenTest1 {  
public String baseUrl = "https://www.google.com/";  
String driverPath = "/usr/bin/chromedriver";  
public WebDriver driver ;   
@Test             
public void test() {      
// set the system property for Chrome driver      
System.setProperty("webdriver.chrome.driver", driverPath);  
// Create driver object for CHROME browser  
ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                chromeOptions.addArguments("--no-sandbox");
 
                WebDriver driver = new ChromeDriver(chromeOptions);  
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
driver.manage().window().maximize();  
driver.get(baseUrl);  
// get the current URL of the page  
String URL= driver.getCurrentUrl();  
System.out.print(URL);  
//get the title of the page  
String title = driver.getTitle();
String ExpectedTitle = "Google";
Assert.assertEquals(title, ExpectedTitle);
driver.quit(); 
}     
@BeforeTest  
public void beforeTest() {    
System.out.println("before test");  
}    
/*@AfterTest  
public void afterTest() {  
driver.quit();  
System.out.println("after test");  
}    */  
}  
