import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleGoogleTest {
    private WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @After
    public void cleanup(){
        driver.quit();
    }

    @Test
    public void googleTest(){

        driver.get("http://google.com");
        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.findElement(By.name("btnK")).click();

    }

}
