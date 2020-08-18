package com.dkatlisLab.StepDefnition;

import org.openqa.selenium.WebDriver;

import com.dkatlisLab.Base.BaseClass;
import com.dkatlisLab.Pages.MidTransPillowPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreditSuccessStepDef extends BaseClass{
	
	public static WebDriver driver;
	
	MidTransPillowPage midTransPillowPage;
	
	public CreditSuccessStepDef()
	{
		driver =initialization();
		midTransPillowPage= new MidTransPillowPage();
	}


@Given("^open browser and launch url$")
public void open_browser_and_launch_url() throws Throwable {
	
	driver.get(prop.getProperty("url"));
	
	
    
}

@When("^I clicked on Buy now$")
public void i_clicked_on_Buy_now() throws Throwable {
	midTransPillowPage.buyNowButtonClick();

}

@Then("^I clicked on checkout button on Shopping Cart$")
public void i_clicked_on_checkout_button_on_Shopping_Cart() throws Throwable {
	midTransPillowPage.clickOnCheckout();
   
}

@Then("^I clicked on Continue button on Ordar Summary Page$")
public void i_clicked_on_Continue_button_on_Ordar_Summary_Page() throws Throwable {
	
	midTransPillowPage.clickOnContinue();
   
}

@Then("^On Payment Page select payment type as Credit Card$")
public void on_Payment_Page_select_payment_type_as_Credit_Card() throws Throwable {
	midTransPillowPage.selectCreditpayment();
    
}

@Then("^enter valid card number$")
public void enter_valid_card_number() throws Throwable {
	midTransPillowPage.enterCardNo().sendKeys(prop.getProperty("cardNumber"));

  
}

@Then("^enter valid expiry date$")
public void enter_valid_expiry_date() throws Throwable {
	midTransPillowPage.enterExpiryDate().sendKeys(prop.getProperty("expiry"));
  
}

@Then("^enter valid cvv$")
public void enter_valid_cvv() throws Throwable {
	midTransPillowPage.enterCVV().sendKeys(prop.getProperty("cvv"));
  
}

@Then("^click on Pay now button$")
public void click_on_Pay_now_button() throws Throwable {
    midTransPillowPage.clickonPayNowButton();
   
}

@Then("^enter valid password and click ok$")
public void enter_valid_password_and_click_ok() throws Throwable {
    // Write code here that turns the phrase above into concrete actions

}

@Then("^verify successfull message$")
public void verify_successfull_message() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
 
}


	
	

}
