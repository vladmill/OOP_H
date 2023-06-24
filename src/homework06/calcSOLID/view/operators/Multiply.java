package homework06.calcSOLID.view.operators;

import homework06.calcSOLID.view.ConsoleView;

public class Multiply extends Operator{
    public Multiply(ConsoleView console) {
        super(console);
        super.setDescription("умножить (*)");
    }

    @Override
    public void execute(double num) {
        super.getConsole().viewMultiply(num);
    }

    @Override
    public void check() {
        // TODO Auto-generated method stub
    }
}
