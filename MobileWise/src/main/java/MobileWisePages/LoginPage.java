package MobileWisePages;

import Utils.ScreenShot;
import Utils.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Properties;


public class LoginPage {
    private final Wait wait;
    public ScreenShot screenShot = new ScreenShot();
    public WebDriver driver;
    public Properties props;

    public LoginPage(WebDriver driver, Wait wait, Properties props){
        this.wait = wait;
        this.driver =driver;
        this.props = props;

    }


    By Xlogo = By.xpath("//*[@class ='logo-container']/*");
    By XSignIn = By.xpath("//*[contains(text(), 'Sign In')]");
    By XBannerImg = By.xpath("//*[@class='content']/*");
    By XWelcomeTitle = By.xpath("//*[@class='title ']");
    By XSignTxt  = By.xpath("//*[@id='sign-in']");
    By XuserEmailTxt = By.xpath("//*[@for='username']");
    By XUserIcon = By.xpath("//*[@class='icon fi-user']");
    By XUserName = By.xpath("//*[@id='username']");
    By XpassTxt = By.xpath("//*[@for='password']");
    By XUsePass = By.xpath("//*[@id='password']");
    By XEyeIcon = By.xpath("//*[@id='eye-icon-slash']");    ////*[@class='btn']
    By XForgotPass = By.xpath("//*[text() ='Forgot Password?']");
    By XsignIn = By.xpath("//*[@value ='Sign In']");
    By XSignInWith = By.xpath("//*[text() ='Or sign in with']");
    By XcreateNewAcc = By.xpath("//*[@id ='social-google']");

    public void login() throws IOException {
        wait.waitForClickable(XSignIn).click();
        screenShot.takeScreenShot(driver, "after");
    }

    public boolean logo(){
       try{
          boolean logImg = wait.waitForVisibility(Xlogo).isDisplayed();
          System.out.println(logImg);
          return logImg;
       }catch (TimeoutException e){
           System.out.println("Logo Image is Not Found :");
           return false;
       }
    }

    public boolean bannerImg(){
        try{
            return wait.waitForVisibility(XBannerImg).isDisplayed();
        }catch (TimeoutException e){
            System.out.println("Banner Image is Not Found :");
            return false;
        }
    }

    public boolean verifyWelcomeTitle(String element){   //Welcome
        try{
            String actual = wait.waitForVisibility(XWelcomeTitle).getText().trim();
            return actual.equals(element);
        }catch (TimeoutException e){
            System.out.println("Welcome Text Not Found :");
            return false;
        }
    }

    public boolean verifySignINTo(String element){  //Sign In to Continue
        try{
            String actual = wait.waitForVisibility(XSignTxt).getText().trim();
            return actual.equals(element);
        }catch (TimeoutException e){
            System.out.println("Sign In To Continue Text Not Found :");
            return false;
        }
    }

    public boolean verifyUserEmailTxt(String element){  //Username or email
        try{
            String actual = wait.waitForVisibility(XuserEmailTxt).getText().trim();
            return actual.equals(element);
        }catch (TimeoutException e){
            System.out.println("User&Email Head Text Not Found :");
            return false;
        }
    }

    public boolean visibilityOfUserIcon(){
       try{ boolean icon = wait.waitForVisibility(XUserIcon).isDisplayed();
        System.out.println(icon);
        return icon;
       }catch (TimeoutException e){
           System.out.println("User Icon Is Not Found");
           return false;
       }
    }

    public void entUserName(){
        wait.waitForVisibility(XUserName).sendKeys(props.getProperty("Uname"));
    }

    public boolean verifyPasswordTxt(String element){  //Password
        try{
            String actual = wait.waitForVisibility(XpassTxt).getText().trim();
            return actual.equals(element);
        }catch (TimeoutException e){
            System.out.println("Password Head Text Not Found :");
            return false;
        }
    }

    public void entUserPassword(){
        wait.waitForVisibility(XUsePass).sendKeys(props.getProperty("UPassword"));
    }

    public boolean eyeIcon(){
        try{
            boolean eIcon = wait.waitForVisibility(XEyeIcon).isDisplayed();
            System.out.println(eIcon);
            return eIcon;
        }catch (TimeoutException e){
            System.out.println("EyeIcon Is Not Found :");
            return false;
        }
    }

    public void seePassword(){
        wait.waitForClickable(XEyeIcon).click();
    }

    public boolean verifyForgotPasswordTxt(String element){  //Forgot Password?
       try{ String actual = wait.waitForVisibility(XForgotPass).getText().trim();
        return actual.equals(element);
       }catch (TimeoutException e){
           System.out.println("Forgot Password Link Text Not Found :");
           return false;
       }
    }

    public void forgotPasswordLink(){
        wait.waitForClickable(XForgotPass).click();
    }

    public void clickSignIn(){
        wait.waitForClickable(XsignIn).click();
    }


    public boolean verifySignInWith(String element){  //Or sign in with
        try{
            String actual = wait.waitForVisibility(XSignInWith).getText().trim();
            return actual.equals(element);
        }catch (TimeoutException e){
            System.out.println("Sign In With text Not Found :");
            return false;
        }
    }

    public void ToCreateNewAccount(){
        try{
            wait.waitForClickable(XcreateNewAcc).click();
        }catch (TimeoutException e){
            System.out.println("Create New Account Google link Is not Found :");
        }
    }




}
