package homework07.view.operators;

import homework07.view.ConsoleView;

import java.io.IOException;

public class Multiply extends Operator{
    public Multiply(ConsoleView console) {
        super(console);
        super.setDescription("умножить (*)");
    }

    @Override
    public void execute(double num) throws IOException {
        super.getConsole().viewMultiply(num);
    }

    @Override
    public void check() {
        // TODO method
    }
}
