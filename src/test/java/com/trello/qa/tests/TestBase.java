package com.trello.qa.tests;

import com.trello.qa.fw.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {


    protected ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp()  {

        app.start();

    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        app.stop();
    }


}
