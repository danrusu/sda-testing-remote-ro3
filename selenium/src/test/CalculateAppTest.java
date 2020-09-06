package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.Driver;

public class CalculateAppTest {


    public static void main(String[] args) {

        WebDriver driver = Driver.startChromeDriver();

        driver.get("http://qatools.ro/calculate/appApi.html");

        WebElement number1Input = driver.findElement(By.cssSelector("#nr1")); // document.querySelector("#nr1")
        //WebElement number1Input = driver.findElement(By.xpath("//*[@id=\"nr1\"]"));

        WebElement number2Input = driver.findElement(By.id("nr2"));           // document.getElementById("nr2")

        //WebElement operationSelect = driver.findElement(By.cssSelector(".operation-selector"));
        WebElement operationSelect = driver.findElement(By.className("operation-selector"));

        //WebElement calculateButton = driver.findElement(By.cssSelector("button[name=\"calculate\"]"));
        WebElement calculateButton = driver.findElement(By.tagName("button"));

        //WebElement result = driver.findElement(By.cssSelector("span[data-qa-test=\"result\"]"));
        //WebElement result = driver.findElement(By.cssSelector("*[data-qa-test=\"result\"]"));
        WebElement resultWebElement = driver.findElement(By.cssSelector("[data-qa-test=\"result\"]"));

        // Task verify that 5 * 7 generates a result of 35.

        // send text to number imputs
        number1Input.sendKeys("5");
        number2Input.sendKeys("7");

        // set operation value via JavaScript
        ((JavascriptExecutor)driver).executeScript("document.querySelector(\".operation-selector\").value = 2");

        // click CALCULATE button
        calculateButton.click();

        Driver.sleep(2000);

        // read result value
        String result = resultWebElement.getText();

        int resultAsInt = Integer.parseInt(result);
        validateResult(resultAsInt, 35);

        driver.quit();
    }

    private static void validateResult(String result, int expectedResult) {
        //if (result.equals(expectedResult)){     // this will compare objects not strings
        if (result.equals("" + expectedResult)){  // this will compare strings content
            System.out.println("Validation succeeded");
        }
        else {
            System.out.println("Validation failed: expected=\"" + expectedResult + "\" actual=\"" + result + "\"");
        }
    }

    private static void validateResult(int result, int expectedResult) {
        //if (result.equals(expectedResult)){     // this will compare objects not strings
        if (result == expectedResult){  // this will compare strings content
            System.out.println("Validation succeeded");
        }
        else {
            System.out.println("Validation failed: expected=\"" + expectedResult + "\" actual=\"" + result + "\"");
        }
    }
}
