package pom;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.BaseClass;

public class AcWishListPage extends BaseClass {
	
   @FindBy(xpath="//a[@data-tippy-content='Add to Wishlist']")
   private WebElement wishbtn;
   
   @FindBy(xpath=" //span[contains(text(),' Wishlist')] ")
   private WebElement wishlistpage;
   
   @FindBy(id="pincode")
   private WebElement pin;
   
   @FindBy(id="check-pincode")
   private WebElement checkbox;
   
   @FindBy(xpath="//div[@class='flits-product-item-main']")
   private WebElement wishpageprd;
   
   @FindBy(xpath="//button[contains(@data-flits-product-title,'Brown Cotton 400 GSM' )]")
   private WebElement closebtn;
   
   @FindBy(xpath="//span[@class='ft__']")
   private WebElement details;
   @FindBy(xpath="(//div[@class='yash-blog-text shreyh'])[11]")
   private WebElement address;
   
   @FindBy(xpath="//a[text()='Our Stores']")
   private WebElement store;
   
   @FindBy(xpath="//div[@class='product_wishlist']")
   private WebElement wishbt;
   @FindBy(name="email")
   private WebElement popemail;
   
   @FindBy(xpath="//button[text()=' Add to Wishlist ']")
   private WebElement addbutton;
   
   @FindBy(xpath="(//span[@class='loader-button__text'])[2]")
	private WebElement addtocart;
   
   @FindBy(id="order-note-toggle")
   private WebElement note;
   
   @FindBy(id="cart[note]")
   private WebElement ordertxt;
   
   @FindBy(xpath="//button[text()='Save']")
   private WebElement saving;
   
   @FindBy(xpath="//button[@data-action='close']")
   private WebElement cartcls;
public AcWishListPage(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
   public void wishButton()
   {
	   wishbtn.click();
   }
   
   public void wishListpage()
   {
	   wishlistpage.click();
   }
   public void pinCode(String pincode) 
   {
	   pin.sendKeys(pincode);
   }
   public void checkBox()
   {
	   checkbox.click();
   }
   public WebElement getWishpageprd() {
		return wishpageprd;
	}
   
   public void closeButton()
   {
	   closebtn.click();
   }
   public void detailsbtn()
   {
     details.click();
   }
   
   public String adressbtn()
   {
	 return   address.getText();
   }
   public void ourstore()
   {
     store.click();
   }
   public void wish()
   {
	   wishbt.click();
   }
   public void emailpop(String name) 
   {
	   popemail.sendKeys(name);
   }
   
   public void addText()
   {
	   addbutton.click();
   }
   
   public void addToCartbtn()
	{
		addtocart.click();
	}
   public void orderNote()
   {
	   note.click();
   }
   public void orderNoteTxt(String name)
   {
	   ordertxt.sendKeys(name);
   }
   public void saveText()
   {
	   saving.click();
   }
   public void addTocartCls()
   {
	   cartcls.click();
   }
}
