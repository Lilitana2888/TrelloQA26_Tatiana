package com.trello.qa.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver wd;
    UserHelper userHelper;
  //  CarHelper carHelper;


    public void start() {
        wd = new ChromeDriver();
        wd.navigate().to("https://trello.com/");
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        userHelper = new UserHelper(wd);
     //   carHelper = new CarHelper(wd);
    }

    public UserHelper getUserHelper() {
        return userHelper;
    }

//  // public CarHelper getCarHelper() {
//        return carHelper;
//    }

    public void stop() {
        wd.quit();
    }
}
