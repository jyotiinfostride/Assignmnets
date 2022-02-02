

package demo.test;
import java.util.List;

//dummy
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

    public class Assignment {
        public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']//child::button")).click();
		driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']//parent::div//preceding-sibling::div//child::input[@name='firstname']"));
		driver.findElement(By.xpath("//input[@name='reg_passwd__']//following::input[@name='reg_email__']")).click();
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']//preceding::input[@class='inputtext _58mg _5dba _2ph-']")).click();
	}
        {
            WebDriverManager.chromedriver().setup();
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://www.bbc.com/");
            List<WebElement> list =driver.findElements(By.xpath("//div[@class='content']//following::a[@class='media__link']"));
            list.forEach(name->{
                System.out.println(name.getText());
            });
            driver.close();
        }
    }

