import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;

public class Data_Driven {
    String path,pathdriver;
    WebDriver driver;
    public void Read_Data() throws IOException
    {

//
//		pathdriver=System.getProperty("user.dir")+"//Driver/chrome//path=System.getProperty("user.dir")+"/SELENIUM_Demo/src/Driver/chromedriver.exe";
//		System.out.println("pathdriver");
//		//Step 1
//		System.setProperty("webdriver.chrome.driver", pathdriver);
//		driver= new ChromeDriver();

//        step1 Giving the path of the xlsx file
        path = System.getProperty("user.dir")+"\\TestData\\Test_Data.xlsx";
        System.out.println(path);
        //path=System.getProperty("user.dir")+"//SELENIUM_Demo//Driver/chromedriver.exe";
        //step2 Give the path in fileinputstream class where you want to read data
        FileInputStream fis=new FileInputStream(path);
        //step 3 Move to Workbook
        XSSFWorkbook wk = new XSSFWorkbook(fis);
        //Step4 Move to specific Sheet
        XSSFSheet sheet = wk.getSheetAt(0);
        //Step5 Read Rows from excel Sheet
        System.out.println(sheet.getLastRowNum());

    }
    public static void main(String [] args)throws IOException
    {
        Data_Driven obj =new Data_Driven();
        obj.Read_Data();

    }
}
