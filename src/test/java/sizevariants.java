

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class sizevariants {

    private WebDriver driver;

    public sizevariants(WebDriver driver) {
        this.driver = driver;
    }

    public void selectvariant() throws InterruptedException {

        if (driver.findElement(By.xpath("//li[4]//label[1]")).isEnabled() == false )
        {
            driver.findElement(By.xpath("//li[4]//label[1]")).click();
        } else
            {
                if (driver.findElement(By.xpath("//li[3]//label[1]")).isEnabled() == false )
                {
                    driver.findElement(By.xpath("//li[3]//label[1]")).click();
                } else
                {
                    if (driver.findElement(By.xpath("//li[2]//label[1]")).isEnabled() == true)
                    {
                        driver.findElement(By.xpath("//li[2]//label[1]")).click();
                    } else
                    {
                        if (driver.findElement(By.xpath("//li[1]//label[1]")).isEnabled() == true)
                        {
                            driver.findElement(By.xpath("//li[1]//label[1]")).click();
                        }
                    }
                }

            }

        Thread.sleep(1000);
    }
}

