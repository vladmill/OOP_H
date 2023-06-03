package homework01.task01;

public class Main {
    public static void main(String[] args) {
        Owner owner01 = new Owner("Мария");
        Cat cat01 = new Cat("Пират", 5);
        Cat cat02 = new Cat("Барсик", 1, "Фёдор");
        Cat cat03 = new Cat("Мурка", 3, owner01);

        cat01.greet();
        System.out.println("--------------------------------");
        cat02.greet();
        System.out.println("--------------------------------");
        cat03.greet();
    }
}