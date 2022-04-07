package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zadanie4 {
    public static void main(String[] args) {
   String socialTitle = "//*[@id=\"customer-form\"]/section/div[1]/label";
   String firstName = "//*[@id=\"customer-form\"]/section/div[2]/div[1]/input";
   String lastName = "//*[@id=\"customer-form\"]/section/div[3]/div[1]/input";
   String email ="//*[@id=\"customer-form\"]/section/div[4]/div[1]/input";
   String password = "//*[@id=\"customer-form\"]/section/div[5]/div[1]/div/input";
   String show = "//*[@id=\"customer-form\"]/section/div[5]/div[1]/div/span/button";
   String birthdate = "//*[@id=\"customer-form\"]/section/div[6]/div[1]/input";

    System.setProperty("webdriver.chrome.driver",
            "src/main/resources/drivers/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication&create_account=1");

        WebElement socialTitleInputBox = driver.findElement(By.xpath(socialTitle));
        socialTitleInputBox.click();
        //?Jak zrobić, żebv zaznaczyło dany element?
        WebElement firstNameInputBox = driver.findElement(By.xpath(firstName));
        firstNameInputBox.click();
        WebElement lastNameInputBox = driver.findElement(By.xpath(lastName));
        lastNameInputBox.click();
        WebElement emailInputBox = driver.findElement(By.xpath(email));
        emailInputBox.click();
        WebElement passwordInputBox = driver.findElement(By.xpath(password));
        passwordInputBox.click();
        WebElement showInputBox = driver.findElement(By.xpath(show));
        showInputBox.click();
        WebElement birthDayInputBox = driver.findElement(By.xpath(birthdate));
        birthDayInputBox.click();
}}

//Na portalu sklepu internetowego https://prod-kurs.coderslab.pl/index.php?controller=authentication&create_account=1 wyszukaj następujące elementy:
//
//social title
//First name
//Last name
//Email
//Password
//Show
//Birthdate