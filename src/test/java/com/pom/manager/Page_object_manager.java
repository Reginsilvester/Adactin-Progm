package com.pom.manager;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.Confirmation;
import com.adactin.pom.Hotelroom;
import com.adactin.pom.Loginpage;
import com.adactin.pom.Payment;

public class Page_object_manager {
	
	public static WebDriver driver;
	
	private Loginpage lp;
	private Hotelroom hr;
	private Confirmation c;
	private Payment p;

	public Hotelroom getHr() {
		hr = new Hotelroom(driver);
		return hr;
	}

	public Confirmation getC() {
		c = new Confirmation(driver);
		return c;
	}

	public Payment getP() {
		p= new Payment(driver);
		return p;
	}

	public Page_object_manager(WebDriver driver2) {
		this.driver = driver2;
	}

	public Loginpage getLp() {
		lp= new Loginpage(driver);
		return lp;
	}

}
