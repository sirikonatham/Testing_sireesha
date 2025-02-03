package pom;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.BaseClass;

public class AccountPage extends BaseClass {
    @FindBy(xpath="//a[text()='HOME FURNISHING']")
    private WebElement homefurnish;
    @FindBy(xpath="//a[text()='MEN']")
    private WebElement men;
    
    @FindBy(xpath="//a[text()='AC Comforter']")
    private WebElement accomfort;
    

	
	@FindBy(xpath= "//a[text()='Round Neck Sweaters']")
    private WebElement menbtn;
    
    
    @FindBy(xpath="//a[text()='WOMEN']")
    private WebElement women;
    
    @FindBy(xpath="//img[contains(@alt,'Women Red Self Design')]")
    private WebElement womenprd;
    
    @FindBy(xpath="//a[text()='Gift Card']")
    private WebElement gifts;
    
    
    @FindBy(xpath="//a[@aria-label='Search']")
    private WebElement searchbox;
    
    @FindBy(name="q")
    private WebElement searchbtn;
    @FindBy(xpath="//button[text()='View all results']")
    private WebElement viewresultbtn;
    
    @FindBy(xpath="//span[contains(text(),'Brown Cotton 400 ')]")
    private WebElement handtowel;
    
    @FindBy(xpath="//img[@alt='home logo']")
    private WebElement home;

    @FindBy(xpath="//a[text()='Addresses']")
    private WebElement address;
    
    @FindBy(xpath="//a[contains(text(),'WOMEN')]")
    private WebElement wlist;
    public AccountPage (WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
	
	
    public WebElement getHomefurnish() {
		return homefurnish;
	}
	 public WebElement getMen() {
			return men;
		}
    
	public void acComforter()
	{
		accomfort.click();
	}
	
	public void menButton()
	{
		menbtn.click();
	}
	
	
	public WebElement getWomen() {
		return women;
	}
	public void womenProductbtn()
	   {
		   womenprd.click();
	   }
   public void giftCards()
   {
	   gifts.click();
   }
   
   public void searchBox()
   {
	   searchbox.click();
   }
   public void searchButton(String name) 
   {
	   searchbtn.sendKeys(name);
   }
   public void viewResultBtn()
   {
	   viewresultbtn.click();
   }
   public void handtowel()
   {
	   handtowel.click();
   }
   
   public void homeLink()
   {
	   home.click();
   }
   
   public void editAddress()
   {
	   address.click();
   }
   
   public void womenList()
   {
	   wlist.click();
   }
}
