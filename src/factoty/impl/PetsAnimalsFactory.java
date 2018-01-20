package factoty.impl;

import animals.impl.cat.PersianCat;
import animals.impl.dog.Sheepdog;
import animals.interfaces.Cats;
import animals.interfaces.Dogs;
import factory.interfaces.AnimalsFactory;

public class PetsAnimalsFactory implements AnimalsFactory {
    @Override
    public Cats createCats() {
        return new PersianCat();
    }

    @Override
    public Dogs createDogs() {
        return new Sheepdog();
    }
}
