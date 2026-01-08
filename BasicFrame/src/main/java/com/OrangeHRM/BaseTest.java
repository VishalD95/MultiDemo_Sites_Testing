package com.OrangeHRM;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BaseTest {
   public static WebDriver driver;
   public static Properties obj;



    @BeforeClass
    public static void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        FileInputStream fis = new FileInputStream("C:\\Users\\visha\\IdeaProjects\\BasicAutomation\\Basicautomation\\BasicFrame\\src\\test\\resources\\TestData");
        obj = new Properties();
        obj.load(fis);
        //System.out.println(obj.getProperty("V"));
    }

    @AfterMethod
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }





}
