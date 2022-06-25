package testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {

    @Test
    void checkTitle(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOption = new ChromeOptions();
        chromeOption.setHeadless(true);
        WebDriver driver = new ChromeDriver(chromeOption);
        driver.get("http://google.com");
        Assert.assertTrue(driver.getTitle().contains("Google"));
    }
}
