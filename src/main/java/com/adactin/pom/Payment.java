package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	public static WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement Hotel_firstname;
	
	@FindBy(id="last_name")
	private WebElement Hotel_lastname;
	
	@FindBy(id="address")
	private WebElement Resi_address;
	

	public Payment(WebDriver dpay) {
		this.driver = dpay;
		PageFactory.initElements(driver, this);
	}

	public WebElement getHotel_firstname() {
		return Hotel_firstname;
	}

	public WebElement getHotel_lastname() {
		return Hotel_lastname;
	}

	public WebElement getResi_address() {
		return Resi_address;
	}

	public WebElement getResi_cc() {
		return Resi_cc;
	}

	public WebElement getResi_cardtype() {
		return Resi_cardtype;
	}

	public WebElement getResi_expmonth() {
		return Resi_expmonth;
	}

	public WebElement getResi_expyear() {
		return Resi_expyear;
	}

	public WebElement getResi_cvv() {
		return Resi_cvv;
	}

	public WebElement getHotel_book() {
		return Hotel_book;
	}

	@FindBy(id="cc_num")
	private WebElement Resi_cc;
	
	@FindBy(id="cc_type")
	private WebElement Resi_cardtype;
	
	@FindBy(id="cc_exp_month")
	private WebElement Resi_expmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement Resi_expyear;
	
	@FindBy(id="cc_cvv")
	private WebElement Resi_cvv;
	
	@FindBy(id="book_now")
	private WebElement Hotel_book;
	

}
