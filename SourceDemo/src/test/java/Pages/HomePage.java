package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.util.Iterator;
import java.util.Set;

import static java.time.Duration.*;

public class HomePage {

    public static WebDriver driver;

    // links

    @FindBy(partialLinkText="Sauce Labs Backpack")
     WebElement backPack;
    @FindBy(partialLinkText="Sauce Labs Bike Light")
     WebElement bikeLight;
    @FindBy(partialLinkText="Sauce Labs Bolt T-Shirt")
     WebElement tShirt;
    @FindBy(partialLinkText="Sauce Labs Fleece Jacket")
     WebElement jacket;
    @FindBy(partialLinkText="Sauce Labs Onesie")
     WebElement onesie;
    @FindBy(partialLinkText="Test.allTheThings() T-Shirt (Red)")
     WebElement tRed;


    // cart
    @FindBy(className = "shopping_cart_link")
    WebElement cart;

    // menu button and there links
    @FindBy(id="react-burger-menu-btn")
     WebElement menu;
    @FindBy(id="logout_sidebar_link")
     WebElement allItems;
    @FindBy(id="logout_sidebar_link")
     WebElement logout;
    @FindBy(partialLinkText = "Reset App State")
     WebElement resetAppState;



    // add to cart

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
     WebElement backPackCart;
    @FindBy(id="add-to-cart-sauce-labs-bike-light")
     WebElement bikeLightCart;
    @FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")
     WebElement tShirtCart;
    @FindBy(id="add-to-cart-sauce-labs-fleece-jacket")
     WebElement jacketCart;
    @FindBy(id="add-to-cart-sauce-labs-onesie")
     WebElement onesieCart;
    @FindBy(id="add-to-cart-test.allthethings()-t-shirt-(red)")
     WebElement tRedCart;

    // add to cartRemove

    @FindBy(id="remove-sauce-labs-backpack")
     WebElement backPackRemove;
    @FindBy(id="remove-sauce-labs-bike-light")
     WebElement bikeLightRemove;
    @FindBy(id="remove-sauce-labs-bolt-t-shirt")
    WebElement tShirtRemove;
    @FindBy(id="remove-sauce-labs-fleece-jacket")
     WebElement jacketRemove;
    @FindBy(id="remove-sauce-labs-onesie")
     WebElement onesieRemove;
    @FindBy(id="remove-test.allthethings()-t-shirt-(red)")
     WebElement tshirtRedRemove;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    static SoftAssert soft = new SoftAssert();

    //Link check

    public void setBackPack(){
        backPack.click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=4";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public void setBikeLight(){
        bikeLight.click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=0";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public void settShirt(){
        tShirt.click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=1";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public void setJacket(){
        jacket.click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=5";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public void settRed(){
        tRed.click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=3";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public void setOnesie(){
        onesie.click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=2";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    //Logout method
    public void setLogout(){
        menu.click();
        driver.manage().timeouts().implicitlyWait(ofSeconds(10));
        logout.click();
    }


    //Add to cart function
    public void setBackPackCart(){
        backPackCart.click();
        String act = backPackRemove.getText();
        String exp = "REMOVE";
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public void setBikeLightCart(){
        bikeLightCart.click();
        String act =  bikeLightRemove.getText();
        String exp = "REMOVE";
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public void settShirtCart(){
        tShirtCart.click();
        String act = tShirtRemove.getText();
        String exp = "REMOVE";
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public void setJacketCart(){
        jacketCart.click();
        String act = jacketRemove.getText();
        String exp = "REMOVE";
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public void settRedCart(){
        tRedCart.click();
        String act = tshirtRedRemove.getText();
        String exp = "REMOVE";
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public void setOnesieCart(){
        onesieCart.click();
        String act = onesieRemove.getText();
        String exp = "REMOVE";
        soft.assertEquals(act,exp);
        soft.assertAll();
    }
}

