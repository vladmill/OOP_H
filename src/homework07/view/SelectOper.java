package homework07.view;

import homework07.view.operators.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SelectOper {
    private ConsoleView console;
    private List<Operator> operators;

    public SelectOper(ConsoleView console) {
        this.console = console;
        operators = new ArrayList<>();
        operators.add(new Add(console));
        operators.add(new Subtract(console));
        operators.add(new Multiply(console));
        operators.add(new Divide(console));
    }
    public void check(int numChoice) {
        operators.get(numChoice - 1).check();
    }
    public void execute(int numChoice, double num) throws IOException {
        operators.get(numChoice - 1).execute(num);
    }

    public void printSelect() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < operators.size(); i++) {
            sb.append(String.format("%d. %s%n", i + 1, operators.get(i).getDescription()));
        }
        sb.append("¬ведите номер команды: ");
        System.out.print(sb);
    }

    public List<Operator> getOperators() {
        return operators;
    }
}
