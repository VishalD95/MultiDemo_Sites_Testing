package TestingPack;

import com.OrangeHRM.BaseTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class ExecuteTestCase extends BaseTest {

    @Test
    public void TestCases() throws InterruptedException, AWTException, IOException {
        ScriptingTest S =new ScriptingTest();
        S.Login();
        //S.AddOneEmp();
         S.AddMultiEmp();
         S.EditMltiEmp();
        //S.EditEmp("EmployeeSe", "Selenium");

    }
}
