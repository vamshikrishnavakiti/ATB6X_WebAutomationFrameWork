package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestVWOLogin {
    @Test
    public void VWOLoginNegetive(){
        WebDriver driver =new EdgeDriver();
        driver.get("https://app.vwo.com");


    }
}
