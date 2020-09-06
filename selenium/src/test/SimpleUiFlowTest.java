package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.Driver;

public class SimpleUiFlowTest {

    public static void main(String[] args) {
        System.out.println("Start the Selenium Chrome driver");
        WebDriver driver = Driver.startChromeDriver();

        //driver.navigate().to("http://qatools.ro/");

        driver.get("http://qatools.ro/");

        System.out.println("Current url: " + driver.getCurrentUrl());
        System.out.println("Page tile: " + driver.getTitle());
        //System.out.println("Page source: " + driver.getPageSource());

        WebElement calculateAppLink = driver.findElement(By.cssSelector("a[href=\"calculate/appApi.html\"]"));

        System.out.println("Link text: " + calculateAppLink.getText());
        calculateAppLink.click();

        System.out.println("Current url: " + driver.getCurrentUrl());
        System.out.println("Page tile: " + driver.getTitle());
        //System.out.println("Page source: " + driver.getPageSource());

        driver.quit();
    }
}
