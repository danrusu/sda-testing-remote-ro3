package test;

public class TestData {
    private String nr1;
    private String nr2;
    private int operationValue;
    private int expectedResult;

    public TestData(String nr1, String nr2, int operationValue, int expectedResult) {
        this.nr1 = nr1;
        this.nr2 = nr2;
        this.operationValue = operationValue;
        this.expectedResult = expectedResult;
    }

    public String getNr1() {
        return nr1;
    }

    public String getNr2() {
        return nr2;
    }

    public int getOperationValue() {
        return operationValue;
    }

    public int getExpectedResult() {
        return expectedResult;
    }
}
