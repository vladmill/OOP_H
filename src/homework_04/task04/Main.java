package homework_04.task04;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DataContainer<String> container = new DataContainer<>(new ArrayList<String>(Arrays.asList("строка", "ещё строка", "и ещё строка")));
        container.addElem("Привет!");
        container.addElem("Пока!");
        System.out.println("--------------------------------");
        container.printElements();
        System.out.println("--------------------------------");
        container.sortElements((String a, String b) -> b.compareTo(a));
        container.printElements();

    }
}
