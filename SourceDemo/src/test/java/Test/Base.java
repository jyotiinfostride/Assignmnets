package Test;

import Pages.Pagee;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Base {

     Pagee pageFactory;

    WebDriver driver;
    public static Properties prop;
    String path;

    @BeforeClass
    void launchBrowser() throws FileNotFoundException {
        path = System.getProperty("user.dir")+"\\Config\\config.properties";
        System.out.println(path);
        try {
            FileInputStream file = new FileInputStream(path);
            prop = new Properties();
            prop.load(file);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        pageFactory = new Pagee(driver);
        driver.get(prop.getProperty("URL"));
    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
}






