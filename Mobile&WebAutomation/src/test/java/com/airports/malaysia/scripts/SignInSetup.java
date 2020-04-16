package com.airports.malaysia.scripts;

import com.airports.malaysia.workflows.SignInhelper;
import com.ctaf.accelerators.TestEngine;
import com.ctaf.support.ExcelReader;
import com.ctaf.support.HtmlReportSupport;
import com.ctaf.utilities.Reporter;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.ctaf.accelerators.TestEngine.configProps;

public class SignInSetup extends SignInhelper {

    Logger logger = Logger.getLogger(SignInhelper.class.getName());
   /* ExcelReader xlsrdr = new ExcelReader(configProps.getProperty("TestData"),
            configProps.getProperty("sheetName1"));*/

    @Test
    public void validateSignInAmazon() throws Throwable {
        boolean result=false;
        TestEngine.testDescription.put(HtmlReportSupport.tc_name,  "TC-01 : When a user tries to login Amazon ");
        /*String password = xlsrdr.getCellValue("amazonSignIn", "password");
        String email = xlsrdr.getCellValue("amazonSignIn", "email");
        String url = xlsrdr.getCellValue("amazonSignIn", "url");*/
        String password= "@lt12345";
        String email= "8897741110";
        try{
            result = amazonSignIn(url,email,password);

            if (result) {
                Reporter.SuccessReport("Login into Application with cookie was ",
                        "Successful with " + email);
            } else {
                Reporter.failureReport("Login into Application cookie was ",
                        "Failed with " + email);
                Assert.assertTrue(result == true, "Failed to test SignIn Cookie NZ");
            }

        } catch (Exception e) {

            Reporter.failureReport("Login into Application cookie was ",
                    "Failed with " + email);
            e.printStackTrace();
            Assert.assertTrue(false,  "Failed to test SignIn Cookie NZ");
        }finally{
            //launching base url to proceed to logout

        }
    }
}
