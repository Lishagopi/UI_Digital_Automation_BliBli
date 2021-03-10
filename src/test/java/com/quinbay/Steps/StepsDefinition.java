
package com.quinbay.Steps;
//import com.quinbay.test.Actions.LoginAction;

import com.quinbay.test.Pages.Xpath_Page;
import com.quinbay.utilclass.Driverclass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class StepsDefinition {

    public static WebDriver driver;

    Xpath_Page obj;
    String user;
    //Driverclass obj;

    @Given("User already on BliBli page")
    public void user_on_bli_bli_page() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/Driver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        driver=new ChromeDriver(cap);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://wwwuata.gdn-app.com/member/order/digital/completed");
        obj=PageFactory.initElements(driver, Xpath_Page.class);
       // obj=new Driverclass();
    }

    @When("User enters username as {string}")
    public void user_enters_username_as(String arg0)
    {
      obj.Login();
    }

    @And("User enter password as {string}")
    public void user_enter_password_as(String arg0)
    {
     obj.Submit();
    }

    @Then("verify the email")
    public void user_verify_the_email()
    {
        obj.setVerify_email();
        System.out.println("Clicked the verify");
    }

    @Then("verify the otp")
    public void user_enter_in_the_login_page() {
        System.out.println("otp Verified with 3333");
        obj.setotp("3333");
    }


    @And("Verify the Dipesan tag")
    public void verifyTheDipesanTag() {
        obj.Check_Success_tag();
    }

    @And("Verify First Success tag_Selesai")
    public void verifyFirstSuccessTag_Selesai()
    {
        obj.Check_selesai_success_tag();
    }

    @And("Verify the Dibatalkan tag")
    public void verifyTheDibatalkanTag() {
        obj.Check_Failure_tag();
    }

    @And("Verify First failure tag_Dibatalkan")
    public void verifyFirstFailureTag_Dibatalkan() {
        obj.Check_Dibatalkan_failure_tag();
    }

    @And("Verify the header")
    public void verifyTheHeader() {
        obj.Check_the_header();
    }

    @And("Check for the image")
    public void checkForTheImage() {
        obj.Check_image();
    }

    @And("Go to oderPage")
    public void goToOderPage() {
        obj.Go_to_OrderPage();
    }

    @And("Check for the report")
    public void checkForTheReport() {
        obj.Check_for_the_report();
    }

    @And("Check for the search box")
    public void checkForTheSearchBox() {
        obj.Check_for_the_searchBox();
    }

    @And("close driver")
    public void close_driver()
    {
        driver.close();
        driver.quit();
    }

    }






