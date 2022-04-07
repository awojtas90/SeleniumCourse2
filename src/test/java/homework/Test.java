package homework;


    import java.io.File;
    import java.io.IOException;

    import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;


public  class Test {
    public static void main(String[] args) {


    System.setProperty("webdriver.chrome.driver",
           "src/main/resources/drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://www.google.com/");
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

// driver is your WebDriver
            File screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.FILE);
            String fileName;
        try {
            FileUtils.copyFile(screenshot, new File("Pulpit.screenshot2.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }}
