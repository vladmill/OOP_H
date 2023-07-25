package homework07.view.operators;

import homework07.view.ConsoleView;

import java.io.IOException;

public class Add extends Operator {
    public Add(ConsoleView console) {
        super(console);
        super.setDescription("прибавить (+)");
    }

    @Override
    public void execute(double num) throws IOException {
        super.getConsole().viewAdd(num);
    }

    @Override
    public void check() {
        // TODO method
    }


}
