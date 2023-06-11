package homework03;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        Owner owner01 = new Owner("Мария");

        service.addPet(new Cat("Пират", 5));
        service.addPet(new Cat("Барсик", 1, "Фёдор"));
        service.addPet(new Cat("Мурка", 3, owner01));

        ICommandVoice commandCat01 = (v, x) -> {
            StringBuilder sb = new StringBuilder();
            sb.append((v + " ").repeat(x));
            return sb.toString();
        };

        Cat cat = (Cat) service.getPetByName("Барсик");
        System.out.println(commandCat01.voice(cat.getVoice(), 3));

        for (Pet pet: service.getPets()) {
            pet.greet();
        }

        System.out.println("Сортировка по имени:");
        service.sortPet(new ComparatorByName());

        for (Pet pet: service.getPets()) {
            pet.greet();
        }
    }
}