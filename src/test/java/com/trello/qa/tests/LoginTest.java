package com.trello.qa.tests;

import com.trello.qa.model.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{

    @Test
    public void testLogin() throws InterruptedException {
        app.getUserHelper().initLogin();

      //  app.getUserHelper().fillLoginForm(new User().withEmail("kupidon1971+241@mail.ru")
       // .withPswd("12345Asd"));change email & check
        app.getUserHelper().fillLoginForm(new User().withEmail("rochman.elena@gmail.com")
                .withPswd("12345.com"));//work

        app.getUserHelper().confirmLogin();


     Assert.assertTrue(app.getUserHelper().isAvatarPresent());
    }
}
