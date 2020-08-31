package selenum4;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenNewWindowTab {
	
	//Using selenium 4 we can open new browser window or tab and go back to parent window

	@Test
	public void openNewWindow() throws IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		String parentHandle = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.selenium.dev");
		driver.switchTo().window(parentHandle);
		driver.findElement(By.name("q")).sendKeys("Back");
        driver.quit();
	}
	
	@Test
	public void openNewTab() throws IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		String parentHandle = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.selenium.dev");
		driver.switchTo().window(parentHandle);
		driver.findElement(By.name("q")).sendKeys("Back");
		driver.quit();

	}

}
