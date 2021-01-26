package com.trello.qa.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {
    @Test
    public void testRegistration() throws InterruptedException {
        clickOnSignUpBtn();
        //fillRegForm
        app.getUserHelper().typeBy(By.id("email"),"shata1971+241@mail.ru");
      //  Thread.sleep(3000);
        app.getUserHelper().click(By.id("signup-submit"));
      //  Thread.sleep(3000);
        app.getUserHelper().typeBy(By.id("displayName"),"Tatiana");
        app.getUserHelper().typeBy(By.id("password"),"12345Asd");
      //  Thread.sleep(3000);
        confirmReg();
    }

    private void confirmReg() {

        app.getUserHelper().click(By.id("signup-submit"));
    }

    private void clickOnSignUpBtn() {

        app.getUserHelper().click(By.cssSelector("header a[href='/signup']"));
    }
}
