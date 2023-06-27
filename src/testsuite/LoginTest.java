package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseURL = "https://www.saucedemo.com/";

    @Before
    public void setUp() {
        openBrowser(baseURL);
    }

    /**
     * userSholdLoginSuccessfullyWithValidCredentials
     * Enter “standard_user” username
     * Enter “secret_sauce” password
     * Click on ‘LOGIN’ button
     * Verify the text “PRODUCTS”
     */
    @Test
    // Create a Calss userShouldNavigateToLoginPageSuccessfully
    public void userSholdLoginSuccessfullyWithValidCredentials() {

        //Enter “standard_user” username
        //Find the email field and Enter Email address
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
        //Find the password Field and Enter the password
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
        // Click on the Login button
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        // Verify the text “PRODUCTS”

        String expectedText = "Products";
        String actualText = driver.findElement(By.xpath("//span[@class='title']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {

        //Enter “standard_user” username
        // Enter “secret_sauce” password
        // Click on ‘LOGIN’ button
        // Verify that six products are displayed
        // on page

        //Enter “standard_user” username
        //Find the email field and Enter Email address
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
        //Find the password Field and Enter the password
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
        // Click on the Login button
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        //Verify that six products are displayed on page
        int expectedProducts = 6;
        int actualProducts = driver.findElements(By.xpath("//div[@class = 'inventory_item']")).size();
        Assert.assertEquals("Products do not match", expectedProducts, actualProducts);
    }

    @After
    public void closeBrowser(){
        driver.quit();
    }
    }
