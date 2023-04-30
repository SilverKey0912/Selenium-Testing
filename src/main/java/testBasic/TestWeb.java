package testBasic;


import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class TestWeb {

    public void standard() {
        System.setProperty("webdrive.chrome.drive", "C:/Users/LENOVO/Downloads/Programs/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.saucedemo.com/");

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("user-name")).sendKeys("problem_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[1]/div[3]/a")).click();

        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Minh");
        driver.findElement(By.id("last-name")).sendKeys("Lee");
        driver.findElement(By.id("postal-code")).sendKeys("lucky");

        driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();

    }

}
