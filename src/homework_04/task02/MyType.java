package homework_04.task02;

public class MyType {
    <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }
}
