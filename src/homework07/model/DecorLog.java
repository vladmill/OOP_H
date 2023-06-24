package homework07.model;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class DecorLog extends Decorator {
    double a;
    double b;
    double o;

    public DecorLog(Component component) {
        super(component);
    }

    @Override
    public void setResult(double number) {
        super.setResult(number);
        a = number;
    }

    @Override
    public double add(double number) throws IOException {
        double result = super.add(number);
        writeString(a, "+", number, result);
        return result;
    }

    @Override
    public double subtract(double number) throws IOException {
        double result = super.subtract(number);
        writeString(a, "-", number, result);

        return result;
    }

    @Override
    public double multiply(double number) throws IOException {
        double result = super.multiply(number);
        writeString(a, "*", number, result);
        return result;
    }

    @Override
    public double divide(double number) throws IOException {
        double result = super.divide(number);
        writeString(a, "/", number, result);
        return result;
    }

    void writeString(double a, String o, double b, double r) throws IOException {
        try {
            writeLog(String.format("%.1f %s %.1f = %.1f", a, o, b, r));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void writeLog(String str) throws IOException {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/src/homework07/logCalc.txt");

        Logger logger = Logger.getLogger(Model.class.getName());
        FileHandler logFile = new FileHandler(pathFile, true);
        logger.addHandler(logFile);

        SimpleFormatter sFormat = new SimpleFormatter();
        logFile.setFormatter(sFormat);

        logger.info(str);
    }
}
