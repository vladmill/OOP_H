package homework02;

import java.util.ArrayList;

public class Owner {
    private final String name;
    private ArrayList<Cat> Cats;

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

