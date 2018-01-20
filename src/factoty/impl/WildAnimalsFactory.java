package factoty.impl;

import animals.impl.cat.Tiger;
import animals.impl.dog.Wolf;
import animals.interfaces.Cats;
import animals.interfaces.Dogs;
import factory.interfaces.AnimalsFactory;

public class WildAnimalsFactory implements AnimalsFactory {
    @Override
    public Cats createCats() {
        return new Tiger();
    }

    @Override
    public Dogs createDogs() {
        return new Wolf();
    }
}
