

import org.junit.After;
import org.junit.Test;
import org.junit.Before;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class FirstSeleniumTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before 
    public void start() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void FirstSeleniumTest () {
        driver.get("http://localhost/litecart/admin/");

        driver.findElement(By.name("username")).sendKeys("admin", Keys.ENTER);
        driver.findElement(By.name("password")).sendKeys("admin", Keys.ENTER);
        driver.findElement(By.name("login")).click();

        //wait.until(titleIs("webdriver - Google Search"));

    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }

}