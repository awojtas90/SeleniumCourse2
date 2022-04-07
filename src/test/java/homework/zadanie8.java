package homework;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.Random;

public class zadanie8 {


    public static void main(String[] args) {

        Tablice tablice = new Tablice();
        //przypisanie lokatorów zmiennym
        String clothes = "//*[@id=\"category-3\"]/a";
        String filter = "//*[contains(text(),'\n" +
                "                          Men\n" +
                "                                                      ')]";
        String product1 = "//*[@id=\"js-product-list\"]/div[1]/article/div/div[1]/h2/a";
        String size1 = "//*[@id=\"group_1\"]/option[3]";
        String color1 = "//*[@id=\"group_2\"]/li[1]/label/input";
        String quantity1 = "//*[@id=\"quantity_wanted\"]";
        String addButton = "//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button";
        String confirm = "//*[contains(text(),'Proceed to checkout')]";
//        String continuing = "//*[contains(text(),'Continue shopping\n" +
//                "          ')]";
        String accessories = "//*[@id=\"category-6\"]/a";
        String product2 = "//*[@id=\"js-product-list\"]/div[1]/article[5]/div/div[1]/h2/a";
        String quantity2 = "//*[@id=\"quantity_wanted\"]";
        String addButton2 = ".btn.btn-primary.add-to-cart";
        String confirm2 = "//*[contains(text(),'Proceed to checkout')]";
        String order = ".btn.btn-primary";

        String signButton = "//*[@id=\"_desktop_user_info\"]/div/a/span";
        String createAccountButton = "//*[@id=\"content\"]/div";
        String genderMr = "//*[@id=\"customer-form\"]/section/div[1]/div[1]/label[1]/span/input";
//        String genderMrs ="//*[@id=\"customer-form\"]/section/div[1]/div[1]/label[2]/span/input";
        String firstName = ".form-control";
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



        Random random = new Random();
//        //losowanie imienia
//        for (int i = 0; i < tablice.getName().length - 1; i++) {
//            i = tablice.getName().length;
//            WebElement firstNameInputBox = driver.findElement(By.cssSelector(firstName));
//            firstNameInputBox.sendKeys(tablice.getName()[random.nextInt(i)]);
//            //losowanie nazwiska
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
//                        if  (alert == "The email is already used, please choose another one or sign in.");{
//                            for (int kkk = 0; k < tablice.getEmails().length - 1; kkk++) {
//                                kkk = tablice.getEmails().length;
//                                for(int kkkk=0;kkkk < tablice.getNumber().length -1;kkkk++){
//                                    kkkk = tablice.getEmails().length;
//                                    WebElement emailInputBox2 = driver.findElement(By.name(email));
//                                    emailInputBox2.sendKeys(tablice.getEmails()[random.nextInt(kkk)] + tablice.getNumber()[random.nextInt(kkkk)]);}}}
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
//                                            WebElement clothesInputBox = driver.findElement(By.xpath(clothes));
//                                            clothesInputBox.click();
//                                            WebElement filterInputBox = driver.findElement(By.xpath(filter));
//                                            filterInputBox.click();
//                                            WebElement product1InputBox = driver.findElement(By.xpath(product1));
//                                            product1InputBox.click();
//                                            WebElement size1InputBox = driver.findElement(By.xpath(size1));
//                                            size1InputBox.click();
//                                            WebElement color1InputBox = driver.findElement(By.xpath(color1));
//                                            color1InputBox.click();
//                                            WebElement quantity1InputBox = driver.findElement(By.xpath(quantity1));
//                                            quantity1InputBox.clear();
//                                            //Dlaczego wartość nie zawsze się usuwa?
//                                            WebElement quantity1InputBox2 = driver.findElement(By.xpath(quantity1));
//                                            quantity1InputBox2.sendKeys("4");
//                                            WebElement addButtonInputBox = driver.findElement(By.xpath(addButton));
//                                            addButtonInputBox.click();
//
//
//                                            WebDriverWait wait = new WebDriverWait(driver, 10);
//                                            WebElement confirmInputBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(confirm)));
//                                            confirmInputBox.click();
//
//                                            WebElement accessoriesInputBox = driver.findElement(By.xpath(accessories));
//                                            accessoriesInputBox.click();
//
//                                            WebElement product2InputBox = driver.findElement(By.xpath(product2));
//                                            product2InputBox.click();
//                                            WebElement quantity2InputBox = driver.findElement(By.xpath(quantity2));
//                                            quantity2InputBox.clear();
//                                            WebElement quantity2InputBox2 = driver.findElement(By.xpath(quantity2));
//                                            quantity2InputBox2.sendKeys("7");
//                                            WebElement addButton2InputBox = driver.findElement(By.cssSelector(addButton2));
//                                            addButton2InputBox.click();
//
//                                            WebDriverWait wait2 = new WebDriverWait(driver, 10);
//                                            WebElement confirm2InputBox2 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(confirm2)));
//                                            confirm2InputBox2.click();
//
//                                            WebElement orderInputBox = driver.findElement(By.cssSelector(order));
//                                            orderInputBox.click();
//                                        }
//
////        WebElement continuingInputBox = driver.findElement(By.xpath(continuing));
////        continuingInputBox.click();
//
////
////        WebElement continuingInputBox = driver.findElement(By.cssSelector(continuing));
////        continuingInputBox.click();
//                                    }}}}}}}}}
//
//
//    public static void copyFile(File scrFile, File file) {
    }
}
//        WebElement filterProductsInputBox = driver.findElement(By.xpath(filterProducts));
//        filterProductsInputBox.click();
//}
