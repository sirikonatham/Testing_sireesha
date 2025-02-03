package pom;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.BaseClass;

public class ProductsPage  extends BaseClass{
    @FindBy(xpath="//a[contains(text(),'Printed Double Bed 909 GSM Blanket')]")
    private WebElement blanket;
    
    @FindBy(id="filter.v.price.gte")
    private WebElement minprice;
    
    @FindBy(id="filter.v.price.lte")
    private WebElement maxprice;
    
    @FindBy(xpath="//a[text()='Reset filters']")
    private WebElement reset;
    
    @FindBy(xpath="//a[text()='Women Black Self Design Stole']")
    private WebElement wmn;
    @FindBy(xpath="//a[contains(text(),'Women Maroon Solid')]")
    private WebElement wjacket;
    public ProductsPage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
    public void blanketprd()
    {
      blanket.click();
    }
    
    public void minPrice(String name) 
    {
    	minprice.sendKeys(name);
    }
    
    public void maxPrice(String name) 
    {
    	maxprice.sendKeys(name);
    }
    public void resetFilter()
    {
    	reset.click();
    }
    public void minPrice1(String name) 
    {
    	minprice.sendKeys(name);
    }
    public void maxPrice1(String name) 
    {
    	maxprice.sendKeys(name);
    }
    
    public void womenJacket()
    {
      wjacket.click();
    }
    public void womenDress()
    {
    	wmn.click();
    }
}
