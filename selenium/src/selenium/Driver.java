package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Driver {

    public static Path getChromeDriverPath(){
        return Paths.get(
                System.getProperty("user.dir"),
                "webDrivers",
                "chromedriver.exe");
    }

    public static WebDriver startChromeDriver(){
        System.setProperty("webdriver.chrome.driver", getChromeDriverPath().toFile().toString());

        ChromeOptions options = new ChromeOptions();
        options.addArguments(Arrays.asList("--start-maximized"));

        return new ChromeDriver(options);
    }

    public static void sleep(long millies) {
        try {
            Thread.sleep(millies);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
