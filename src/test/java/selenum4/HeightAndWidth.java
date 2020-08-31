package selenum4;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeightAndWidth {
	
    //Using selenium 4 we can get height & width of an element
	@Test
	public void getHeightWidth() throws IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		System.out.println("Height: "
				+ driver.findElement(By.name("q")).getRect().getDimension().getHeight()
				+ " Width: "
				+ driver.findElement(By.name("q")).getRect().getDimension().getHeight());
		driver.quit();
	}

}
