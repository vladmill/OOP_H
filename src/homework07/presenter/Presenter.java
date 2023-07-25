package homework07.presenter;

import homework07.model.Component;
import homework07.model.Model;
import homework07.view.View;

import java.io.IOException;

public class Presenter {
    View view;
    Component model;

    public Presenter(View view, Component model) {
        this.view = view;
        this.model = model;
        view.setPresenter(this);
    }

    public void setFirstNum(double num) {
        model.setResult(num);
    }
    public void presAdd(double num) throws IOException {
        model.add(num);
    }
    public void presSubtract(double num) throws IOException {
        model.subtract(num);
    }
    public void presMultiply(double num) throws IOException {
        model.multiply(num);
    }
    public void presDivide(double num) throws IOException {
        model.divide(num);
    }

    public double getResult(){
        return model.getResult();
    }

}
