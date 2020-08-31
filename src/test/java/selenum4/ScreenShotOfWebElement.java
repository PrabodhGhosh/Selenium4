package selenum4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//Using Selenium 4 we can take screenshot of an element 

public class ScreenShotOfWebElement {
  @Test
  public void takeScreenShot() throws IOException {
	  
	  WebDriverManager.chromedriver().setup();
	  
	    WebDriver driver = new ChromeDriver();
	    driver.navigate().to("https://www.google.com");
	    WebElement googleImage = driver.findElement(By.id("hplogo"));
	    File file = googleImage.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(file, new File("image.png"));
	    driver.quit();
  }
  
  
}
