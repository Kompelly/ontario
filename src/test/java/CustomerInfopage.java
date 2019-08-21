

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerInfopage
{

    private WebDriver driver;
   public CustomerInfopage(WebDriver  driver) {
       this.driver = driver;
   }


    public void entrusting() throws InterruptedException {

        // WebDriverWait webDriverWait = new WebDriverWait();

         Thread.sleep(1000);
         driver.findElement(By.id("checkout_email")).sendKeys("suman@gmail.com");
         Thread.sleep(1000);


         driver.findElement(By.id("checkout_shipping_address_first_name")).sendKeys("suman");
         Thread.sleep(1000);
         driver.findElement(By.id("checkout_shipping_address_last_name")).sendKeys("kompelly");
         Thread.sleep(1000);
         driver.findElement(By.id("checkout_shipping_address_address1")).sendKeys("3580 Major MacKenzie Dr W");
         Thread.sleep(1000);
         driver.findElement(By.id("checkout_shipping_address_address2")).sendKeys("188");
         Thread.sleep(1000);
         driver.findElement(By.id("checkout_shipping_address_city")).sendKeys("Vaughan");
         Thread.sleep(1000);
         driver.findElement(By.id("checkout_shipping_address_zip")).sendKeys("L6A 1S1");
         Thread.sleep(1000);
         driver.findElement(By.id("checkout_shipping_address_phone")).sendKeys("5144493883");
         Thread.sleep(2000);
     }
}
