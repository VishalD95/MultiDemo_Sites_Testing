package Utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShot {


    public void takeScreenShot(WebDriver driver, String ScreenName) throws IOException {
        File F1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String time = new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
        File saveShot = new File("src/test/ScreenShot/" +ScreenName+ "_"+time+ ".jpg");
        FileHandler.copy(F1, saveShot);
    }
}
