package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmation {
	public static WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement Hotel_radiobutton;
	
	@FindBy(id="continue")
	private WebElement Hotel_continue;

	public Confirmation(WebDriver dconf) {
		this.driver = dconf;
		PageFactory.initElements(driver, this);
	}

	public WebElement getHotel_radiobutton() {
		return Hotel_radiobutton;
	}

	public WebElement getHotel_continue() {
		return Hotel_continue;
	}
	

}
