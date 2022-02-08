package Test;

import Pages.LoginPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginModule extends Base {

    @Test
    public void Test1() throws IOException {
        pageFactory.getLoginPage().LoginModule();
    }

    @Test
    public void Test2() throws InterruptedException {
        pageFactory.getLoginPage().LoginStdUser();
        pageFactory.getHomePage().setLogout();
    }
}
