import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationTest {

    public WebDriver driver;


    @Before
    public void getDriver() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30);
   //     driver.get("https://anje.com.ua/");

    }
  //  public static void main(String[]args) {
  //  public static void main(String[]args) {
     //   for (int i = 0; i < 100; i++) {


            @Test


            public void RegistrationTest1 () {


             //   public static void main (String[]args){
                    for (int i = 0; i < 100; i++) {
                        driver.findElement(By.linkText("Вход / Регистрация")).sendKeys(Keys.RETURN);
                        driver.findElement(By.name("completecart")).sendKeys(Keys.RETURN);

                        driver.findElement(By.name("name")).sendKeys("Takeshi");
                        driver.findElement(By.name("surname")).sendKeys("Kitano");
                        driver.findElement(By.name("email")).sendKeys("takeshi.kitano.fireworks.ku" + 1 + "@gmail.com");
                        driver.findElement(By.name("password")).sendKeys("1234567");
                        driver.findElement(By.name("password2")).sendKeys("1234567");
                        driver.findElement(By.name("register")).sendKeys(Keys.RETURN);

                        Assert.assertNotNull(driver.findElement(By.className("p-root-h1")));


                  //             @After
                  //      public void exitAndClear () {
                            System.out.println("6. Exit");
                            driver.quit();

                        }
                    }

                }

                //   public static void main(String[] args) {
                //     for (int i = 0; i < 100; i++ ){
                //       System.out.println("takeshi.kitano.fireworks.kuku"+1+"@gmail.com");


    //        }       }