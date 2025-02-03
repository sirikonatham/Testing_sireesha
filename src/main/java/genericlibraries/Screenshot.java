package genericlibraries;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
   public WebDriver driver;
   
   public File takingScreenshot(String name) throws IOException
   {
   
   TakesScreenshot takescreenshot=(TakesScreenshot)driver;
   File src = takescreenshot.getScreenshotAs(OutputType.FILE);
   File des=new File(AutoConstant.screenShotsFoleder+name+".png");
   FileUtils.copyFile(src, des);
   return des;
   }
}
