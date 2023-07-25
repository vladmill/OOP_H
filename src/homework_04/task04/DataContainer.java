package homework_04.task04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {
    ArrayList<T> elements;

    public DataContainer(ArrayList<T> elements) {
        this.elements = elements;
    }

    public DataContainer() {
        this(new ArrayList<T>());
    }

    void addElem(T elem) {
        elements.add(elem);
        System.out.println("Ёлемент добавлен.");
    }

    T getElem(int index) {
        return elements.get(index);
    }

    void sortElements(Comparator<T> comparator) {
        elements.sort(comparator);
    }

    void printElements(){
        for (T elem: elements) {
            System.out.println(elem);
        }
    }
}
