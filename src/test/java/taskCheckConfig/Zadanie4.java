package taskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie4 {
   public static void main(String[] args) throws InterruptedException {
        String signInButtonLocator = ".hide_xs";
//        String logInButtonLocator = "SubmitLogin";
        String emailAdressInputLocator = ".is_required.validate.account_input.form-control";
        String createAccountButtonLocator = "SubmitCreate";
        String firstNameInputLocator = "//input[@id=\"customer_firstname\"]";
        String lastNameInputLocator = "//input[@id=\"customer_lastname\"]";
        String emailToRegisterLocator = "//input[@id=\"email\"]";
        String passwordInputLocator = "//input[@id=\"passwd\"]";
        String registerButtonLocator = "//*[@id=\"submitAccount\"]";

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qloapps.coderslab.pl/en/");

       WebElement signInButton = driver.findElement(By.cssSelector(signInButtonLocator));
       signInButton.click();
       WebElement emailAdressInputBox = driver.findElement(By.cssSelector(emailAdressInputLocator));
       emailAdressInputBox.sendKeys("agaaga7799@test.pl");
       WebElement createAccountButton = driver.findElement(By.id(createAccountButtonLocator));
       createAccountButton.click();


       Thread.sleep(2000);
       WebElement firstNameInputBox = driver.findElement(By.xpath(firstNameInputLocator));
       firstNameInputBox.sendKeys("Agnieszka");
       WebElement lastNameInputBox = driver.findElement(By.xpath(lastNameInputLocator));
       lastNameInputBox.sendKeys("Kowalska");
       WebElement emailToRegisterInputBox = driver.findElement(By.xpath(emailToRegisterLocator));
       WebElement passwordInputBox = driver.findElement(By.xpath(passwordInputLocator));
       passwordInputBox.sendKeys("datadata");
//       WebElement logInButtonInputBox = driver.findElement(By.xpath(logInButtonLocator));
//       logInButtonInputBox.click();
       WebElement registerButtonInputBox = driver.findElement(By.xpath(registerButtonLocator));
       registerButtonInputBox.click();



//Dokończyć - jak dodać kliknięcie w przycisk register.
}}
//Wyszukaj elementy za pomocą lokalizatora by.xpath
//Będą na stronie rejestracji nowego użytkownika (patrz zadanie 3), wyszukaj za pomocą lokalizatorów xpath wszystkie wymagane pola tekstowe oraz wypełnij je dowolnymi danymi:
//
//First Name
//Last Name
//Email
//Password
//Kliknij przycisk Register, który również wyszukaj przy pomocy lokalizatora by.xpath.