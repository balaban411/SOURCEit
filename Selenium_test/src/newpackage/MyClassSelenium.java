package newpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClassSelenium {


    public static void main(String[] args) {
        
    	System.setProperty("anatoliibalaban@Anatoliis-MacBook-Pro selenium-java-3.141.59 (2)");
		WebDriver driver = new ChromeDriver();
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

       
        driver.get(baseUrl);

        
        actualTitle = driver.getTitle();

       
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
      
        driver.close();
       
    }

}
