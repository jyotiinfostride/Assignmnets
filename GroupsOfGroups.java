package TestNG;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GroupsOfGroups {

    @Test (groups = {"Run"})

    public void testcase1()
    {
        System.out.println("Test case belongs to Run");
    }
    @Test(groups={"Smoke"})
    public void testcase2()
    {
        System.out.println("Test case belongs to Smoke Testing");
    }
    @Test(groups={"Sanity"})
    public void testcase3()
    {
        System.out.println("Test case belongs to Sanity Testing");
    }
}


