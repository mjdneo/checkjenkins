package com.rwd;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestRWD {


    WebDriver driver;


    @Test (priority = 1)
    public void desktopView() throws MalformedURLException, InterruptedException{
        driver = new RemoteWebDriver(new URL("http://localhost:4444"), new ChromeOptions());
        Dimension mobile = new Dimension(1920, 1080);
        driver.manage().window().setSize(mobile);
        driver.get("https://ltimindtree.iamneo.ai/");
        Thread.sleep(4000);
        driver.quit();
    }

    @Test (priority = 2)
    public void tabView() throws MalformedURLException, InterruptedException{
        driver = new RemoteWebDriver(new URL("http://localhost:4444"), new ChromeOptions());
        Dimension mobile = new Dimension(768, 1024);
        driver.manage().window().setSize(mobile);
        driver.get("https://ltimindtree.iamneo.ai/");
        Thread.sleep(4000);
        driver.quit();
    }

    @Test (priority = 3)
    public void mobileView() throws MalformedURLException, InterruptedException{
        driver = new RemoteWebDriver(new URL("http://localhost:4444"), new ChromeOptions());
        Dimension mobile = new Dimension(375, 667);
        driver.manage().window().setSize(mobile);
        driver.get("https://ltimindtree.iamneo.ai/");
        Thread.sleep(4000);
        driver.quit();
    }


}
