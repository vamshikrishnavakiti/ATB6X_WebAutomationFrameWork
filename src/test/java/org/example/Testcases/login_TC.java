package org.example.Testcases;

import org.example.SDETtestcases.Loginpage_POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class login_TC {
    WebDriver driver;
    @BeforeTest
    void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();



    }
    @Test
    void Login_test(){
        Loginpage_POM lp = new Loginpage_POM(driver);
        lp.setTxt_UserName("admin1224@admin.com");
        lp.setTxt_PassWord("Admin@123");

        lp.clickLogin();

       // Assert.assertEquals(driver.getTitle(), "VWO Setup");
    }

    @AfterTest
    void tearDown(){
        driver.quit();

    }
}
