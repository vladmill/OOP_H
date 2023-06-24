package homework07.view.operators;

import homework07.view.ConsoleView;

import java.io.IOException;

public class Divide extends Operator {

    public Divide(ConsoleView console) {
        super(console);
        super.setDescription("разделить (/)");
    }

    @Override
    public void execute(double num) throws IOException {
        super.getConsole().viewDivide(num);
    }

    @Override
    public void check() {
        super.getConsole().setDivide(true);
    }
}
