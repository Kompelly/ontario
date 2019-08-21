

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Agegate
{

    private WebDriver driver;
    public Agegate(WebDriver  driver) {
        this.driver = driver;
    }

             public void agegate()
             {
                 //  ************** Agegate -first page

                 driver.findElement(By.id("dob__day")).click();
                 new Select(driver.findElement(By.id("dob__day"))).selectByVisibleText("20");
                 driver.findElement(By.id("dob__month")).click();
                 new Select(driver.findElement(By.id("dob__month"))).selectByVisibleText("May - 05");
                 driver.findElement(By.id("dob__year")).click();
                 new Select(driver.findElement(By.id("dob__year"))).selectByVisibleText("1975");
                 driver.findElement(By.xpath("//button[@class='btn btn--outline']")).click();

                 //  ************** Agegate -second page **************

                 driver.findElement(By.xpath("//div[@id='shopify-section-overlay']//span[1]")).click();
                 driver.findElement(By.xpath("//button[@class='btn btn--outline']")).click();

                 //  ************** Agegate - third page **************

                 driver.findElement(By.xpath("//button[@class='btn btn--primary']")).click();
             }
}
