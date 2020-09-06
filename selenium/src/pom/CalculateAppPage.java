package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static java.lang.Integer.parseInt;
import static selenium.Driver.sleep;

public class CalculateAppPage {

    private WebDriver driver;

    public CalculateAppPage(WebDriver driver) {
        this.driver = driver;
    }

    // web elements locators (web page components)
    private By number1Input = By.id("nr1");
    private By number2Input = By.id("nr2");
    //private By operationSelect = By.className("operation-selector");
    private By calculateButton = By.tagName("button");
    private By resultWebElement = By.cssSelector("[data-qa-test=\"result\"]");

    // page actions
    public void sendKeysToNumber1Input(String keys) {
        driver.findElement(number1Input).sendKeys(keys);
    }

    public void sendKeysToNumber2Input(String keys) {
        driver.findElement(number2Input).sendKeys(keys);
    }

    public void setOperationValue(int operationValue) {
        ((JavascriptExecutor) driver).executeScript("document.querySelector(\".operation-selector\").value = " + operationValue);
    }

    public void calculate() {
        driver.findElement(calculateButton).click();
        sleep(2000);
    }

    public int getResult() {
        String resultText = driver.findElement(resultWebElement).getText();
        return parseInt(resultText);
    }
}
