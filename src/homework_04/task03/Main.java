package homework_04.task03;

public class Main {
    public static void main(String[] args) {
        MyType type = new MyType();
        System.out.println(type.getMax(1,2));
        System.out.println(type.getMax(11.5,2.4));
        System.out.println(type.getMax("Облако","Яблоко"));
        System.out.println(type.getMax("Облако","Облако"));
    }
}
