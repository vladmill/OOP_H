package homework07.model;

import java.io.IOException;

public interface Component {
    void setResult(double number);
    double add(double number) throws IOException;
    double subtract(double number) throws IOException;
    double multiply(double number) throws IOException;
    double divide(double number) throws IOException;
    double getResult();
}
