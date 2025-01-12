// package com.jiomart.stepdefinitions;

// import java.net.URL;

// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeOptions;
// import org.openqa.selenium.remote.RemoteWebDriver;

// import io.cucumber.java.After;
// import io.cucumber.java.Before;

// public class Hooks {

//     WebDriver driver;

//     @Before ()
//     public void openBrowser() {
//         System.out.println("Opened *********************");
//         try {
//             driver = new RemoteWebDriver(new URL("http://localhost:4444"), new ChromeOptions());
//             driver.manage().window().maximize();
//             driver.get("https://www.amazon.in");
//             Thread.sleep(3000);
//         } catch (Exception e) {
//             // TODO Auto-generated catch block
//             e.printStackTrace();
//         }

//     }

//     @After ()
//     public void closeSession() {
//         driver.quit();
//         System.out.println("Driver quit *********************");
//     }


// }
