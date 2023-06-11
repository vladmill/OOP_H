package homework03;

abstract class Pet {
    private String name;
    private int age;
    private Owner owner;

    public Pet(String name, int age, Owner owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public Pet(String name, int age, String ownerName) {
        this.name = name;
        this.age = age;
        this.owner = new Owner(ownerName);
    }

    public Pet(String name, int age) {
        this(name, age, (Owner) null);
    }

    abstract void greet();

    // GS
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
