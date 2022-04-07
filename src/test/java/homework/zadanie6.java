package homework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Random;

import static java.util.UUID.randomUUID;

public class zadanie6 {
    public static void main(String[] args) {
//pobieranie danych z tablic
        Tablice tablice = new Tablice();
//przypisanie lokatorów zmiennym
        String signButton = "//*[@id=\"_desktop_user_info\"]/div/a/span";
        String createAccountButton = "//*[@id=\"content\"]/div";
        String genderMr = "//*[@id=\"customer-form\"]/section/div[1]/div[1]/label[1]/span/input";
//        String genderMrs ="//*[@id=\"customer-form\"]/section/div[1]/div[1]/label[2]/span/input";

        String lastName = "//*[@id=\"customer-form\"]/section/div[3]/div[1]/input";
        String email = "email";
        String password = "password";
        String birthday = "//*[@id=\"customer-form\"]/section/div[6]/div[1]/input";
        String submitButton = "//*[@id=\"customer-form\"]/footer/button";
        String accountButton = "//*[@id=\"_desktop_user_info\"]/div/a[2]";
        String address = "//*[@id=\"address-link\"]/span";
        String alert = "//*[@id=\"customer-form\"]/section/div[4]/div[1]/div/ul/li";
        String addressStreet = "//*[@id=\"content\"]/div/div/form/section/div[6]/div[1]/input";
        String postcode = "//*[@id=\"content\"]/div/div/form/section/div[8]/div[1]/input";
        String city = "//*[@id=\"content\"]/div/div/form/section/div[9]/div[1]/input";
        String saveButton = "//*[@id=\"content\"]/div/div/form/footer/button";
        String option = "//*[@id=\"content\"]/div/div/form/section/div[10]/div[1]/select";
//łączenie z przeglądarką
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php");
//pobieranie danych z przeglądarki
        WebElement signButtonInputBox = driver.findElement(By.xpath(signButton));
        signButtonInputBox.click();
        WebElement createAccountButtonInputBox = driver.findElement(By.xpath(createAccountButton));
        createAccountButtonInputBox.click();
        WebElement genderMrButtonInputBox = driver.findElement(By.xpath(genderMr));
        genderMrButtonInputBox.click();
//wybieranie losowych wartości
//        Random random = new Random();
        //losowanie imienia
        driver.findElement(By.name("firstname")).sendKeys(tablice.getName());
        driver.findElement(By.name("lastname")).sendKeys(tablice.getRandomSurname());
        driver.findElement(By.name("email")).sendKeys(tablice.getRandomEmail());
        driver.findElement(By.name("password")).sendKeys(tablice.getRandomPasswords());


//        WebElement firstName = driver.findElement(By.cssSelector(".form-control"));
//
//        firstName.sendKeys((tablice.getName()[random.nextInt()]));

//        for (int i = 0; i < tablice.getName().length - 1; i++) {
//            i = tablice.getName().length;
//            WebElement firstNameInputBox = driver.findElement(By.cssSelector(firstName));
//            firstNameInputBox.sendKeys(tablice.getName()[random.nextInt(i)]);
        //losowanie nazwiska
//            for (int j = 0; j < tablice.getSurname().length - 1; j++) {
//                j = tablice.getSurname().length;
//                WebElement lastNameInputBox = driver.findElement(By.xpath(lastName));
//                lastNameInputBox.sendKeys(tablice.getSurname()[random.nextInt(j)]);
//                //losowanie adresu email z uwzględnieniem alertu
//                for (int k = 0; k < tablice.getEmails().length - 1; k++) {
//                    k = tablice.getEmails().length;
//                    for(int kk=0;kk < tablice.getNumber().length -1;kk++){
//                        kk = tablice.getEmails().length;
//                        WebElement emailInputBox = driver.findElement(By.name(email));
//                        emailInputBox.sendKeys(tablice.getEmails()[random.nextInt(k)] + tablice.getNumber()[random.nextInt(kk)]);
//                  if  (alert == "The email is already used, please choose another one or sign in.");{
//                        for (int kkk = 0; k < tablice.getEmails().length - 1; kkk++) {
//                            kkk = tablice.getEmails().length;
//                            for(int kkkk=0;kkkk < tablice.getNumber().length -1;kkkk++){
//                                kkkk = tablice.getEmails().length;
//                                WebElement emailInputBox2 = driver.findElement(By.name(email));
//                                emailInputBox2.sendKeys(tablice.getEmails()[random.nextInt(kkk)] + tablice.getNumber()[random.nextInt(kkkk)]);}}}
//                        //losowanie hasła
//                        for (int l = 0; l < tablice.getPasswords().length - 1; l++) {
//                            l = tablice.getPasswords().length;
//                            WebElement passwordInputBox = driver.findElement(By.name(password));
//                            passwordInputBox.sendKeys(tablice.getPasswords()[random.nextInt(l)]);
//                            //losowanie dnia urodzin
//                            for (int m = 0; m < tablice.getBirthdays().length - 1; m++) {
//                                m = tablice.getBirthdays().length;
//                                WebElement birthdayInputBox = driver.findElement(By.xpath(birthday));
//                                birthdayInputBox.sendKeys(tablice.getBirthdays()[random.nextInt(m)]);
//                                //zatwierdzenie i zapisanie danych
//                                WebElement submitButtonInputBox = driver.findElement(By.xpath(submitButton));
//                                submitButtonInputBox.click();
//                                //wybranie wcześniej założonego konta
//                                WebElement accountButtonInputBox = driver.findElement(By.xpath(accountButton));
//                                accountButtonInputBox.click();
//                                //losowanie adresu/ulicy
//                                WebElement addressInputBox = driver.findElement(By.xpath(address));
//                                addressInputBox.click();
//                                for (int n = 0; n < tablice.getAddresses().length - 1; n++) {
//                                    n = tablice.getAddresses().length;
//                                    WebElement addressStreetInputBox = driver.findElement(By.xpath(addressStreet));
//                                    addressStreetInputBox.sendKeys(tablice.getAddresses()[random.nextInt(n)]);
//                                    //losowanie kodu pocztowego
//                                    for (int o = 0; o < tablice.getPostcodes().length - 1; n++) {
//                                        o = tablice.getPostcodes().length;
//                                        WebElement postcodesInputBox = driver.findElement(By.xpath(postcode));
//                                        postcodesInputBox.sendKeys(tablice.getPostcodes()[random.nextInt(o)]);
//                                        //losowanie miejscowości
//                                        for (int p = 0; p < tablice.getCities().length - 1; p++) {
//                                            p = tablice.getCities().length;
//                                            WebElement cityInputBox = driver.findElement(By.xpath(city));
//                                            cityInputBox.sendKeys(tablice.getCities()[random.nextInt(p)]);
//                                            WebElement optionInputBox = driver.findElement(By.xpath(option));
//                                            optionInputBox.sendKeys("United Kingdom");
//                                            //zapisanie danych
//                                            WebElement saveButtonInputBox = driver.findElement(By.xpath(saveButton));
//                                            saveButtonInputBox.click();
//
//                                        }}}}}}}}}}
//


//Ważną funkcjonalnością sklepu jest możliwość zarejestrowania nowego użytkownika. W tym celu przygotuj skrypt, który będzie miał możliwość tworzenie dowolnej liczby użytkowników w sklepie https://prod-kurs.coderslab.pl/index.php .
//
//Po stworzeniu użytkownika uzupełnij również jego dane adresowe (Your Account / Addresses). Postaraj się, aby dane były w jak największym stopniu losowe.
//
//💁‍♂️ Wskazówki:
//
//Skrypt powinien mieć możliwość zdefiniowania dowolnej liczby użytkowników, którą chcemy utworzyć.
//Zwróć uwagę na komunikat: "The email is already used, please choose another one or sign in."
//Stwórz kilka tablic, które będą zawierały poszczególne dane wymagane do wypełnienia adresu, a następnie dla każdego z użytkowników losuj dowolny element z danej tablicy.
//Wykorzystaj losowanie liczb i dodawaj losowe liczby do adresów e-mail.

    }}