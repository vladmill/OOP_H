package homework05;

public class CalcPresenter {
    private CalcView view;
    private CalcModel model;

    public CalcPresenter(CalcView view, CalcModel model) {
        this.view = view;
        this.model = model;
    }

    public void performCalculation() {
        double num1 = view.getInputNum();
        char operator = view.getInputOper();
        double num2 = view.getInputNum();

        model.setResult(num1);

        switch (operator) {
            case '+' -> model.add(num2);
            case '-' -> model.subtract(num2);
            case '*' -> model.multiply(num2);
            case '/' -> model.divide(num2);
        }

        view.showResult(model.getResult());
    }
}
