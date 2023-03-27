@CapstoneProject @AccountPage
Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'jamshidkhashi82@gmail.com' and password 'AliZahra4321$'
    And User click on login button
    And User should be logged in into Account

  @UpdateProfInfo
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'name' and Phone 'phone'
    And User click on Update button
    Then user profile information should be updated

  @UpdatePassword
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword  | confirmPassword |
      | AliZahra321$     | AliZahra321$ | AliZahra321$    |
    And User click on Change Password button
    Then a message should be displayed 'Password Updated Successfully'

  @AddPayment
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard     | expirationMonth | expirationYear | securityCode |
      | 5202950060046398 | Jamshid Khashi |               5 |           2029 |          869 |
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added successfully'

  @EditPayment
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard       | expirationMonth | expirationYear | securityCode |
      | 4312564895215642 | Jamshid A Khashi |               7 |           2025 |          888 |
    And user click on Update Your Card button
    Then a message should be displayed 'Payment Method updated Successfully'

  @RemovePayment
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on remove option of card section
    Then payment details should be removed

  @AddAddress
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country       | fullName     | phoneNumber | streetAddress         | apt | city       | state    | zipCode |
      | United States | Zahra Khashi |  8045023597 | 2614 annakay crossing |   0 | Midlothian | Virginia |   23113 |
    And User click Add Your Address button
    Then a message should be displayed 'Address Added Successfully'

  @EditAddress
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user fill new address form with below information
      | country       | fullName   | phoneNumber | streetAddress   | apt | city     | state    | zipCode |
      | United States | Ali Khashi |  8041234565 | 1101 timbers Rd | 102 | Richmond | Virginia |   23235 |
    And User click update Your Address button
    Then a message should be displayed 'Address Updated Successfully'

  @RemoveAddress
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
