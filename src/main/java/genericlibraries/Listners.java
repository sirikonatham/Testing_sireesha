package genericlibraries;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot takescreenshot=(TakesScreenshot)BaseClass.driver;
		   File src = takescreenshot.getScreenshotAs(OutputType.FILE);
		   File des=new File(AutoConstant.screenShotsFoleder+result.getMethod()+".png");
		   try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
	}

}
