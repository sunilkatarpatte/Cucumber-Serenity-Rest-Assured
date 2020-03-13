package pageObject;


import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import utility.Util;

public class SampleForm extends PageObject {

	public void printopen() {
		System.out.println("Launching Chrome");
	}
	
	
	public void enterAllDetails() {
		String xpath;
		try {
		    getDriver().manage().window().maximize();
			xpath=Util.getXpath(getClass().getSimpleName(), "emailid");
			
			getDriver().findElement(By.xpath(xpath)).sendKeys("Sunil Katarpatte");
			getDriver().findElement(By.xpath(Util.getXpath(getClass().getSimpleName(), "password"))).sendKeys("***sd");;
			
			
			
			File file = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("./Screenshots/Screen.png"));
			 
			
		}catch(Exception e) {
			assertThat("failure!!! ",is(false));
		}
	}
	
	public void submitBtn() {
		
		try {
			
			getDriver().findElement(By.xpath(Util.getXpath(getClass().getSimpleName(), "submitBtn"))).click();
			
		}catch(Exception e) {
			assertThat("Failure!!! in submit method ",is(false));
		}
	}

	public void verifyAllDetails(String msg) {
		
		try {
			String successMsg=getDriver().findElement(By.xpath(Util.getXpath(getClass().getSimpleName(), "successMsg"))).getText();
			if(msg.contains("Pass")) {
				System.out.println("Successfully submitted all details");
			}else {
				assertThat("Failure!!! in verifyAllDetails method",is(false));
			}
		} catch (Exception e) {

			e.printStackTrace();
		} 
		
	}
}
