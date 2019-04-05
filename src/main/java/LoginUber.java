import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginUber {
    public WebDriver driver;
    @Test
    public void getDriver() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.get("https://www.uber.com/ua/en/");


        driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div/div[4]/div/div/div[2]/div/p/a")).click();
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div/div[2]/div/a/div")).click();

        driver.findElement(By.id("firstName")).clear();
        driver.findElement(By.id("firstName")).sendKeys("Лариса");
        driver.findElement(By.id("lastName")).clear();
        driver.findElement(By.id("lastName")).sendKeys("Чумаченко");
        driver.findElement(By.id("mobile")).clear();
        driver.findElement(By.id("mobile")).sendKeys("503904100");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("larisa.chumachenko@gmail.com");
        driver.findElement(By.id("addPassword")).clear();
        driver.findElement(By.id("addPassword")).sendKeys("jaglara17");
        driver.findElement(By.xpath("//*[@id=\"answerForm\"]/button")).click();
       // driver.findElement(By.className("recaptcha-checkbox-checkmark")).click();


//<div class="recaptcha-checkbox-checkmark" role="presentation"></div>

    }
}
