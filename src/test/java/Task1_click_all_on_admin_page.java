import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task1_click_all_on_admin_page {
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

        driver.findElement(By.name("username")).sendKeys("admin");

        driver.findElement(By.name("password")).sendKeys("admin");

        driver.findElement(By.name("login")).click();
        isElementPresent(driver, By.cssSelector("h1"));

        driver.findElement(By.xpath("//span[text()=\"Appearence\"]")).click();
        isElementPresent(driver, By.cssSelector("h1"));

        driver.findElement(By.xpath("//span[text()=\"Template\"]")).click();
        isElementPresent(driver, By.cssSelector("h1"));

        driver.findElement(By.xpath("//span[text()=\"Logotype\"]")).click();
        isElementPresent(driver, By.cssSelector("h1"));

        driver.findElement(By.xpath("//span[text()=\"Catalog\"]")).click();
        isElementPresent(driver, By.cssSelector("h1"));
        driver.findElement(By.id("doc-catalog")).click();
        isElementPresent(driver, By.cssSelector("h1"));
        driver.findElement(By.id("doc-product_groups")).click();
        isElementPresent(driver, By.cssSelector("h1"));
        driver.findElement(By.id("doc-option_groups")).click();
        isElementPresent(driver, By.cssSelector("h1"));
        driver.findElement(By.id("doc-manufacturers")).click();
        isElementPresent(driver, By.cssSelector("h1"));
        driver.findElement(By.id("doc-suppliers")).click();
        isElementPresent(driver, By.cssSelector("h1"));
        driver.findElement(By.id("doc-delivery_statuses")).click();
        isElementPresent(driver, By.cssSelector("h1"));
        driver.findElement(By.id("doc-sold_out_statuses")).click();
        isElementPresent(driver, By.cssSelector("h1"));
        driver.findElement(By.id("doc-quantity_units")).click();
        isElementPresent(driver, By.cssSelector("h1"));
        driver.findElement(By.id("doc-csv")).click();
        isElementPresent(driver, By.cssSelector("h1"));

        driver.findElement(By.xpath("//span[text()=\"Countries\"]")).click();
        isElementPresent(driver, By.cssSelector("h1"));

        driver.findElement(By.xpath("//span[text()=\"Currencies\"]")).click();
        isElementPresent(driver, By.cssSelector("h1"));

        driver.findElement(By.xpath("//span[text()=\"Customers\"]")).click();
        isElementPresent(driver, By.cssSelector("h1"));
        driver.findElement(By.id("doc-customers")).click();
        driver.findElement(By.id("doc-csv")).click();
        driver.findElement(By.id("doc-newsletter")).click();

        driver.findElement(By.xpath("//span[text()=\"Languages\"]")).click();
        isElementPresent(driver, By.cssSelector("h1"));
        driver.findElement(By.id("doc-languages")).click();
        driver.findElement(By.id("doc-storage_encoding")).click();


        driver.findElement(By.xpath("//span[text()=\"Modules\"]")).click();
        isElementPresent(driver, By.cssSelector("h1"));
        driver.findElement(By.xpath("//span[text()=\"Background Jobs\"]")).click();
        isElementPresent(driver, By.cssSelector("h1"));
        driver.findElement(By.xpath("//span[text()=\"Customer\"]")).click();
        isElementPresent(driver, By.cssSelector("h1"));
        driver.findElement(By.xpath("//span[text()=\"Shipping\"]")).click();
        isElementPresent(driver, By.cssSelector("h1"));
        driver.findElement(By.xpath("//span[text()=\"Payment\"]")).click();
        isElementPresent(driver, By.cssSelector("h1"));
        driver.findElement(By.xpath("//span[text()=\"Order Total\"]")).click();
        isElementPresent(driver, By.cssSelector("h1"));
        driver.findElement(By.xpath("//span[text()=\"Order Success\"]")).click();
        isElementPresent(driver, By.cssSelector("h1"));
        driver.findElement(By.xpath("//span[text()=\"Order Action\"]")).click();
        isElementPresent(driver, By.cssSelector("h1"));

        driver.findElement(By.xpath("//span[text()=\"Orders\"]")).click();
        isElementPresent(driver, By.cssSelector("h1"));
        driver.findElement(By.id("doc-orders")).click();
        driver.findElement(By.id("doc-order_statuses")).click();

        driver.findElement(By.xpath("//span[text()=\"Pages\"]")).click();
        isElementPresent(driver, By.cssSelector("h1"));

        driver.findElement(By.xpath("//span[text()=\"Reports\"]")).click();
        isElementPresent(driver, By.cssSelector("h1"));
        driver.findElement(By.id("doc-monthly_sales")).click();
        driver.findElement(By.id("doc-most_sold_products")).click();
        driver.findElement(By.id("doc-most_shopping_customers")).click();

        driver.findElement(By.xpath("//span[text()=\"Settings\"]")).click();
        isElementPresent(driver, By.cssSelector("h1"));

        driver.findElement(By.id("doc-store_info")).click();
        driver.findElement(By.id("doc-defaults")).click();
        driver.findElement(By.id("doc-general")).click();
        driver.findElement(By.id("doc-listings")).click();
        driver.findElement(By.id("doc-images")).click();
        driver.findElement(By.id("doc-checkout")).click();
        driver.findElement(By.id("doc-advanced")).click();
        driver.findElement(By.id("doc-security")).click();

        driver.findElement(By.xpath("//span[text()=\"Slides\"]")).click();
        isElementPresent(driver, By.cssSelector("h1"));

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

}
