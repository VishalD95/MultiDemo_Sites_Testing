package TestingPack;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ScriptingTest extends ReusedMethodTest {

    public void Login() throws InterruptedException {
        driver.get(obj.getProperty("URL"));
        TS(2);
        Xp("XUN").sendKeys(obj.getProperty("UN"));
        Xp("XPWD").sendKeys(obj.getProperty("UP"));
        Xp("XSUB").click();
        TS(3);
        ScreenS("AfterLogIn");
    }

    public void AddOneEmp() throws InterruptedException, AWTException {
        TS(2);
        Actions A = new Actions(driver);
        A.moveToElement( Xp("Xpim")).perform();
        TS(1);
        Xp("ADDEMP").click();
        TS(1);
        driver.switchTo().frame(Xp("Iframe"));
        System.out.println(driver.getTitle());
        TS(2);
        A.moveToElement(Xp("EmpId")).perform();
        A.doubleClick(Xp("EmpId")).perform();
        A.sendKeys(Keys.BACK_SPACE).perform();
        TS(2);
        Xp("EmpId").sendKeys("0001");
        Xp("FastName").sendKeys("vishal");
        Xp("Lastname").sendKeys("D");
        Xp("MidName").sendKeys("Kumar");
        Xp("NicName").sendKeys("V_sha");
        TS(2);
        A.moveToElement(Xp("XPhoto")).click().perform();
        StringSelection SS = new StringSelection("\"C:\\Users\\visha\\Pictures\\Employee1.jpg\"");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(SS, null);

        TS(1);

        Robot R = new Robot();
        R.keyPress(KeyEvent.VK_CONTROL);
        R.keyPress(KeyEvent.VK_V);
        R.keyRelease(KeyEvent.VK_CONTROL);
        R.keyRelease(KeyEvent.VK_V);

        TS(2);
        R.keyPress(KeyEvent.VK_ENTER);
        R.keyRelease(KeyEvent.VK_ENTER);
        TS(2);
        Xp("XSave").click();
        TS(3);
        Xp("XBACK").click();

    }

    public void AddMultiEmp() throws InterruptedException, AWTException, IOException {
        //To Get Data From ExcelSheet
        FileInputStream fis = new FileInputStream("src/test/resources/NewEmpList.xlsx");
        XSSFWorkbook W = new XSSFWorkbook(fis);
        XSSFSheet sht = W.getSheet("CreateEmp");
        for (int Y = 1; Y <= sht.getLastRowNum(); Y++)
         {
           int eid =  (int) sht.getRow(Y).getCell(0).getNumericCellValue();
          String eFirst = sht.getRow(Y).getCell(1).getStringCellValue();
          String eLast = sht.getRow(Y).getCell(2).getStringCellValue();
          String eMiddle = sht.getRow(Y).getCell(3).getStringCellValue();
          String eNick = sht.getRow(Y).getCell(4).getStringCellValue();
          TS(2);
          Actions A = new Actions(driver);
          A.moveToElement( Xp("Xpim")).perform();
          TS(1);
          Xp("ADDEMP").click();
          TS(1);
          driver.switchTo().frame(Xp("Iframe"));
          //System.out.println(driver.getTitle());
          TS(2);
          A.moveToElement(Xp("EmpId")).perform();
          A.doubleClick(Xp("EmpId")).perform();
          A.sendKeys(Keys.BACK_SPACE).perform();
          TS(2);
          Xp("EmpId").sendKeys(String.valueOf(eid));
          Xp("FastName").sendKeys(eFirst);
          Xp("Lastname").sendKeys(eLast);
          Xp("MidName").sendKeys(eMiddle);
          Xp("NicName").sendKeys(eNick);
          TS(2);
          A.moveToElement(Xp("XPhoto")).click().perform();
          StringSelection SS = new StringSelection("C:\\Users\\visha\\Pictures\\" + eFirst +".jpg");
          Toolkit.getDefaultToolkit().getSystemClipboard().setContents(SS, null);

          TS(1);

          Robot R = new Robot();
          R.keyPress(KeyEvent.VK_CONTROL);
          R.keyPress(KeyEvent.VK_V);
          R.keyRelease(KeyEvent.VK_CONTROL);
          R.keyRelease(KeyEvent.VK_V);

          TS(2);
          R.keyPress(KeyEvent.VK_ENTER);
          R.keyRelease(KeyEvent.VK_ENTER);
          TS(2);
          //BeforeSaving
          Xp("XSave").click();
          TS(3);
          //After Saving
          Xp("XBACK").click();
          TS(3);
          ScreenS(eFirst + "AfterAdding ");

          driver.switchTo().defaultContent();
         }

    }

    public void EditEmp(String value , String UdLastN) throws InterruptedException {
        TS(2);
        driver.switchTo().frame(Xp("Iframe"));
        TS(1);
        driver.findElement(By.xpath("//a[contains(text(), '"+value+"')]")).click();
        Xp("XEdit").click();
        TS(2);
        Xp("Lastname").clear();
        TS(1);
        Xp("Lastname").sendKeys(UdLastN);
        Xp("XEdit").click();
        Xp("XBACK").click();
        driver.findElement(By.xpath("//*[@id ='allCheck']")).click();
        driver.findElement(By.xpath("//*[@value='Delete']")).click();

    }

    public void EditMltiEmp() throws InterruptedException, IOException {
        //To Get Data From ExcelSheet
        FileInputStream fis = new FileInputStream("src/test/resources/NewEmpList.xlsx");
        XSSFWorkbook W = new XSSFWorkbook(fis);
        XSSFSheet sht = W.getSheet("EditEmp");
        for(int v=1; v <= sht.getLastRowNum(); v++)
        {

           String eFirst = sht.getRow(v).getCell(1).getStringCellValue();
           String eLast = sht.getRow(v).getCell(2).getStringCellValue();

           TS(2);
           driver.switchTo().frame(Xp("Iframe"));
           TS(1);
           driver.findElement(By.xpath("//a[contains(text(), '"+eFirst+"')]")).click();
           Xp("XEdit").click();
           TS(2);
           System.out.println("Before Updating Last Name : " + eLast);
           Xp("Lastname").clear();
           TS(1);
           Xp("Lastname").sendKeys(eLast);
           TS(1);
           Xp("XEdit").click();//Save same Xpath Edit
            System.out.println("After Updating Last Name : " + eLast);
            TS(2);
           Xp("XBACK").click();
           driver.switchTo().defaultContent();
        }

        TS(3);
        driver.switchTo().frame(Xp("Iframe"));

        driver.findElement(By.xpath("//*[@id ='allCheck']")).click();
        driver.findElement(By.xpath("//*[@value='Delete']")).click();
    }





}
