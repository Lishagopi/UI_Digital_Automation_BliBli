package com.quinbay.test.Pages;

import org.junit.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import sun.jvm.hotspot.utilities.Assert;
import static org.junit.Assert.assertEquals;

//import static sun.jvm.hotspot.utilities.Assert.*;

public class Xpath_Page {

    @FindBy(xpath = "//input[@class='form__input login__username']")
    WebElement Login_usr;
    @FindBy(xpath = "//input[@class='form__input login__password']")
    WebElement Login_pass;
    @FindBy(xpath = "//button[@class='blu-btn b-full-width b-secondary']")
    WebElement submit;
    @FindBy(xpath = "//button[@class='blu-btn otp-validation__button b-full-width b-secondary']")
    WebElement verify_email;
    @FindBy(xpath = "(//ul//li//input)[1]")
    WebElement otp1;
    @FindBy(xpath = "(//ul//li//input)[2]")
    WebElement otp2;
    @FindBy(xpath = "(//ul//li//input)[3]")
    WebElement otp3;
    @FindBy(xpath = "(//ul//li//input)[4]")
    WebElement otp4;
    @FindBy(xpath = "//button[@class='blu-btn otp__confirm-button b-full-width b-secondary']")
    WebElement otpsubmit;
    @FindBy(xpath = "(//div[@class='main-header__tabs']/label)[2]")
    WebElement click_Failure_Dibatalkan;
    @FindBy(xpath = "(//div[@class='main-header__tabs']/label)[1]")
    WebElement click_Success_Dipesan;
    @FindBy(xpath = "(//span[@class='order-list__details__status completed'])[1]")
    WebElement first_Success_Selesai;
    @FindBy(xpath = "//span[@class='order-list__details__status cancelled']")
    WebElement first_failure_dipatakan;
//    @FindBy(xpath = "(//i[@class='ticker__icon'])[1]")
//    WebElement error;
    @FindBy(xpath = "(//span[@class='order-footer__button'])[1]")
    WebElement order_detail;
    @FindBy(xpath = "//p[@class='order-heading']")
    WebElement header;
    @FindBy(xpath = "//img[@src='https://static-uata.gdn-app.com/frontend/member-digital/static/img/gaspgn.9d7dca8d.svg']")
    WebElement image_verify;
    @FindBy(xpath = "//input[@class='form__input']")
    WebElement search_box;
    @FindBy(xpath = "//p[@class='order-invoice__bill-text']")
    WebElement report;
    @FindBy(xpath = "(//p[@class='order-detail__transaction-details-value'])[1]")
    WebElement user_id;

    public void Login()
    {
        Login_usr.sendKeys("arpitha.riya@mailinator.com");
        Login_pass.sendKeys("Blibli@123456");
    }
    public void Submit()
    {
        submit.click();
    }
    public void setVerify_email()
    {
        verify_email.click();
    }
    public void setotp(String otp)
    {
        otp1.sendKeys(""+otp.charAt(0));
        otp2.sendKeys(""+otp.charAt(1));
        otp3.sendKeys(""+otp.charAt(2));
        otp4.sendKeys(""+otp.charAt(3));
        otpsubmit.click();
    }
    public void Check_Success_tag()
    {
        click_Success_Dipesan.click();
        String txt= click_Success_Dipesan.getText();
        String original="Dipesan";
        Assert.assertEquals(txt,original);

    }
    public void Check_selesai_success_tag()
    {
        String text= first_Success_Selesai.getText();
        String original="Selesai";
        Assert.assertEquals(text,original);

    }
    public void Check_Failure_tag()
    {
        click_Failure_Dibatalkan.click();
        String txt= click_Failure_Dibatalkan.getText();
        String original="Dibatalkan";
        Assert.assertEquals(txt,original);

    }
    public void Check_Dibatalkan_failure_tag()
    {
        click_Failure_Dibatalkan.click();
        String text=first_failure_dipatakan.getText();
        String original="Dibatalkan";
        Assert.assertEquals(text,original);
    }
    public void Check_the_header()
    {
        order_detail.click();
        Assert.assertTrue(header.isDisplayed());
    }
    public void Check_image()
    {
        click_Failure_Dibatalkan.click();
        Assert.assertTrue("The image is displayed", image_verify.isDisplayed());
    }
    public void Go_to_OrderPage(){
        try {
            Assert.assertTrue("The value is available", order_detail.isDisplayed());
            order_detail.click();
            Assert.assertTrue("The id is available", user_id.isDisplayed());
            System.out.println("Order detail page");
        }
        catch (Exception e){
            System.out.println("Not in the order details");
        }
    }
    public void Check_for_the_report()
    {
        try {
            Assert.assertTrue("The report page is present", report.isEnabled());
            System.out.println("The report page is present");
        }
        catch (Exception e){
            System.out.println("The report page is not found");
        }
    }
    public void Check_for_the_searchBox(){
        System.out.println("Search Box is present");
        Assert.assertTrue("The search box is present",search_box.isDisplayed());
    }

}
