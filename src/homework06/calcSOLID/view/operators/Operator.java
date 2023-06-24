package homework06.calcSOLID.view.operators;

import homework06.calcSOLID.view.ConsoleView;

public abstract class Operator {
    private ConsoleView console;
    private String description;

    public Operator(ConsoleView console) {
        this.console = console;
    }

    public ConsoleView getConsole() {
        return console;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract void execute(double num);
    public abstract void check();
}
