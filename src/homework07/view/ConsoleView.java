package homework07.view;

import homework07.presenter.Presenter;
import homework07.view.operators.Operator;

import java.io.IOException;
import java.util.Scanner;

public class ConsoleView implements View {
    private Presenter presenter;
    private Scanner scanner;
    private SelectOper selector;

    private boolean isDivide;
    private SelectOper select;
    private int numChoice;
    private boolean work;

    public ConsoleView() {
        this.scanner = new Scanner(System.in);
        this.select = new SelectOper(this);
        this.work = true;
        this.isDivide = false;
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void start() throws IOException {
        setFirstNum(inputNum());
        inputOperator();
    }

    private boolean checkInt(String text) {
        return text.matches("[0-9]+");
    }

    public void setFirstNum(double num) {
        presenter.setFirstNum(num);
    }

    public void inputOperator() throws IOException {
        while (work) {
            select.printSelect();
            String input = scanner.next();
            if (checkInt(input)) {
                int numChoice = Integer.parseInt(input);
                if (numChoice < 1 || numChoice > select.getOperators().size()) {
                    System.out.println("Введена некорректная команда. Попробуйте еще раз.\n");
                } else {
                    work = false;
                    select.check(numChoice);
                    select.execute(numChoice, inputNum());
                    showResult();
                }
            } else {
                System.out.println("Введена некорректная команда. Попробуйте еще раз.\n");
            }
        }
    }

    public double inputNum() {
        System.out.print("Введите число: ");
        if (scanner.hasNextDouble()) {
            double num = scanner.nextDouble();
            if (isDivide && num == 0.0) {
                System.out.println("Делить на ноль нельзя. Попробуйте еще раз.");
                return inputNum();
            }
            return num;
        } else {
            System.out.println("Вы допустили ошибку. Попробуйте еще раз.");
            scanner.next();
            return inputNum();
        }
    }

    public void viewAdd(double num) throws IOException {
        presenter.presAdd(num);
    }

    public void viewSubtract(double num) throws IOException {
        presenter.presSubtract(num);
    }

    public void viewMultiply(double num) throws IOException {
        presenter.presMultiply(num);
    }

    public void viewDivide(double num) throws IOException {
        presenter.presDivide(num);
    }

    public void showResult() {
        System.out.printf("Результат: %.1f%n", presenter.getResult());
    }

    public void setDivide(boolean divide) {
        isDivide = divide;
    }
}
