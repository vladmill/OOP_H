package homework_04.task02;


public class Main {
    public static void main(String[] args) {
        MyType type = new MyType();
        Integer[] numbers = {1, 2, 4, 8, 12, 13, 17, 27};
        String[] strings = {"������01", "������02", "������03", "������04", "������05"};

        type.printArray(numbers);
        type.printArray(strings);
    }
}
