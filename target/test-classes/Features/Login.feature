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


    @Test2
       Scenario:Check for the search Box
         When User enters username as "arpitha.riya@mailinator.com"
         And User enter password as "Blibli@123456"
         Then  verify the email
         Then verify the otp
         And Check for the search box


    @Test3
       Scenario: Check for the Sucesspage(Dipesan)
         When User enters username as "arpitha.riya@mailinator.com"
         And User enter password as "Blibli@123456"
         Then  verify the email
         Then verify the otp
         And Verify the Dipesan tag

    @Test4
       Scenario: Check the first successful tag
         When User enters username as "arpitha.riya@mailinator.com"
         And User enter password as "Blibli@123456"
         Then  verify the email
         Then verify the otp
         And Verify First Success tag_Selesai

    @Test5
       Scenario: Check for the canceled(Dibatalkan)
        When User enters username as "arpitha.riya@mailinator.com"
        And User enter password as "Blibli@123456"
        Then  verify the email
        Then verify the otp
        And Verify the Dibatalkan tag

    @Test6
    Scenario: Check the first canceled tag
      When User enters username as "arpitha.riya@mailinator.com"
      And User enter password as "Blibli@123456"
      Then  verify the email
      Then verify the otp
      And Verify First failure tag_Dibatalkan

    @Test7
    Scenario: check for the image or logo
      When User enters username as "arpitha.riya@mailinator.com"
      And User enter password as "Blibli@123456"
      Then  verify the email
      Then verify the otp
      And Check for the image

    @Test8
    Scenario: Verify the link for Order Detail page and id number
      When User enters username as "arpitha.riya@mailinator.com"
      And User enter password as "Blibli@123456"
      Then  verify the email
      Then verify the otp
      And Go to oderPage

    @Test9
    Scenario: Check for the Header in order page
      When User enters username as "arpitha.riya@mailinator.com"
      And User enter password as "Blibli@123456"
      Then  verify the email
      Then verify the otp
      And Verify the header

    @Test10
    Scenario: Check for the report
      When User enters username as "arpitha.riya@mailinator.com"
      And User enter password as "Blibli@123456"
      Then  verify the email
      Then verify the otp
      And Check for the report










