package com.trello.qa.fw;

import com.trello.qa.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase {
    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public void initLogin() {
        click(By.xpath("//*[@href='/login']"));
    }

    public void fillLoginForm(User user) throws InterruptedException {

        typeBy(By.id("user"),user.getEmail());
        Thread.sleep(2000);
        click(By.id("login"));
        typeBy(By.id("password"),user.getPswd());

    }

    public void confirmLogin() {
        click(By.id("login-submit"));
    }

    public boolean isAvatarPresent() throws InterruptedException {
        Thread.sleep(20000);
        return isElementPresent(By.cssSelector("[data-test-id='header-member-menu-button']"));
    }
}
