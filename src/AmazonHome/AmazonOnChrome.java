package AmazonHome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AmazonOnChrome {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/faizhamid/IdeaProjects/SeleniumProject1/Driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
        System.out.println(driver.getTitle());
        driver.close();
    }
}
