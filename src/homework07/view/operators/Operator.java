package homework07.view.operators;

import homework07.view.ConsoleView;

import java.io.IOException;

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

    public abstract void execute(double num) throws IOException;
    public abstract void check();
}
