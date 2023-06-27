package browserfactory;

/**
 * 1. Create the package ‘browserfactory’ and create the
 * class with the name ‘BaseTest’ inside the
 * ‘browserfactory’ package.
 * 2. write the browser setup code inside the class ‘Base Test’.
 */

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;


    public void  openBrowser (String baseURL) {

        // Launch the Chrome Browser
        driver = new ChromeDriver();

        // Open the URL into Browser
        driver.get(baseURL);


        // We give Implicit wait to Driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));

        // Maximise Browsert
        driver.manage().window().maximize();
    }
    @After
    public void closeBrowser(){
        driver.quit();
    }
}
