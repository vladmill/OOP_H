package homework06.calcFirst;
import java.util.Scanner;

/**
 *  CalcView реализован для работы в консоли, как вариант наш интерфейс может выводиться на экран.
 *  Судя по всему эта реализация нарушает принцип инверсии зависимостей.
 *  Надо сделалть интерфейс View и в презентор передавать его, а CalcView будет одной из реализаций.
 */
public class CalcView {
    private Scanner scanner;
    boolean isDivide = false;

    public CalcView() {
        this.scanner = new Scanner(System.in);
    }

    public double getInputNum() {
        System.out.print("Введите число: ");
        if (scanner.hasNextDouble()) {
            double num = scanner.nextDouble();
            if(isDivide && num == 0.0){
                System.out.println("Делить на ноль нельзя. Попробуйте еще раз.");
                return getInputNum();
            }
            return num;
        } else {
            System.out.println("Вы допустили ошибку. Попробуйте еще раз.");
            scanner.next();
            return getInputNum();
        }
    }

    public char getInputOper() {
        String operators = "+-*/";
        System.out.print("Введите оператор (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        if (operators.indexOf(operator) >= 0) {
            if (operators.indexOf(operator) == 3){
                isDivide = true;
            }
            return operator;
        } else {
            System.out.println("Вы допустили ошибку. Попробуйте еще раз.");
            return getInputOper();
        }
    }

    public void showResult(double result) {
        System.out.printf("Результат: %.2f", result);
    }
}
