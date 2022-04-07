package taskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {


    public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
driver.get("https://pl.wikipedia.org");
        WebElement element = driver.findElement(By.id("main-page-column1"));
        System.out.println(element.getText());
    }
}
