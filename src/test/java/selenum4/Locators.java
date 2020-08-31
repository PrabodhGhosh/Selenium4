package selenum4;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	// Using selenium 4 we can interact with elements using the refernce of nearby
	// elements

	/*
	 * above: To locate web element appearing above the specified element below: To
	 * locate web element appearing below the specified element toLeftOf: To locate
	 * web element appearing to the left of the specified element toRightOf: To
	 * locate web element appearing to the right of the specified element near: To
	 * locate web element appearing to near of the specified element. Here near
	 * means the maximum of 50 pixels away from the specific element
	 */
	@Test
	public void enhancedLocators() throws IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rapidvaluesolutions.com/contact-us/");
		WebElement fname = driver.findElement(By.id("nf-field-5"));
		WebElement lname = driver.findElement(withTagName("input").toRightOf(fname));
     	lname.sendKeys("Jones");
     	driver.quit();

	}

}
