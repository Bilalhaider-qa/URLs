package URL;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mainn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String csvFile = "C:\\123.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        WebDriver driver;
     System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");  
       // System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new FirefoxDriver();
		//driver = new ChromeDriver();
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] appl = line.split(cvsSplitBy);
               
                System.out.println(appl[0]);
               
               
                //driver.manage().window().setSize(new Dimension(375,667));
                driver.get(appl[0]);
    			
    			driver.manage().window().maximize();
    			//Thread.sleep(2000);
    			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
    			//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


	}

}
