package homework07.model;

import java.io.IOException;

abstract class Decorator implements Component {
    Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void setResult(double number) {
        component.setResult(number);
    }

    @Override
    public double add(double number) throws IOException {

        return component.add(number);
    }

    @Override
    public double subtract(double number) throws IOException {

        return component.subtract(number);
    }

    @Override
    public double multiply(double number) throws IOException {

        return component.multiply(number);
    }

    @Override
    public double divide(double number) throws IOException {

        return component.divide(number);
    }

    @Override
    public double getResult() {
        return component.getResult();
    }
}
