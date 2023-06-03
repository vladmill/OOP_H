package homework01.task01;

public class Cat {
    private String name;
    private int age;
    private Owner owner;

    public Cat(String name, int age, Owner owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public Cat(String name, int age, String ownerName) {
        this.name = name;
        this.age = age;
        this.owner = new Owner(ownerName);
    }

    public Cat(String name, int age) {
        this(name, age, (Owner) null);
    }

    public void greet() {
        System.out.printf("ћ€у! ћен€ зовут %s. ћне %d года(лет). ћой владелец - %s.%n",
                name,
                age,
                owner != null ? owner.getName() : "еще не нашел мен€");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
