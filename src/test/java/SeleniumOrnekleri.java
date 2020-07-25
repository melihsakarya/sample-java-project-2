import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumOrnekleri {

    @Test
    public void ornekTest(){

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriver driver2 = new FirefoxDriver();

        //driver = driver2;

        driver.get("https://www.gittigidiyor.com");

        driver.findElement(By.id("search_word")).sendKeys("iphone");
        driver.findElement(By.id("textSearch_ara")).click();

        WebElement aramaElemani = driver.findElement(By.id("search_word"));


        driver.quit();
    }
}
