package org.example.SDETtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage_POM {
    WebDriver driver;
    //Constructor
    public Loginpage_POM(WebDriver driver){
        this.driver=driver;
    }
    //Locators

    By txt_UserName = By.xpath("//input[@id='login-username']");
    By txt_PassWord = By.xpath("//input[@id='login-password']");
    By loginBtn     = By.xpath("//input[@type='submit']");

    //Actions
    public void setTxt_UserName(String user){
        driver.findElement(txt_UserName).sendKeys(user);
    }
    public void setTxt_PassWord(String pwd){
        driver.findElement(txt_PassWord).sendKeys(pwd);
    }
    public void clickLogin(){
        driver.findElement(loginBtn).click();
    }

}
