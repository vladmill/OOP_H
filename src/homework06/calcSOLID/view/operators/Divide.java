package homework06.calcSOLID.view.operators;

import homework06.calcSOLID.view.ConsoleView;

public class Divide extends Operator {

    public Divide(ConsoleView console) {
        super(console);
        super.setDescription("разделить (/)");
    }

    @Override
    public void execute(double num) {
        super.getConsole().viewDivide(num);
    }

    @Override
    public void check() {
        super.getConsole().setDivide(true);
    }
}
