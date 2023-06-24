package homework06.calcSOLID;

import homework06.calcSOLID.model.Model;
import homework06.calcSOLID.presenter.Presenter;
import homework06.calcSOLID.view.ConsoleView;
import homework06.calcSOLID.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new ConsoleView();
        Model model = new Model();
        new Presenter(view, model);
        view.start();
    }
}
