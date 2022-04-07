package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zadanie3 {
    public static void main(String[] args) {
        String firstName = "firstName";
        String lastName = "lastName";
        String gender = "gender";
        String date = "dob";
        String address = "address";
        String email = "email";
        String password = "password";
        String company = "company";
        String comment = "comment";
        String submitButton = "submit";

        System.setProperty("webdriver.chrome.driver",
               "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");

        WebElement firstNameInputBox = driver.findElement(By.name(firstName));
        firstNameInputBox.sendKeys("Karol");
        WebElement lastNameInputBox = driver.findElement(By.name(lastName));
        lastNameInputBox.sendKeys("Kowalski");
        WebElement genderInputBox = driver.findElement(By.name(gender));
        genderInputBox.click();
        //? Jak wskazać, żeby zaznaczyło daną płeć?

        WebElement dobInputBox = driver.findElement(By.name(date));
        dobInputBox.sendKeys("05/22/2010");
        WebElement addressInputBox = driver.findElement(By.name(address));
        addressInputBox.sendKeys("Prosta 51");
        WebElement emailInputBox = driver.findElement(By.name(email));
        emailInputBox.sendKeys("karol.kowalski@mailinator.com");
        WebElement passwordInputBox = driver.findElement(By.name(password));
        passwordInputBox.sendKeys("Pass123");
        WebElement companyInputBox = driver.findElement(By.name(company));
        companyInputBox.sendKeys("Coders Lab");
        WebElement commentInputBox = driver.findElement(By.name(comment));
        commentInputBox.sendKeys("To jest mój pierwszy automat testowy");
        WebElement submitButtonInputBox = driver.findElement(By.id(submitButton));
        submitButtonInputBox.click();

    }


}

//Pod linkiem https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html dostępny jest formularz, którego wypełnianie i wysyłanie należy zautomatyzować.
//
//Wypełnij dane w formularzu:
//
//First name: Karol
//Last name: Kowalski
//Gender: Male
//Date of birth: 05/22/2010
//Address: Prosta 51
//
//Email: karol.kowalski@mailinator.com
//Password: Pass123
//Company: Coders Lab
//Comment: To jest mój pierwszy automat testowy
//
//Zatwierdź formularz - SUBMIT