package DataDriven;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class AssignmentData_Provider {
    @DataProvider(name="Data")
    public Object[][] dataFetch() throws IOException {
        String path = System.getProperty("user.dir")+"\\TestData\\Test_Data.xlsx";
        System.out.println(path);
        //path=System.getProperty("user.dir")+"//SELENIUM_Demo//Driver/chromedriver.exe";
        //step2 Give the path in fileinputstream class where you want to read data
        FileInputStream fis=new FileInputStream(path);
        //step 3 Move to Workbook
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        //Step4 Move to specific Sheet
        XSSFSheet sheet = wb.getSheetAt(0);
        //Step5 Read Rows from excel Sheet
        int row=sheet.getLastRowNum();
        Object[][] arr = new Object[row-1][2];
        int rw=0;
        for(int i=2;i<=row;i++,rw++) {
            arr[rw][0] = sheet.getRow(i).getCell(0).getStringCellValue();
            arr[rw][1] = sheet.getRow(i).getCell(1).getStringCellValue();
        }
        return arr;
    }
    @Test (dataProvider = "Data")
    void login(String uname, String pass){
        System.out.println(uname+"\t"+pass);
    }


}

