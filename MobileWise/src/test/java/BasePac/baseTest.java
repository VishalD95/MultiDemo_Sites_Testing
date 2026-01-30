package BasePac;

import Utils.Wait;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class baseTest {

    public static WebDriver driver;
    public static Properties props;
    public static Wait wait;


    @Before
    public void setup() throws IOException {

        //Load Properties
        props = new Properties();
        FileInputStream f1 = new FileInputStream("src/test/resources/Mwise.properties");
        props.load(f1);


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(props.getProperty("baseURl"));

        int timeout = Integer.parseInt(props.getProperty("timeOut"));

        wait = new Wait(driver, timeout);

    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
