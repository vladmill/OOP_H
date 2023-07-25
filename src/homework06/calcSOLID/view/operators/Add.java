package homework06.calcSOLID.view.operators;

import homework06.calcSOLID.view.ConsoleView;

public class Add extends Operator {
    public Add(ConsoleView console) {
        super(console);
        super.setDescription("прибавить (+)");
    }

    @Override
    public void execute(double num) {
        super.getConsole().viewAdd(num);
    }

    @Override
    public void check() {
        // TODO Auto-generated method stub
    }


}
