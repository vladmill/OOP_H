package homework06.calcSOLID.presenter;

import homework06.calcSOLID.model.Model;
import homework06.calcSOLID.view.View;

public class Presenter {
    View view;
    Model model;

    public Presenter(View view, Model model) {
        this.view = view;
        this.model = model;
        view.setPresenter(this);
    }

    public void setFirstNum(double num) {
        model.setResult(num);
    }
    public void presAdd(double num) {
        model.add(num);
    }
    public void presSubtract(double num){
        model.subtract(num);
    }
    public void presMultiply(double num){
        model.multiply(num);
    }
    public void presDivide(double num){
        model.divide(num);
    }

    public double getResult(){
        return model.getResult();
    }

}
