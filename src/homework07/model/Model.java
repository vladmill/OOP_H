package homework07.model;

public class Model implements Component {
    private double result;

    public void setResult(double result) {
        this.result = result;
    }

    public double add(double number) {
        result += number;
        return result;
    }

    public double subtract(double number) {
        result -= number;
        return result;
    }

    public double multiply(double number) {
        result *= number;
        return result;
    }

    public double divide(double number) {
        result /= number;
        return result;
    }

    public double getResult() {
        return result;
    }

}
