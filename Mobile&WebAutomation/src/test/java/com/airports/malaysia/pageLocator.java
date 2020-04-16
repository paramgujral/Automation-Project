package com.airports.malaysia;

import org.openqa.selenium.By;

import com.ctaf.accelerators.ActionEngine;

public class pageLocator {
	
	//Amazon signIN locators
	public static By signIn = By.xpath("//div[@id='nav-flyout-ya-signin']/a/span[contains(text(),'Sign in')]");
	public static By email = By.xpath("//input[@id='ap_email']");
	public static By continueBtn= By.xpath("//input[@id='continue']");
	public static By password= By.xpath("//input[@id='ap_password']");
	public static By logIn = By.xpath("//input[@id='signInSubmit']");
	public static By helloSignIn = By.xpath("//span[contains(text(),'Hello. Sign in')]");

}
