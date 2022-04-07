//package homework;
//
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.io.File;
//import java.io.IOException;
//import java.time.Duration;
//import java.util.Random;
//
//public class homework8 {
//
//
//    public static void main(String[] args) {
//
//        Tablice tablice = new Tablice();
//        //przypisanie lokatorów zmiennym
//        String clothes = "//*[@id=\"category-3\"]/a";
//        String filter = "//*[contains(text(),'\n" +
//                "                          Men\n" +
//                "                                                      ')]";
//        String product1 = "//*[@id=\"js-product-list\"]/div[1]/article/div/div[1]/h2/a";
//        String size1 = "//*[@id=\"group_1\"]/option[3]";
//        String color1 = "//*[@id=\"group_2\"]/li[1]/label/input";
//        String quantity1 = "qty";
//        String addButton = "//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button";
//        String confirm = "//*[contains(text(),'Proceed to checkout')]";
//        String accessories = "//*[@id=\"category-6\"]/a";
//        String product2 = "//*[@id=\"js-product-list\"]/div[1]/article[5]/div/div[1]/h2/a";
//        String quantity2 = "//*[@id=\"quantity_wanted\"]";
//        String addButton2 = ".btn.btn-primary.add-to-cart";
//        String confirm2 = "//*[contains(text(),'Proceed to checkout')]";
//        String order = ".btn.btn-primary";
//        String name = "firstname";
//        String surname = "lastname";
//        String email = "//*[@id=\"customer-form\"]/section/div[4]/div[1]/input";
//        String password = "password";
//        String next = "continue";
//        String address = "//*[@id=\"delivery-address\"]/div/section/div[5]/div[1]/input";
//        String postcode = "//*[@id=\"delivery-address\"]/div/section/div[7]/div[1]/input";
//        String city = "//*[@id=\"delivery-address\"]/div/section/div[8]/div[1]/input";
//        String country = "id_country";
//        String next2 = "confirm-addresses";
//        String pay = "confirmDeliveryOption";
//        String paymentConfirmation = "payment-option";
//        String agree = "//*[@id=\"conditions_to_approve[terms-and-conditions]\"]";
//        String next3 = "//*[@id=\"payment-confirmation\"]/div[1]/button";
//        String gender =  "//*[@id=\"customer-form\"]/section/div[1]/div[1]/label[1]/span/input";
//        String availability = "//*[@id=\"product-availability\"]";
//
//        System.setProperty("webdriver.chrome.driver",
//                "src/main/resources/drivers/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://prod-kurs.coderslab.pl/index.php");
////pobieranie danych z przeglądarki
//
//        WebElement clothesInputBox = driver.findElement(By.xpath(clothes));
//        clothesInputBox.click();
//        WebElement filterInputBox = driver.findElement(By.xpath(filter));
//        filterInputBox.click();
//        WebElement product1InputBox = driver.findElement(By.xpath(product1));
//        product1InputBox.click();
//        WebElement size1InputBox = driver.findElement(By.xpath(size1));
//        size1InputBox.click();
//        WebElement color1InputBox = driver.findElement(By.xpath(color1));
//        color1InputBox.click();
//        WebDriverWait wait4 = new WebDriverWait(driver, 10);
//        WebElement quantity1InputBox = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.name(quantity1)));
//        quantity1InputBox.clear();
//        //Dlaczego wartość nie zawsze się usuwa?
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement quantity1InputBox2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(quantity1)));
//        quantity1InputBox2.sendKeys("4");
//
//        WebElement availabilityInputBox = driver.findElement(By.xpath(availability));
//        availabilityInputBox.isEnabled();
////        if(availabilityInputBox.isEnabled()== "There are not enough products in stock"){
////            System.out.println("Jest za mało towaru");
////        }
//
//        WebElement addButtonInputBox = driver.findElement(By.xpath(addButton));
//        addButtonInputBox.click();
//
//
//        WebDriverWait wait2 = new WebDriverWait(driver, 10);
//        WebElement confirmInputBox = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(confirm)));
//        confirmInputBox.click();
//
//        WebElement accessoriesInputBox = driver.findElement(By.xpath(accessories));
//        accessoriesInputBox.click();
//
//        WebElement product2InputBox = driver.findElement(By.xpath(product2));
//        product2InputBox.click();
//        WebElement quantity2InputBox = driver.findElement(By.xpath(quantity2));
//        quantity2InputBox.clear();
//        WebElement quantity2InputBox2 = driver.findElement(By.xpath(quantity2));
//        quantity2InputBox2.sendKeys("7");
//        WebElement addButton2InputBox = driver.findElement(By.cssSelector(addButton2));
//        addButton2InputBox.click();
//
//        WebDriverWait wait3 = new WebDriverWait(driver, 10);
//        WebElement confirm2InputBox2 = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(confirm2)));
//        confirm2InputBox2.click();
//
//        File screenshot = ((TakesScreenshot) driver)
//                .getScreenshotAs(OutputType.FILE);
//        String fileName0;
//        try {
//            FileUtils.copyFile(screenshot, new File("Pulpit.shopping.products.jpg"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        WebElement orderInputBox = driver.findElement(By.cssSelector(order));
//        orderInputBox.click();
//
//            File screenshot2 = ((TakesScreenshot) driver)
//                    .getScreenshotAs(OutputType.FILE);
//            String fileName;
//            try {
//                FileUtils.copyFile(screenshot2, new File("Pulpit.show.jpg"));
//            } catch (IOException ee) {
//                ee.printStackTrace();
//            }
//                WebElement genderInputBox = driver.findElement(By.xpath(gender));
//                genderInputBox.click();
//
//Random random = new Random();
//        for (int i = 0; i < tablice.getName().length - 1; i++) {
//            i = tablice.getName().length;
//            WebElement firstNameInputBox = driver.findElement(By.name(name));
//            firstNameInputBox.sendKeys(tablice.getName()[random.nextInt(i)]);
//            //losowanie nazwiska
//            for (int j = 0; j < tablice.getSurname().length - 1; j++) {
//                j = tablice.getSurname().length;
//                WebElement lastNameInputBox = driver.findElement(By.name(surname));
//                lastNameInputBox.sendKeys(tablice.getSurname()[random.nextInt(j)]);
//                //losowanie adresu email z uwzględnieniem alertu
//                for (int k = 0; k < tablice.getEmails().length - 1; k++) {
//                    k = tablice.getEmails().length;
//                    for(int kk=0;kk < tablice.getNumber().length -1;kk++){
//                        kk = tablice.getEmails().length;
//                        WebElement emailInputBox = driver.findElement(By.xpath(email));
//                        emailInputBox.sendKeys(tablice.getEmails()[random.nextInt(k)] + tablice.getNumber()[random.nextInt(kk)]);
////                        if  (alert == "The email is already used, please choose another one or sign in.");{
////                            for (int kkk = 0; k < tablice.getEmails().length - 1; kkk++) {
////                                kkk = tablice.getEmails().length;
////                                for(int kkkk=0;kkkk < tablice.getNumber().length -1;kkkk++){
////                                    kkkk = tablice.getEmails().length;
////                                    WebElement emailInputBox2 = driver.findElement(By.name(email));
////                                    emailInputBox2.sendKeys(tablice.getEmails()[random.nextInt(kkk)] + tablice.getNumber()[random.nextInt(kkkk)]);}}}
//                        //losowanie hasła
//                        for (int l = 0; l < tablice.getPasswords().length - 1; l++) {
//                            l = tablice.getPasswords().length;
//                            WebElement passwordInputBox = driver.findElement(By.name(password));
//                            passwordInputBox.sendKeys(tablice.getPasswords()[random.nextInt(l)]);
//                            WebElement nextInputBox = driver.findElement(By.name(next));
//                            nextInputBox.click();
//                            WebElement addressInputBox = driver.findElement(By.xpath(address));
//                            addressInputBox.click();
//                            for (int n = 0; n < tablice.getAddresses().length - 1; n++) {
//                                n = tablice.getAddresses().length;
//                                WebElement addressStreetInputBox = driver.findElement(By.xpath(address));
//                                addressStreetInputBox.sendKeys(tablice.getAddresses()[random.nextInt(n)]);
//                                //losowanie kodu pocztowego
//                                for (int o = 0; o < tablice.getPostcodes().length - 1; n++) {
//                                    o = tablice.getPostcodes().length;
//                                    WebElement postcodesInputBox = driver.findElement(By.xpath(postcode));
//                                    postcodesInputBox.sendKeys(tablice.getPostcodes()[random.nextInt(o)]);
//                                    //losowanie miejscowości
//                                    for (int p = 0; p < tablice.getCities().length - 1; p++) {
//                                        p = tablice.getCities().length;
//                                        WebElement cityInputBox = driver.findElement(By.xpath(city));
//                                        cityInputBox.sendKeys(tablice.getCities()[random.nextInt(p)]);
//                                        WebElement optionInputBox = driver.findElement(By.name(country));
//                                        optionInputBox.sendKeys("United Kingdom");
//                                        WebElement next2InputBox = driver.findElement(By.name(next2));
//                                        next2InputBox.click();
//                                        WebElement payInputBox = driver.findElement(By.name(pay));
//                                        payInputBox.click();
//                                        WebElement paymentConfirmationInputBox = driver.findElement(By.name(paymentConfirmation));
//                                        paymentConfirmationInputBox.click();
//                                        WebElement agreeInputBox = driver.findElement(By.xpath(agree));
//                                        agreeInputBox.click();
//                                        WebElement next3InputBox = driver.findElement(By.xpath(next3));
//                                        next3InputBox.click();
//
//
//                                        File screenshot3 = ((TakesScreenshot) driver)
//                                                .getScreenshotAs(OutputType.FILE);
//                                        String fileName2;
//                                        try {
//                                            FileUtils.copyFile(screenshot3, new File("Pulpit.shopping.jpg"));
//                                        } catch (IOException eee) {
//                                            eee.printStackTrace();
//                                        }
//                                    }}
//
//
//
//                            }}}}}}}}





