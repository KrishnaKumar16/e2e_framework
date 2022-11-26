package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchHotelPage {
	
	WebDriver driver;
	public static By drdn_location = By.name("location");
	public static By drdn_hotels = By.xpath("//select[@name='hotels']");
	public static By drdn_room = By.name("room_type");
	public static By drdn_noofrooms = By.id("room_nos");
	
	public void selectLocation(String value ) {
		WebElement loc_locations = driver.findElement(drdn_location);
		Select s1 = new Select(loc_locations);
		s1.selectByVisibleText(value);
	}
	
	public void selectHotels(Integer value) {
		WebElement loc_hotels = driver.findElement(drdn_hotels);
		Select s2 = new Select (loc_hotels);
		s2.selectByIndex(value);
	}
	
	public void selectRoomType(String value) {
		WebElement loc_roomtype = driver.findElement(drdn_room);
		Select s3 = new Select(loc_roomtype);
		s3.selectByVisibleText(value);
	}
	
	public void slectNoOfRooms() {
		WebElement loc_noofroom = driver.findElement(drdn_noofrooms);
		Select s4 = new Select(loc_noofroom);

	}


}
