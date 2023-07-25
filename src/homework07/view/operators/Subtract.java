package homework07.view.operators;

import homework07.view.ConsoleView;

import java.io.IOException;

public class Subtract extends Operator {
    public Subtract(ConsoleView console) {
        super(console);
        super.setDescription("вычесть (-)");
    }

    @Override
    public void execute(double num) throws IOException {
        super.getConsole().viewSubtract(num);
    }

    @Override
    public void check() {
        // TODO method
    }
}
