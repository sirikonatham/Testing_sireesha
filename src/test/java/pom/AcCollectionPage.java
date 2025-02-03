package pom;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibraries.BaseClass;

public class AcCollectionPage extends BaseClass {
   @FindBy(xpath="//button[text()='Size']")
   private WebElement sizebtn;
   
   @FindBy(xpath="//label[@class='block-swatch__item']")
   private WebElement sizesingle;
   
   @FindBy(xpath="//button[text()='Color']")
   private WebElement color;
   
   @FindBy(xpath="(//label[@class='color-swatch__item'])[7]")
   private WebElement colorbtn;
   
   @FindBy(xpath="//button[text()='Brand']")
   private WebElement brand;
   
   @FindBy(id="filter.p.m.custom.brand-1")
   private WebElement brandcheckbox;
   
   @FindBy(xpath="//button[text()='Availability']")
   private WebElement availablity;
   
   @FindBy(id="filter.v.availability-1")
   private WebElement avlcheckbox;
   
   @FindBy(xpath="(//img[@class='product-item__secondary-image'])[2]")
   private WebElement product;
   @FindBy(id="filter.v.price.gte")
   private WebElement minprice;
   
   @FindBy(id="filter.v.price.lte")
   private WebElement maxprice;
   
    @FindBy(xpath="(//label[@class='block-swatch__item'])[3]")
    private WebElement mensize;
   
   @FindBy(id="filter.p.m.custom.brand-3")
   private WebElement menbrand;
   
   @FindBy(xpath="//button[text()='Sleeve']")
   private WebElement slvbtn;
   
   @FindBy(xpath="//label[@for='filter.p.m.custom.sleeve_id-1']")
   private WebElement slvcheckbox;
   
   @FindBy(xpath="//a[contains(text(),'Men White Solid Round ')]")
   private WebElement menproduct;
   
  
   
   
   
   @FindBy(xpath="//a[text()='Women Beige Stripe Jacket']")
   private WebElement womendress;
   
   @FindBy(xpath="(//label[@class='block-swatch__item'])[2]")
   private WebElement wmndresssize;
   
   @FindBy(xpath="(//button[@class='quantity-selector__button'])[2]")
   private WebElement quantity;
   
   @FindBy(xpath="//a[@data-tippy-content='Add to Wishlist']")
   private WebElement towelwishlist;
   
   @FindBy(xpath="//span[contains(text(),' Wishlist')]")
   private WebElement wishpage;
   
   @FindBy(xpath="//a[contains(text(),'SHOP Blankets')] ")
   private WebElement blankets;
   
   @FindBy(xpath="//button[text()='Add a new address']")
   private WebElement newadress;
   
   @FindBy(id="address-new[first_name]")
   private WebElement fname;
   @FindBy(id="address-new[last_name]")
   private WebElement lname;
   @FindBy(id="address-new[company]")
   private WebElement cmname;
   
   @FindBy(id="address-new[phone]")
   private WebElement phone;
   @FindBy(id="address-new[address1]")
   private WebElement add1;
   @FindBy(id="address-new[city]")
   private WebElement cname;
   @FindBy(id="address-new[zip]")
   private WebElement zip;
   
   @FindBy(id="address-new[country]")
   private WebElement country;
   
  @FindBy(id="address-new[province]")
   private WebElement pname;
   
   @FindBy(id="address-new[default]")
   private WebElement checkbox;
   
   @FindBy(xpath="//span[text()='Add a new address']")
   private WebElement addNew;
   
   @FindBy(xpath="//button[text()='Delete']")
   private WebElement delete;
   
   @FindBy(xpath="(//div[@class='custom-tems slick-slide slick-active'])[4]")
   private WebElement womentxt;
   
  @FindBy(xpath="//div[@class='popover-container']")
  private WebElement sort;
  
  @FindBy(xpath="(//span[@class='popover__choice-label'])[7]")
  private WebElement old;
  
  @FindBy(xpath="//a[text()='Womens Red Plain T-Shirt']")
  private WebElement prd;
  
public AcCollectionPage(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
   public void sizeButton()
   {
	   sizebtn.click();
   }
   
   public void sizeButtonSignle()
   {
	   sizesingle.click();
   }
   public void colorButton()
   {
	   color.click(); 
   }
   public void colorButtonCheckbox()
   {
	   colorbtn.click();
   }
   
   public void brandbtn()
   {
	   brand.click();
   }
   
   public void brandButtonCheckbox()
   {
	   brandcheckbox.click();
   }
   public void avaliablebtn()
   {
	   availablity.click();
   }
   public void avlCheckbox()
   {
	   avlcheckbox.click();
   }
   
   public void productimg()
   {
	   product.click();
   }
   public void minPrice1(String name) 
   {
   	minprice.sendKeys(name);
   }
   public void maxPrice1(String name) 
   {
   	maxprice.sendKeys(name);
   }
   
   public void menSizebtn()
   {
	   mensize.click();
   }
   
   public void menBrandbtn()
   {
	   menbrand.click();
   }
   
   public void slvButton()
   {
	   slvbtn.click();
   }
   
   public void slvCheckBox()
   {
	   slvcheckbox.click();
   }
   public void menProducts()
   {
	   menproduct.click();
   }
  
   
   public void womenDress()
   {
	   womendress.click();
   }
   
   
   public void womenDressSize()
   {
	   wmndresssize.click();
   }
   
   public void quantitysize()
   {
	   quantity.click();
   }
   
   
   public void towelWishlist()
   {
	   towelwishlist.click();
   }
   
   public void wishPage()
   {
	   wishpage.click();
   }
   
   public void shopBlanket()
   {
	   blankets.click();
   }
   public void newAdress()
   {
	   newadress.click();
   }
   
   public void firstName(String name) 
   {
	   fname.sendKeys(name);
   }
   
   public void lasttName(String name) 
   {
	   lname.sendKeys(name);
   }
   public void companyName(String name) 
   {
	   cmname.sendKeys(name);
   }
   
   public void phoneNum(String name) 
   {
	   phone.sendKeys(name);
   }
   public void address1(String name) 
   {
	   add1.sendKeys(name);
   }
   public void cityName(String name) 
   {
	   cname.sendKeys(name);
   }
   public void zipNum(String name) 
   {
	   zip.sendKeys(name);
   }
   
   public WebElement getCountry() {
		return country;
	}
    public WebElement getPname()
      {
	    return pname;
     }
 
   public void checkBox()
   {
	   checkbox.click();
   }
   public void addNewAdress()
   {
	   addNew.click();
   }
   public void deletingAdd()
   {
	   delete.click();
   }
   
   public void womenText()
   {
	   womentxt.click();
   }
   public void sortBy()
   {
	   sort.click();
   }
   public void sortFilter()
   {
	   old.click();
   }
   public void products()
   {
	   prd.click();
   }
   
}
