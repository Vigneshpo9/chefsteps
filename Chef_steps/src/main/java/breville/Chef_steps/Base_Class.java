package breville.Chef_steps;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;




public class Base_Class {
	
		
	
	
	public static  WebDriver driver;
	public static String value;
	
	public static WebDriver browserlaunch(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"//Driver//chromedriver.exe");
            driver = new ChromeDriver();
			}
		else if (type.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.geco.driver",
					System.getProperty("user.dir")+"//Driver//chromedriver.exe");
			driver = new FirefoxDriver();
			
		}

          driver.manage().window().maximize();
          return driver;
	}
        public static void url(String url) {
           driver.get(url);
		}
        public static void inputvalues(WebElement element, String values) {
        	element.sendKeys(values);
			}
        public static void click(WebElement element) {
        	element.click();
        }
        public static void selectindex(WebElement element, int value) {
        	Select s = new Select(element);
        	s.selectByIndex(value);
        }
        
        public static String perticular_Data(String path, int row_Index, int cell_Index) throws Throwable {
            File f = new File(path);
            FileInputStream fis = new FileInputStream(f);
            Workbook wb = new XSSFWorkbook(fis);
            Sheet sheetAt = wb.getSheetAt(0);
            Row row = sheetAt.getRow(row_Index);
            Cell cell = row.getCell(cell_Index);
            CellType cellType = cell.getCellType();
           
            if (cellType.equals(cellType.STRING)) {
				 value = cell.getStringCellValue();
			}
            else if (cellType.equals(cellType.NUMERIC)) {
				double cellValue = cell.getNumericCellValue();
				int val = (int) cellValue;
				value = String.valueOf(val);
			}
            return value;
		}
        public static  void clear(WebElement element) {
        	element.clear();
		}
       

		
         public static void backSpace(WebElement element) throws AWTException {
	      element.clear();
         }
         public static void sleep(int sec) throws InterruptedException {
		 Thread.sleep(sec);
         }
          public static void waitt() {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  }
          private void scrollElementView(WebElement element) {
        	  JavascriptExecutor js =  (JavascriptExecutor) driver;
        	  js.executeScript("arguments[0].scrollIntoview();", element);
        	  
          }
          public static void close() {
        	  driver.close();
          }
          private static void Quit() {
        	  driver.quit();
	

		}
			

		}



