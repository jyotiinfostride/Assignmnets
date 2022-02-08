package Pages;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.IOException;

public class LoginPage {
    WebDriver driver;

    @FindBy (id="user-name")
     WebElement username;
    @FindBy (id="password")
    WebElement password;
    @FindBy (id="login-button")
    WebElement login;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
       PageFactory.initElements(driver, this);
    }

    public void LoginModule() throws IOException {
        String path = System.getProperty("user.dir") + "/TestData/Login.xlsx";
        System.out.println(path);
        //Reading the Excel file
        FileInputStream file = new FileInputStream(path);
        //Reading the workBook
        XSSFWorkbook bk = new XSSFWorkbook(file);
        //Reading the sheet
        XSSFSheet sh = bk.getSheetAt(0);
        int i = sh.getLastRowNum();
        for (int a = 1; a <= i; a++) {
            String uname = sh.getRow(a).getCell(0).getStringCellValue();
            String pass = sh.getRow(a).getCell(1).getStringCellValue();

            username.sendKeys(uname);
            password.sendKeys(pass);
            login.click();
            String act = driver.getCurrentUrl();
            String exp = "https://www.saucedemo.com/inventory.html";
            //driver.close();
            Assert.assertEquals(act, exp);
            driver.navigate().back();
        }
    }
    public void LoginStdUser(){
            username.sendKeys("standard_user");
            password.sendKeys("secret_sauce");
            login.click();
            String act = driver.getCurrentUrl();
        String exp = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(act,exp);
    }

}
