import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {
    public WebDriver driver;
    @Test
    public void getDriver() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30);

        driver.get("http://testing-ground.scraping.pro/login");


        driver.findElement(By.id("usr"));
        driver.findElement(By.id("usr")).sendKeys("admin");
        Thread.sleep(1000);

        driver.findElement(By.id("pwd"));
        driver.findElement(By.id("pwd")).sendKeys("12345");

        Thread.sleep(2000);
        driver.findElement(By.id("usr")).sendKeys(Keys.ENTER);



        Assert.assertNotNull(driver.findElement(By.className("success")));
        Thread.sleep(1000);
    }

    @After
    public void clearTest() {
        driver.quit();
    }


}
