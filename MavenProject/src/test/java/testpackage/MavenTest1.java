package testpackage;  
import static org.testng.AssertJUnit.assertEquals;
import java.util.concurrent.TimeUnit;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;  
import org.testng.annotations.BeforeTest;  
import org.testng.annotations.Test;  
public class MavenTest1 {  
public String baseUrl1 = "https://www.google.com/";
public String baseUrl2 = "https://twingo.techmahindra.com/"; 
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
driver.get(baseUrl1);  
// get the current URL of the page  
String URL= driver.getCurrentUrl(); 
String title1 = driver.getTitle();
String ExpectedTitle1 = "Google";
Assert.assertEquals(title1, ExpectedTitle1);
System.out.print(URL);  
//get the title of the page  
                  
System.out.println(title1); 
driver.quit(); 
}     
@Test             
public void twingo() {      
// set the system property for Chrome driver      
System.setProperty("webdriver.chrome.driver", driverPath);  
// Create driver object for CHROME browser  
ChromeOptions chromeOptions = new ChromeOptions();
chromeOptions.addArguments("--headless");
chromeOptions.addArguments("--no-sandbox");

WebDriver driver = new ChromeDriver(chromeOptions); 
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
driver.manage().window().maximize();  
driver.get(baseUrl2);  
// get the current URL of the page  
String URL= driver.getCurrentUrl(); 
String title2 = driver.getTitle();
String ExpectedTitle2 = "Sign in to your account";
Assert.assertEquals(title2, ExpectedTitle2);
System.out.print(URL);  
//get the title of the page  
                  
System.out.println(title2); 
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
