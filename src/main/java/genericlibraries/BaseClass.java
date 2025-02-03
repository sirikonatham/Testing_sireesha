package genericlibraries;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
@Listeners(Listners.class)
public class BaseClass {
     public static  WebDriver driver;
     public DataUtilities datautilities=new DataUtilities();
     public WebDriverUtilities utilities=new WebDriverUtilities();
     
     @BeforeMethod
     public void openApp() throws EncryptedDocumentException, IOException
     {
    	 driver=new EdgeDriver();
    	 driver.manage().window().maximize();
    	 driver.get(datautilities.readingExcelFile("Sheet1", 1, 0));
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     }
     
     
     
     @AfterMethod
     public void closeApp() throws IOException
     {
    	
    	 driver.quit();
     }
}
