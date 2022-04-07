package homework;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class zadanie7 {

public static void main(String[] args) {
    //przypisanie lokatorów zmiennym
    String allProducts = "//*[@id=\"content\"]/section/a";
    String filterProducts = "//*[contains(text(),'€11.00 - €14.00')]";
    //łączenie z przeglądarką
    System.setProperty("webdriver.chrome.driver",
            "src/main/resources/drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://prod-kurs.coderslab.pl/index.php");
    //pobieranie danych z przeglądarki
    WebElement allProductsInputBox = driver.findElement(By.xpath(allProducts));
    allProductsInputBox.click();
    WebElement filterProductsInputBox = driver.findElement(By.xpath(filterProducts));
    filterProductsInputBox.click();
    //próba pobrania wyfiltrowanych produktów
    List<WebElement> elements = driver.findElements(By.xpath("//*[contains(text(),'€11.00 - €14.00')]"));
          for (WebElement element : elements) {
                System.out.println(element.getText());
    File screenshot = ((TakesScreenshot) driver)
            .getScreenshotAs(OutputType.FILE);
    String fileName;
    try {
        FileUtils.copyFile(screenshot, new File("Pulpit.screenshot2.jpg"));
    } catch (IOException e) {
        e.printStackTrace();
    }
}}}