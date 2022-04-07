package taskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Zadanie1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        String hotelInputLocator = "tu_wpisz_znalezione_id";
        String searchNowButtonLocator = "tu_wpisz_znalezione_id";
        String emailInputLocator = "tu_wpisz_znalezione_id";
//        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qloapps.coderslab.pl/en/");
        WebElement hotelLocationInput = driver.findElement(By.id(hotelInputLocator));
        WebElement searchNowButton = driver.findElement(By.id(searchNowButtonLocator));
        WebElement emailInput = driver.findElement(By.id(emailInputLocator));
        // dalej możemy pracować z elementami
    }}
