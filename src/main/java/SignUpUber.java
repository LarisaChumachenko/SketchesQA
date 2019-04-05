import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpUber {
    public WebDriver driver;

    @Test
    public void getDriver() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.get("https://www.uber.com/ua/en/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div/div[4]/div/div/div[2]/div/p/a")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div/div[4]/a/div")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div/div/div[2]/div/div[1]/div[2]/div/div[3]/a/div/div[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[4]/div/div/ul/li[1]/div/div[2]/p")).click();

        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[4]/div/div/ul/li[1]/div/div[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[4]/div/div/ul/li[1]/div/div[2]/p")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[4]/div/div/ul/li[1]/div/div[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[6]/div/div/div[1]/div/div/a")).click();

        driver.findElement(By.id("firstName")).clear();
        driver.findElement(By.id("firstName")).sendKeys("James");
        driver.findElement(By.id("lastName")).clear();
        driver.findElement(By.id("lastName")).sendKeys("Hetfield");
        driver.findElement(By.id("mobile")).clear();
        driver.findElement(By.id("mobile")).sendKeys("103081963");
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("jam.alan.hetfield@gmail.com");
        driver.findElement(By.id("addPassword")).clear();
        driver.findElement(By.id("addPassword")).sendKeys("metallica81");
        driver.findElement(By.xpath("//*[@id=\"answerForm\"]/button")).click();
        Thread.sleep(3000);
        Assert.assertNotNull(driver.findElement(By.xpath("//*[@id=\"answerForm\"]/button")));


    }
    @After
    public void exitAndClear(){

        driver.quit();

    }
}
