package homework07;

import homework07.model.Component;
import homework07.model.DecorLog;
import homework07.model.Model;
import homework07.presenter.Presenter;
import homework07.view.ConsoleView;
import homework07.view.View;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        View view = new ConsoleView();
        Component model = new Model();
        Component modelLog = new DecorLog(model);

        new Presenter(view, modelLog);
        view.start();
    }
}
