package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.Confirmation;
import com.adactin.pom.Hotelroom;
import com.adactin.pom.Loginpage;
import com.adactin.pom.Payment;
import com.adactin.runner.Runnerclass;
import com.baseclass.Baseclasstask;
import com.pom.manager.Page_object_manager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Stepdefinition extends Baseclasstask {
	
	public static WebDriver driver = Runnerclass.driver;
//	Loginpage lp = new Loginpage(driver);
//	  Hotelroom hr = new Hotelroom(driver); 
//	  Confirmation c = new Confirmation(driver);
//	  Payment p = new Payment(driver);
	  Page_object_manager pom = new Page_object_manager(driver);
	  
	 
	@Given("^User launch the application$")
	public void user_launch_the_application()     {
		geturl("https://adactinhotelapp.com/");
	     
	}

	@When("^User enter the valid username in respective field$")
	public void user_enter_the_valid_username_in_respective_field()   {
//		sendkeys(lp.getUsername(), "reginsilvester");
		sendkeys(pom.getLp().getUsername(), "reginsilvester");
	     
	}

	@When("^User enter the valid password in respective field$")
	public void user_enter_the_valid_password_in_respective_field()     {
//	   sendkeys(lp.getPassword(), "Silvester@0203");
		sendkeys(pom.getLp().getPassword(), "Silvester@0203");
	}

	@When("^User clicks the login button$")
	public void user_clicks_the_login_button()     {
//	     click(lp.getLogin());
		click(pom.getLp().getLogin());
	}

	@Then("^User verify the homepage navigation to search hotels$")
	public void user_verify_the_homepage_navigation_to_search_hotels()     {
		
	}

	@When("^User enter the location to stay$")
	public void user_enter_the_location_to_stay()     {
//	     dropdown("value", hr.getHotel_location(), "London");
		dropdown("value", pom.getHr().getHotel_location(), "London");
	}

	@When("^User selects the hotel preferred$")
	public void user_selects_the_hotel_preferred()     {
//	     dropdown("value", hr.getHotel_name(), "Hotel Sunshine");
	     dropdown("value", pom.getHr().getHotel_name(), "Hotel Sunshine");
	}

	@When("^User selects the room type$")
	public void user_selects_the_room_type()     {
//	     dropdown("value", hr.getHotel_roomtype(), "Deluxe");
		dropdown("value", pom.getHr().getHotel_roomtype(), "Deluxe");
	}

	@When("^User selects the number of rooms required$")
	public void user_selects_the_number_of_rooms_required()     {
//	     dropdown("value", hr.getHotel_roomnos(), "3");
		dropdown("value", pom.getHr().getHotel_roomnos(), "3");
	}

	@When("^User selects the number of adults going to stay in the room$")
	public void user_selects_the_number_of_adults_going_to_stay_in_the_room()     {
//	     dropdown("value", hr.getHotel_adult(), "2");
		dropdown("value", pom.getHr().getHotel_adult(), "2");
	}

	@When("^User selects the number of children going to stay in the room$")
	public void user_selects_the_number_of_children_going_to_stay_in_the_room()     {
//	     dropdown("value", hr.getHotel_child(), "1");
		dropdown("value", pom.getHr().getHotel_child(), "1");
	}

	@Then("^User verify the availablity and moves to payment$")
	public void user_verify_the_availablity_and_moves_to_payment()     {
//	     click(hr.getHotel_select());
	     click(pom.getHr().getHotel_select());
	}

	@Given("^User confirms the given details of hotel$")
	public void user_confirms_the_given_details_of_hotel()     {
//	     click(c.getHotel_radiobutton());
		click(pom.getC().getHotel_radiobutton());
	}

	@Then("^User verify the page and navigates to payment$")
	public void user_verify_the_page_and_navigates_to_payment()     {
//	     click(c.getHotel_continue());
		click(pom.getC().getHotel_continue());
	}

	@When("^User enter the firstname in respective field$")
	public void user_enter_the_firstname_in_respective_field()     {
//	     sendkeys(p.getHotel_firstname(), "regin");
		sendkeys(pom.getP().getHotel_firstname(), "regin");
	}

	@When("^User enter the lastname in respective field$")
	public void user_enter_the_lastname_in_respective_field()     {
//	     sendkeys(p.getHotel_lastname(), "malar");
		sendkeys(pom.getP().getHotel_lastname(), "malar");
	}

	@When("^User enter the proper address$")
	public void user_enter_the_proper_address()     {
//	     sendkeys(p.getResi_address(), "15/158, parvathipuram");
		sendkeys(pom.getP().getResi_address(), "15/158, parvathipuram");
	}

	@When("^User enters the credit card details$")
	public void user_enters_the_credit_card_details()     {
//	     sendkeys(p.getResi_cc(),"1111222233334444");
	     sendkeys(pom.getP().getResi_cc(), "1111222233334444");
	}

	@When("^User selects the creditcard type$")
	public void user_selects_the_creditcard_type()     {
//	     dropdown("text", p.getResi_cardtype(), "Master Card");
	     dropdown("text", pom.getP().getResi_cardtype(), "Master Card");
	}

	@When("^User selects the expiry month of credit card$")
	public void user_selects_the_expiry_month_of_credit_card()     {
//	     dropdown("text", p.getResi_expmonth(), "March");
	     dropdown("text", pom.getP().getResi_expmonth(), "March");
	}

	@When("^User selects the expiry year of credit card$")
	public void user_selects_the_expiry_year_of_credit_card()     {
//	     dropdown("value", p.getResi_expyear(), "2022");
		dropdown("value", pom.getP().getResi_expyear(), "2022");
	}

	@When("^User enters the cvv number in respective field$")
	public void user_enters_the_cvv_number_in_respective_field()     {
//	     sendkeys(p.getResi_cvv(), "111");
		sendkeys(pom.getP().getResi_cvv(), "111");
	}

	@Then("^User verify the details and books the hotel$")
	public void user_verify_the_details_and_books_the_hotel()     {
//	     click(p.getHotel_book());
		click(pom.getP().getHotel_book());
	}


	
}
