package homework03;

public class Cat extends Pet implements ISpeaking {

    public Cat(String name, int age, Owner owner) {
        super(name, age, owner);
    }

    public Cat(String name, int age, String ownerName) {
        super(name, age, new Owner(ownerName));
    }

    public Cat(String name, int age) {
        super(name, age);
    }


    public void greet() {
        System.out.printf("»м€: %s, ¬озраст: %s, ’оз€ин: %s%n",
                this.getName(),
                this.getAge(),
                this.getOwner() != null ? this.getOwner().getName() : "еще не нашел мен€");
    }

    @Override
    public boolean isSpeaking() {
        return true;
    }

    @Override
    public String getVoice() {
        return "ћ€у!";
    }


}
