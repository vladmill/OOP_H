package homework03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Service implements Iterable<Pet> {
    private ArrayList<Pet> pets;

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    public Service(ArrayList<Pet> pets) {
        this.pets = pets;
    }
    public Service() {
        this(new ArrayList<Pet>());
    }

    @Override
    public Iterator<Pet> iterator() {
        return new IteratorPets(pets);
    }

    public void addPet(Pet unit) {
        pets.add(unit);
    }

    public Pet getPetByName(String str) {
        for (Pet unit : pets) {
            if (unit.getName().equals(str)) {
                return unit;
            }
        }
        return null;
    }

    public void sortPet(Comparator<Pet> compar) {
        pets.sort(compar);
    }
}
