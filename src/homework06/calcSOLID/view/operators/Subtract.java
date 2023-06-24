package homework06.calcSOLID.view.operators;

import homework06.calcSOLID.view.ConsoleView;

public class Subtract extends Operator {
    public Subtract(ConsoleView console) {
        super(console);
        super.setDescription("вычесть (-)");
    }

    @Override
    public void execute(double num) {
        super.getConsole().viewSubtract(num);
    }

    @Override
    public void check() {
        // TODO Auto-generated method stub
    }
}
