package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	
	WebDriver driver;

	public static By txt_username = By.id("username");
	public static By txt_password = By.name("password");
	public static By btn_login = By.className("login_button");
	
	public LoginPage(WebDriver _driver) {
		this.driver = _driver;
	}

	public WebElement locateUsernameById() {
		WebElement element = this.driver.findElement(txt_username);
		return element;
	}
	
	public WebElement locatePassByID() {
		WebElement element = this.driver.findElement(txt_password);
		return element;
	}
	
	public WebElement locateLogIn() {
		WebElement element = this.driver.findElement(btn_login);
		return element;
	}
	
}
