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
       Scenario: Verify the Tags and Box in Order_Detail_Page
         When User enters username as "arpitha.riya@mailinator.com"
         And User enter password as "Blibli@123456"
         Then  verify the email
         Then verify the otp
         And Check for the search box
         And Verify the Dipesan tag
         And Verify First Success tag_Selesai
         And Verify the Dibatalkan tag
         And Verify First failure tag_Dibatalkan
         And Check for the image
         And Go to oderPage
         And Verify the header
         And Check for the report











