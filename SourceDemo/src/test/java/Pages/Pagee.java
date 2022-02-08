package Pages;

import org.openqa.selenium.WebDriver;

public class Pagee {
    WebDriver driver;
     LoginPage loginPage;
     HomePage homePage;
    public Pagee(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage getLoginPage() {
        if(loginPage == null){
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }

    public HomePage getHomePage() {
        if(homePage == null){
            homePage = new HomePage(driver);
        }
        return homePage;
    }

}
