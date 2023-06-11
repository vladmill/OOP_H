package homework03;

import java.util.Iterator;
import java.util.List;

public class IteratorPets implements Iterator<Pet> {
    private int index;
    private List<Pet> pets;

    public IteratorPets(List<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public boolean hasNext() {
        return index < pets.size();
    }

    @Override
    public Pet next() {
        return pets.get(index++);
    }

}
