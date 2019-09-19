import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Task1_click_all_on_admin_page {
    private WebDriver driver;
    String login = "admin";
    String psw = "admin";
    String baseURL = "http://localhost/litecart";

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void cleanup(){
        System.out.println("test");
        driver.quit();
    }

    @Test
    public void adminPageTest() {

        performLogin(driver, login, psw);
        Assert.assertTrue(isElementPresent(driver, By.cssSelector("/h1")));


        driver.findElement(By.xpath("//span[text()=\"Appearence\"]")).click();

        driver.findElement(By.xpath("//span[text()=\"Template\"]")).click();


        driver.findElement(By.xpath("//span[text()=\"Logotype\"]")).click();

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


        driver.findElement(By.xpath("//span[text()=\"Countries\"]")).click();


        driver.findElement(By.xpath("//span[text()=\"Currencies\"]")).click();


        driver.findElement(By.xpath("//span[text()=\"Customers\"]")).click();

        driver.findElement(By.id("doc-customers")).click();
        driver.findElement(By.id("doc-csv")).click();
        driver.findElement(By.id("doc-newsletter")).click();

        driver.findElement(By.xpath("//span[text()=\"Languages\"]")).click();

        driver.findElement(By.id("doc-languages")).click();
        driver.findElement(By.id("doc-storage_encoding")).click();


        driver.findElement(By.xpath("//span[text()=\"Modules\"]")).click();

        driver.findElement(By.xpath("//span[text()=\"Background Jobs\"]")).click();

        driver.findElement(By.xpath("//span[text()=\"Customer\"]")).click();

        driver.findElement(By.xpath("//span[text()=\"Shipping\"]")).click();

        driver.findElement(By.xpath("//span[text()=\"Payment\"]")).click();

        driver.findElement(By.xpath("//span[text()=\"Order Total\"]")).click();

        driver.findElement(By.xpath("//span[text()=\"Order Success\"]")).click();

        driver.findElement(By.xpath("//span[text()=\"Order Action\"]")).click();


        driver.findElement(By.xpath("//span[text()=\"Orders\"]")).click();

        driver.findElement(By.id("doc-orders")).click();
        driver.findElement(By.id("doc-order_statuses")).click();

        driver.findElement(By.xpath("//span[text()=\"Pages\"]")).click();


        driver.findElement(By.xpath("//span[text()=\"Reports\"]")).click();

        driver.findElement(By.id("doc-monthly_sales")).click();
        driver.findElement(By.id("doc-most_sold_products")).click();
        driver.findElement(By.id("doc-most_shopping_customers")).click();

        driver.findElement(By.xpath("//span[text()=\"Settings\"]")).click();


        driver.findElement(By.id("doc-store_info")).click();
        driver.findElement(By.id("doc-defaults")).click();
        driver.findElement(By.id("doc-general")).click();
        driver.findElement(By.id("doc-listings")).click();
        driver.findElement(By.id("doc-images")).click();
        driver.findElement(By.id("doc-checkout")).click();
        driver.findElement(By.id("doc-advanced")).click();
        driver.findElement(By.id("doc-security")).click();

        driver.findElement(By.xpath("//span[text()=\"Slides\"]")).click();


        driver.findElement(By.xpath("//span[text()=\"Tax\"]")).click();
        driver.findElement(By.id("doc-tax_classes")).click();
        driver.findElement(By.id("doc-tax_rates")).click();

        driver.findElement(By.xpath("//span[text()=\"Translations\"]")).click();
        driver.findElement(By.id("doc-search")).click();
        driver.findElement(By.id("doc-scan")).click();
        driver.findElement(By.id("doc-csv")).click();


        driver.findElement(By.xpath("//span[text()=\"Users\"]")).click();

        driver.findElement(By.xpath("//span[text()=\"vQmods\"]")).click();
        driver.findElement(By.id("doc-vqmods")).click();

    }
    boolean isElementPresent(WebDriver driver, By locator) {
        try { driver.findElement(locator);
            return true;

        } catch (NoSuchElementException ex) {
            System.out.println(locator + " not found");
            return false; } }

    void performLogin (WebDriver drv, String login, String psw) {
        driver.get(baseURL);
        if (isElementPresent(drv,By.id("\"box-apps-menu-wrapper\"")))   return;

            driver.findElement(By.name("username")).sendKeys(login);
            driver.findElement(By.name("password")).sendKeys(psw);
            driver.findElement(By.name("login")).click();

    }

}
