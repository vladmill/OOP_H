package homework06.calcSOLID.model;

public class Model {
    private double result;

    public void setResult(double result) {
        this.result = result;
    }

    public void add(double number) {
        result += number;
    }

    public void subtract(double number) {
        result -= number;
    }

    public void multiply(double number) {
        result *= number;
    }

    public void divide(double number) {
        result /= number;
    }

    public double getResult() {
        return result;
    }


}
