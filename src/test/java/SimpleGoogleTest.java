import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

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
    public void googleTest() throws Exception{

        driver.get("http://localhost/litecart/admin/");
        //driver.wait(100);
        Thread.sleep(4000);
        //driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
        WebElement email =  driver.findElement(By.name("username"));
        email.sendKeys("admin");
        Thread.sleep(2000);
        WebElement psw =  driver.findElement(By.name("password"));
        psw.sendKeys("admin");
        Thread.sleep(2000);
        WebElement loginBtn = driver.findElement(By.name("login"));
        loginBtn.click();
        Thread.sleep(2000);
        WebElement appearence = driver.findElement(By.xpath("//span[text()=\"Appearence\"]"));
        appearence.click();
        Thread.sleep(2000);
        WebElement template = driver.findElement(By.xpath("//span[text()=\"Template\"]"));
        template.click();
        Thread.sleep(2000);
        WebElement logotype = driver.findElement(By.xpath("//span[text()=\"Logotype\"]"));
        logotype.click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[text()=\"Catalog\"]")).click();
        driver.findElement(By.id("doc-catalog")).click();
        driver.findElement(By.id("doc-product_groups")).click();
        driver.findElement(By.id("doc-option_groups")).click();
        driver.findElement(By.id("doc-manufacturers")).click();
        driver.findElement(By.id("doc-suppliers")).click();
        driver.findElement(By.id("doc-delivery_statuses")).click();
        driver.findElement(By.id("doc-sold_out_statuses")).click();
        driver.findElement(By.id("doc-quantity_units")).click();
        driver.findElement(By.id("doc-csv")).click();

        driver.findElement(By.xpath("//span[text()=\"Countries\"]"));

    }

}
