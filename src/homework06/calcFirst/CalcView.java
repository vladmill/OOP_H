package homework06.calcFirst;
import java.util.Scanner;

/**
 *  CalcView ���������� ��� ������ � �������, ��� ������� ��� ��������� ����� ���������� �� �����.
 *  ���� �� ����� ��� ���������� �������� ������� �������� ������������.
 *  ���� �������� ��������� View � � ��������� ���������� ���, � CalcView ����� ����� �� ����������.
 */
public class CalcView {
    private Scanner scanner;
    boolean isDivide = false;

    public CalcView() {
        this.scanner = new Scanner(System.in);
    }

    public double getInputNum() {
        System.out.print("������� �����: ");
        if (scanner.hasNextDouble()) {
            double num = scanner.nextDouble();
            if(isDivide && num == 0.0){
                System.out.println("������ �� ���� ������. ���������� ��� ���.");
                return getInputNum();
            }
            return num;
        } else {
            System.out.println("�� ��������� ������. ���������� ��� ���.");
            scanner.next();
            return getInputNum();
        }
    }

    public char getInputOper() {
        String operators = "+-*/";
        System.out.print("������� �������� (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        if (operators.indexOf(operator) >= 0) {
            if (operators.indexOf(operator) == 3){
                isDivide = true;
            }
            return operator;
        } else {
            System.out.println("�� ��������� ������. ���������� ��� ���.");
            return getInputOper();
        }
    }

    public void showResult(double result) {
        System.out.printf("���������: %.2f", result);
    }
}
