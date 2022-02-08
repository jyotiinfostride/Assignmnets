package Test;

import org.testng.annotations.Test;

import java.io.IOException;

public class VerifyHomePage extends Base {

    @Test
    public void Test1() throws IOException {
        pageFactory.getLoginPage().LoginStdUser();
    }


    @Test(dependsOnMethods = "Test1")
    public void checkLink1(){
        pageFactory.getHomePage().setBackPack();;
        driver.navigate().back();
    }

    @Test(dependsOnMethods = "Test1")
    public void checkLink2(){
        pageFactory.getHomePage().setBikeLight();
        driver.navigate().back();
    }
    @Test(dependsOnMethods = "Test1")
    public void checkLink3(){
        pageFactory.getHomePage().setJacket();
        driver.navigate().back();
    }

    @Test(dependsOnMethods = "Test1")
    public void checkLink4(){
        pageFactory.getHomePage().setOnesie();
        driver.navigate().back();
    }

    @Test(dependsOnMethods = "Test1")
    public void checkLink5(){
        pageFactory.getHomePage().settShirt();
        driver.navigate().back();
    }

    @Test(dependsOnMethods = "Test1")
    public void checkLink6(){
        pageFactory.getHomePage().settRed();
        driver.navigate().back();
    }

    @Test(dependsOnMethods = "Test1")
    public void checkCart1(){
        pageFactory.getHomePage().setBackPackCart();
    }

    @Test(dependsOnMethods = "Test1")
    public void checkCart2(){
        pageFactory.getHomePage().setBikeLightCart();
    }
    @Test(dependsOnMethods = "Test1")
    public void checkCart3(){
        pageFactory.getHomePage().setJacketCart();
    }

    @Test(dependsOnMethods = "Test1")
    public void checkCart4(){
        pageFactory.getHomePage().setOnesieCart();
    }

    @Test(dependsOnMethods = "Test1")
    public void checkCart5(){
        pageFactory.getHomePage().settShirtCart();
    }

    @Test(dependsOnMethods = "Test1")
    public void checkCart6() {
        pageFactory.getHomePage().settRedCart();
    }
}
