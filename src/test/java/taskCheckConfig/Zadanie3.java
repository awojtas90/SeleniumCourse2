package taskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie3 {
    public static void main(String[] args) {
        String signInButtonLocator = ".hide_xs";
//        String emailAdressInputLocator = ".is_required.validate.account_input.form-control";
//        String createAccountButtonLocator = "SubmitCreate";
        System.setProperty("webdriver.chrome.driver",
           "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qloapps.coderslab.pl/en/");
        WebElement signInButton = driver.findElement(By.cssSelector(signInButtonLocator));
        signInButton.click();
//        WebElement emailAdressInputBox = driver.findElement(By.cssSelector(emailAdressInputLocator));
//       emailAdressInputBox.sendKeys("agaaga7979@test.pl");
//        WebElement createAccountButton = driver.findElement(By.id(createAccountButtonLocator));
//        createAccountButton.click();
}}
