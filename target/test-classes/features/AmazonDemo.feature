@all

Feature: Testing Amazon page

Background: 
    Given I open the browser and enter URL
    Then I capture the title of the Page
 
 
 Scenario: User on sigin page of amazon
 And user mouse hover and click to the sigin
  
 Given User is on sigin Page
 Then User enters following details and user click on signin
  | keerthiboligarla2001@gmail.com | Keerthi@24 |

  Scenario: user want to perform add to cart 
  Then search for product mobile
  Then search for the brand of mobile
 
Scenario: user want to perform wishlist
  Given user search for product
  And select the product
  Then click add wishlist
   
  
    