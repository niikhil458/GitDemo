package com.dkatlisLab.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dkatlisLab.Base.BaseClass;

public class MidTransPillowPage extends BaseClass {
	
	WebElement element= null;
	WebDriverWait wait= new WebDriverWait(driver, 60);

	
	
	@FindBy(id="inputPassword")
	public WebElement pwd;

	public void buyNowButtonClick()
	{
		//buyNowButton.click();
		driver.findElement(By.xpath("//a[text()='BUY NOW']")).click();
				//signIn.click();
	}
	
	public void clickOnCheckout()
	{
		driver.findElement(By.xpath("//div[text()='CHECKOUT']")).click();
				//return username;
	}
	public void clickOnContinue() throws InterruptedException
	{
		/*driver.switchTo().frame("modal-iframe");
		
		System.out.println("********We are switch to the iframe*******");
		*/
		
		Thread.sleep(4000);
	//driver.findElement(By.xpath("//span[.='Continue']")).click();
	
		/*WebDriverWait wait = new WebDriverWait(driver, 30);           
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/#/select-payment']")));*/
		
/*		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);*/
		
		WebElement ele = driver.findElement(By.xpath("//div[@class='modal-iframe']/following-sibling::div[@id='app']/div//child::div[@class='header-content']//following::div[@class='button-main show']/a"));

		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		
			//return	pwd;
	}
	
	public void selectCreditpayment()
	{
		driver.findElement(By.xpath("//div[text()='Credit Card']")).click();
		
	}
	
	public WebElement enterCardNo()
	{
		return driver.findElement(By.name("cardnumber"));
	}
	
	public WebElement enterExpiryDate()
	{
		return driver.findElement(By.xpath("//div[@class='input-group col-xs-7']//input"));
		
	
	}
	
	public WebElement enterCVV()
	{
		return driver.findElement(By.xpath("//div[@class='input-group col-xs-5']//input"));
	}
	
	public void clickonPayNowButton(){
	 driver.findElement(By.xpath("//div[@class='text-button-main']")).click();
	}
	
	public String viewLanguageDependence()
	{
		//driver.findElement(By.xpath("//span[text()='View poll and results']")).click();
		//driver.findElement(By.xpath("//li[@class='feature']//div[@class='feature-description']//span[@class='ng-isolate-scope']//button[@class='btn btn-xs btn-empty feature-action-icon']//span[text()='View poll and results']")).click();
	return driver.findElement(By.xpath("//span[text()='100.0%']")).getText();
	
	}
	
	
	
	
	



}
