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

    public void fillLoginForm(User user) {

        typeBy(By.id("user"),user.getEmail());
        typeBy(By.id("password"),user.getPswd());

    }

    public void confirmLogin() {
        click(By.id("login"));
    }

    public boolean isAvatarPresent(By locator) {
        return wd.findElements(locator).size()>0;
    }
}
