package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotelroom {
	
	public static WebDriver driver;
	
	@FindBy(id="location")
	private WebElement Hotel_location;
	
	@FindBy(id="hotels")
	private WebElement Hotel_name;
	
	@FindBy(id="room_type")
	private WebElement Hotel_roomtype;
	
	@FindBy(id="room_nos")
	private WebElement Hotel_roomnos;
	
	@FindBy(id="adult_room")
	private WebElement Hotel_adult;
	
	@FindBy(name="child_room")
	private WebElement Hotel_child;
	
	@FindBy(id="Submit")
	private WebElement Hotel_select;

	public Hotelroom(WebDriver droom) {
		this.driver = droom;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getHotel_location() {
		return Hotel_location;
	}

	public WebElement getHotel_name() {
		return Hotel_name;
	}

	public WebElement getHotel_roomtype() {
		return Hotel_roomtype;
	}

	public WebElement getHotel_roomnos() {
		return Hotel_roomnos;
	}

	public WebElement getHotel_adult() {
		return Hotel_adult;
	}

	public WebElement getHotel_child() {
		return Hotel_child;
	}

	public WebElement getHotel_select() {
		return Hotel_select;
	}
	
	

}
