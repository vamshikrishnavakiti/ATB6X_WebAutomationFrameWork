package org.example.SDETtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
    WebDriver driver;
    //Constructor
    public LoginPage_PF(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    //Locators

    /*By txt_UserName = By.xpath("//input[@id='login-username']");
    By txt_PassWord = By.xpath("//input[@id='login-password']");
    By loginBtn     = By.xpath("//input[@type='submit']");
*/
    @FindBy(xpath = "//input[@id='login-username']")
    WebElement txt_username;
    @FindBy(xpath = "//input[@id='login-password']")
    WebElement txt_password;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement LoginBtn;


    //Actions
    public void setTxt_UserName(String user){
        LoginBtn.sendKeys(user);
    }
    public void setTxt_PassWord(String pwd){
        txt_password.sendKeys(pwd);
    }
    public void clickLogin(){
        LoginBtn.click();
    }

}
