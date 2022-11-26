package e2e_framework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;
import utilities.BrowserUtilities;

public class TestCase1 {

	public static void main(String[] args) throws IOException {
		// setup
		BrowserUtilities browser_util = new BrowserUtilities();
		browser_util.setup_browser();
		browser_util.maximize_window();
		browser_util.launch_url("https://adactinhotelapp.com/");
		
		//login
		LoginPage login_obj = new LoginPage(browser_util.get_driver());
		browser_util.input(login_obj.txt_username, "arvindh70");
		browser_util.input(login_obj.txt_password, "abc@123");
		browser_util.save_screenshot("C:\\Users\\krish\\eclipse-workspace\\e2e_framework\\src\\test\\resources\\screenshots\\scn1.png");
		browser_util.click(login_obj.btn_login);
		
		//close
		browser_util.close_browser();
	}

}
