package utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class BrowserUtilities {

	public WebDriver driver;

	public void setup_browser(){
		driver = new ChromeDriver();
	}
	
	public WebDriver get_driver() {
		return this.driver;
	}

	public void maximize_window() {
		driver.manage().window().maximize();
	}

	public void launch_url(String url) {
		driver.get(url);
	}

	public void click(By locator) {
		this.element(locator).click();
	}
	
	public void input(By locator, String value) {
		this.element(locator).sendKeys(value);
	}
	
	public void close_browser() {
		driver.close();
	}
	
	public WebElement element(By locator){
		return driver.findElement(locator);
	}
	
	public void wait_until_element_is_displayed(By locator, Long seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public void save_screenshot(String location) throws IOException {
		File scrn_file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(location);
		FileUtils.copyFile(scrn_file, dest);
	}
	
}
