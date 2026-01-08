package TestingPack;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ReusedMethodTest extends ExecuteTestCase {


    WebElement Xp(String xPath){

        return driver.findElement(By.xpath(obj.getProperty(xPath)));
    }

    public void TS(int a ) throws InterruptedException {
       int k = a*1000;
       Thread.sleep(k);
    }

    public void ScreenS(String M){
        try {
            File S1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            String time = new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
            File T2 = new File("C:\\Users\\visha\\IdeaProjects\\BasicAutomation\\Basicautomation\\BasicFrame\\src\\TestEvidence\\" + M + "_"+ time + ".jpg");
            FileHandler.copy(S1, T2);
        } catch (IOException e) {
            throw new RuntimeException("Unable to take Screen Shot ");
        }

    }








}
