package AmazonHome;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AmazonOnFireFox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/faizhamid/IdeaProjects/SeleniumProject1/Driver/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
        System.out.println(driver.getTitle());
        driver.close();
    }
}