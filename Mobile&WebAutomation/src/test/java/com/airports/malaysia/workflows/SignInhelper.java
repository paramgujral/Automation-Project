package com.airports.malaysia.workflows;

import com.airports.malaysia.pageLocator;
import com.ctaf.accelerators.ActionEngine;
import com.ctaf.support.HtmlReportSupport;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class SignInhelper extends ActionEngine{

    public boolean amazonSignIn(String url, String email, String password) throws Throwable {
        logger.info("SignIn Form Entry");
        mouseHoverByJavaScript(pageLocator.helloSignIn, "helloSignIn");
        waitForElementPresent(pageLocator.signIn, "SiginIn Link");
        click(pageLocator.signIn, "Signin Link");
        waitForElementPresent(pageLocator.email, "");
        type(pageLocator.email, email, "Email");
        waitForElementPresent(pageLocator.continueBtn, "Continue button");
        click(pageLocator.continueBtn, "Continue button");
        waitForElementPresent(pageLocator.password, "Pwd");
        type(pageLocator.password, password, "Pwd");
        waitForElementPresent(pageLocator.logIn, "logIn button");
        click(pageLocator.logIn, "logIn button");
        ImplicitWait();
        return true;
    }
}
