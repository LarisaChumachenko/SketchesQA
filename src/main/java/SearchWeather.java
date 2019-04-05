import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchWeather {
    public WebDriver driver;
    @Test
    public void getDriver() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 20);

        driver.get("https://www.meteoprog.ua/ru/");

        driver.findElement(By.name("search_city"));
        driver.findElement(By.name("search_city")).clear();
        driver.findElement(By.name("search_city")).sendKeys("Жмеринка");
        Thread.sleep(2000);
        driver.findElement(By.name("search_city")).sendKeys(Keys.RETURN);


      Assert.assertNotNull(driver.findElement(By.className("currentSelectDay")));

    }
        @After
        public void exitAndClear () {

            driver.quit();


        }
    }