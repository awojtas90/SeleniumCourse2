package taskCheckConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadanie2 {
    public static void main(String[] args) {

//        String hotelInputLocator = "hotel.location";
        String searchNowButtonLocator = "search.room.submit";
        String emailInputLocator = "email";
        String subscribeButtonLocator = "submitNewsletter";
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");
        WebDriver drivers = new ChromeDriver();
        drivers.manage().window().maximize();
        drivers.get("https://qloapps.coderslab.pl/en/");
//        WebDriverWait wait = new WebDriverWait(14);
        //WebElement email;
//        email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
//        WebElement hotelLocationInput = drivers.findElement(By.cssSelector(hotelInputLocator));
        WebElement searchNowButton = drivers.findElement(By.cssSelector(searchNowButtonLocator));
        WebElement emailInput = drivers.findElement(By.cssSelector(emailInputLocator));
        WebElement subscribeButtonElement = drivers.findElement(By.cssSelector("submitNewsletter"));
//        hotelLocationInput.sendKeys("Warsaw");
        emailInput.sendKeys("test@test.com");
        subscribeButtonElement.click();
    }}