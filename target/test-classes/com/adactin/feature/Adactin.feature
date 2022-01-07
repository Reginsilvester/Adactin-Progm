Feature: Booking Hotel in adactin application

Scenario: verify that User able to login the application

Given User launch the application
When User enter the valid username in respective field
And User enter the valid password in respective field
And User clicks the login button
Then User verify the homepage navigation to search hotels

Scenario: verify user able to search hotels and rooms

When User enter the location to stay
And User selects the hotel preferred
And User selects the room type
And User selects the number of rooms required
And User selects the number of adults going to stay in the room
And User selects the number of children going to stay in the room
Then User verify the availablity and moves to payment

Scenario: Verify that User got searched hotel
And User confirms the given details of hotel
Then User verify the page and navigates to payment

Scenario: Verify that User able to make payment
When User enter the firstname in respective field
And User enter the lastname in respective field
And User enter the proper address 
And User enters the credit card details
And User selects the creditcard type
And User selects the expiry month of credit card
And User selects the expiry year of credit card
And User enters the cvv number in respective field
Then User verify the details and books the hotel


