package genericlibraries;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class WebDriverUtilities {
	
	
	

public void mouseHover(WebElement ele,WebDriver driver)
    {
	  Actions actions=new Actions(driver);
	  actions.moveToElement(ele).perform();
     }
  
  
  public void rightClick(WebElement ele,WebDriver driver)
     {
	  Actions actions=new Actions(driver);
	  actions.contextClick(ele).perform();
    }
  
  
  public void doubleClick(WebElement ele,WebDriver driver)
     {
	  Actions actions=new Actions(driver);
	  actions.doubleClick(ele).perform();
     }
  
  
  public void dropDown(WebElement ele,String text)
    {
	  Select select=new Select(ele);
	  select.selectByVisibleText(text);
    }
  
  public void framewithWebElementAdress(WebElement ele,WebDriver driver)
  {
	  driver.switchTo().frame(ele);
  }
  
  public void iframeWithIndex(int num,WebDriver driver)
  {
	  driver.switchTo().frame(num);
  }
  
  
  public void alertacceptpopup(WebDriver driver)
  {
	  driver.switchTo().alert().accept();
  }
  
  public void alertdismisspopup(WebDriver driver) {
	  driver.switchTo().alert().dismiss();
  }
  
  public void alertpopupText(WebDriver driver)
  {
	  Alert alert = driver.switchTo().alert();
	  Reporter.log(alert.getText(),true);
  }
  
  
 public void scrollToptoBottom(WebDriver driver)
 {
	 JavascriptExecutor javascriptexecutor=(JavascriptExecutor)driver;
	 javascriptexecutor.executeScript("window.scrollBy(0, 5000)");
 }
 
 public void scrollBottontoTop(WebDriver driver)
 {
	 JavascriptExecutor javascriptexecutor=(JavascriptExecutor)driver;
	 javascriptexecutor.executeScript("window.scrollBy(0, -5000)");
 }
 
 public void scrollToElement(WebElement ele,WebDriver driver)
 {
	 JavascriptExecutor javascriptexecutor=(JavascriptExecutor)driver;
	 javascriptexecutor.executeScript("arguments[0].scrollIntoView();",ele);
 }
 
 public void switchChildWindow(WebDriver driver)
 {
	 Set<String>child=driver.getWindowHandles();
	 for(String ch:child)
	 {
		driver.switchTo().window(ch); 
	 }
 }
 
 public void multipleTabs(int index,WebDriver driver)
 {
	 Set<String>child=driver.getWindowHandles();
	 ArrayList<String>array=new ArrayList<String>(child);
	 driver.switchTo().window(array.get(index));
	 
 }
 public void swtichingbackFrame(WebDriver driver)
 {
	 driver.switchTo().defaultContent();
 }
 
 public void waitWebElement(WebElement ele,WebDriver driver)
 {
	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	 wait.until(ExpectedConditions.visibilityOf(ele));
 }
 
 public void waitElementClick(WebElement ele,WebDriver driver)
 {
	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	 wait.until(ExpectedConditions.elementToBeClickable(ele));
 }
 
 
}
