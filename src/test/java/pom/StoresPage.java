package pom;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.BaseClass;

public class StoresPage extends BaseClass {
	 @FindBy(id="searchInput")
	  private WebElement search;
	 @FindBy(xpath="//a[@class='directions-btn']")
	 private WebElement direction;
	    public StoresPage(WebDriver driver)
	    {
	    	PageFactory.initElements(driver,this);
	    }
	    
	    public void searchbar(String name) 
	    {
	    	search.sendKeys(name);
	    }
	    public void getDirection()
	    {
	    	direction.click();
	    }
}
