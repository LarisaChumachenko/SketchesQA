import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.name;

public class LoginLogin {
    public WebDriver driver;
    @Test
    public void getDriver() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30);

        driver.get("http://www.metclub.ru/");


        driver.findElement(By.name("Username"));
        driver.findElement(By.name("Username")).sendKeys("admin");

        driver.findElement(By.name("Password"));
        driver.findElement(By.name("Password")).sendKeys("12345");

        Thread.sleep(2000);
       driver.findElement(By.name("Username")).sendKeys(Keys.ENTER);
       // driver.findElement(By.name("btnSignIn")).sendKeys("btnSignIn");
        driver.quit();
    }





}
