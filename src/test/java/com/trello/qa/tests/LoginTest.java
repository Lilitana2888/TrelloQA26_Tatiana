package com.trello.qa.tests;

import com.trello.qa.model.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{

    @Test
    public void testLogin() throws InterruptedException {
        app.getUserHelper().initLogin();
        app.getUserHelper().fillLoginForm(new User().withEmail("Dimakupidon@mail.ru")
        .withPswd("12345.com"));
        Thread.sleep(2000);
        app.getUserHelper().confirmLogin();
        Thread.sleep(2000);

     //   Assert.assertTrue(app.getUserHelper().isAvatarPresent());
    }
}
