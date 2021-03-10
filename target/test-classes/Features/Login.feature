@LoginFeature

  Feature: Login

    Background:
      User navigate to the BliBli tab
      Given User already on BliBli page


    @Test1
       Scenario: Verify whether user able to login the page
          When User enters username as "arpitha.riya@mailinator.com"
          And User enter password as "Blibli@123456"
          Then  verify the email
          Then verify the otp
          And close driver




    @Test2
       Scenario:Check for the search Box
          When User enters username as "arpitha.riya@mailinator.com"
          And User enter password as "Blibli@123456"
          Then  verify the email
          Then verify the otp
          And Check for the search box
          And close driver



    @Test3
       Scenario: Check for the Sucesspage(Dipesan)
          When User enters username as "arpitha.riya@mailinator.com"
          And User enter password as "Blibli@123456"
          Then  verify the email
          Then verify the otp
          And Verify the Dipesan tag
          And close driver


    @Test4
       Scenario: Check the first successful tag
           When User enters username as "arpitha.riya@mailinator.com"
           And User enter password as "Blibli@123456"
           Then  verify the email
           Then verify the otp
           And Verify First Success tag_Selesai
           And close driver


    @Test5
      Scenario: Check for the canceled(Dibatalkan)
          When User enters username as "arpitha.riya@mailinator.com"
          And User enter password as "Blibli@123456"
          Then  verify the email
          Then verify the otp
          And Verify the Dibatalkan tag
          And close driver


    @Test6
    Scenario: Check the first canceled tag
        When User enters username as "arpitha.riya@mailinator.com"
        And User enter password as "Blibli@123456"
        Then  verify the email
        Then verify the otp
        And Verify First failure tag_Dibatalkan
        And close driver


    @Test7
    Scenario: check for the image or logo
        When User enters username as "arpitha.riya@mailinator.com"
        And User enter password as "Blibli@123456"
        Then  verify the email
        Then verify the otp
        And Check for the image
        And close driver


    @Test8
    Scenario: Verify the link for Order Detail page and id number
        When User enters username as "arpitha.riya@mailinator.com"
        And User enter password as "Blibli@123456"
        Then  verify the email
        Then verify the otp
        And Go to oderPage
        And close driver

    @Test9
    Scenario: Check for the Header in order page
        When User enters username as "arpitha.riya@mailinator.com"
        And User enter password as "Blibli@123456"
        Then  verify the email
        Then verify the otp
        And Verify the header
        And close driver


    @Test10
      Scenario: Check for the report(negative)
          When User enters username as "arpitha.riya@mailinator.com"
          And User enter password as "Blibli@123456"
          Then  verify the email
          Then verify the otp
          And Check for the report
          And close driver











