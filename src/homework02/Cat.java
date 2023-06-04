package homework02;

public class Cat extends Pet implements IConstants, IPaws, ISpeaking {

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
        System.out.printf("���! ���� ����� %s. ��� %d ����(���). ��� �������� - %s.%n",
                super.getName(),
                super.getAge(),
                super.getOwner() != null ? super.getOwner().getName() : "��� �� ����� ����");
    }

    public int getNumberHead(){
        return NUMBER_HEAD;
    }

    @Override
    public void getVoice() {
        System.out.println("���!");
    }

    @Override
    public boolean hasEyes() {
        return IPaws.super.hasEyes();
    }

    @Override
    public int getNumberEyes() {
        return 2;
    }
}
