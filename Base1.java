package demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base1 {
	static WebDriver driver;
	
	void CreateNewAcount() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	}
	void signup() {
		driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']//child::button")).click();	
		
		}
	void question() {
		driver.findElement(By.xpath("//*[@name='reg_passwd__']//following::input[@name='reg_email__']")).click();
	}
	void question1() {
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']//preceding::input[@class='inputtext _58mg _5dba _2ph-']")).click();
	}
void question2() {
	driver.findElement(By.xpath("//div[@class='module_contents']//following::a[@class='media_link']"));
}
}
