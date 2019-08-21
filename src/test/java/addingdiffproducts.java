

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class addingdiffproducts extends url
{
    WebDriver driver;

    @Before

    public void setup()
    {
        //System.setProperty("webdriver.gecko.driver","//Users//sumankompelly//Downloads//geckodriver");

        System.setProperty("webdriver.chrome.driver","//Users//sumankompelly//Downloads//chromedriver");
        driver = new ChromeDriver();
        driver.get(baseurl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


    }

    @Test

    public void agegateverification() throws InterruptedException {


      //  ************** Agegate *****************

            Agegate ob1 = new Agegate(driver);
            ob1.agegate();

        //  ************** HoME PAGE  **************

        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//h3[@class='menu__item--title'][contains(text(),'Cannabis')]"));
        actions.moveToElement(element).build().perform();
        driver.findElement(By.xpath("//ul[@class='unstyled no-margin menu__tier-two__menu-primary']//li[1]//div[1]//div[1]//ul[1]//li[1]//a[1]//span[1]")).click();


        //  ************** COLLECTION  PAGE  **************
        Thread.sleep(1000);
        driver.findElement(By.xpath("//article[@id='product_1314092451660']//div[@class='product-tile__image-wrapper']")).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
       // driver.findElement(By.xpath("//li[1]//label[1]")).click();
        sizevariants ob2 = new sizevariants(driver);
        ob2.selectvariant();
        driver.findElement(By.xpath("//div[@class='section']//button[@class='counter__increment'][contains(text(),'+')]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn--primary btn--price btn--large variant-selector__submit full-width']")).click();

        //  ************** cart dropdown  **************
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='btn btn--primary full-width js-alert__close']")).click();




        //  ************** cart flyout  **************

        Thread.sleep(2000);
        WebElement checkbox = driver.findElement(By.xpath("//div[@id='flyout--overlay']//label[1]//span[1]"));
        checkbox.click();
        System.out.println(checkbox.isSelected());
        Thread.sleep(1000);
        driver.findElement(By.xpath("//label[2]//span[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='btn btn--primary full-width js-checkout-button']")).click();

        //  ************** Customer Information Page  **************

          CustomerInfopage ob = new CustomerInfopage(driver);
          ob.entrusting();
        //  ************** shipping to payment  **************

         driver.findElement(By.name("button")).click();
        Thread.sleep(2000);
         driver.findElement(By.xpath("//button[@name='button']")).click();
        Thread.sleep(1000);


    }

}