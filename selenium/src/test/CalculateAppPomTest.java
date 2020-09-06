package test;

import org.openqa.selenium.WebDriver;
import pom.CalculateAppPage;

import static selenium.Driver.startChromeDriver;

public class CalculateAppPomTest {


    public static void main(String[] args) {

        TestData sumTestData = new TestData("5", "7", 1, 12);
        TestData multiplicationTestData = new TestData("5", "7", 2, 35);
        TestData divisionTestData = new TestData("5", "5", 3, 1);

        test(sumTestData);
        test(multiplicationTestData);
        test(divisionTestData);
    }

    private static void test(TestData testData) {
        WebDriver driver = startChromeDriver();
        try {
            driver.get("http://qatools.ro/calculate/appApi.html");

            CalculateAppPage calculateAppPage = new CalculateAppPage(driver);

            driver.navigate().refresh();

            calculateAppPage.sendKeysToNumber1Input(testData.getNr1());
            calculateAppPage.sendKeysToNumber2Input(testData.getNr2());

            calculateAppPage.setOperationValue(testData.getOperationValue());

            calculateAppPage.calculate();

            int result = calculateAppPage.getResult();

            validateEquals(result, testData.getExpectedResult());
        }
        catch (Throwable throwable){
            throwable.printStackTrace();
        }
        finally {
            driver.quit();
        }
    }

    private static void validateEquals(int actual, int expected) {
        if (actual == expected){  // this will compare strings content
            System.out.println("Validation succeeded");
        }
        else {
            System.out.println("Validation failed: expected=\"" + expected + "\" actual=\"" + actual + "\"");
        }
    }
}
