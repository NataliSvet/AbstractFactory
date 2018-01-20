package animals.impl.cat;

import animals.interfaces.Cats;
import animals.interfaces.Dogs;
import factory.interfaces.AnimalsFactory;

public class PersianCat implements Cats {
    @Override
    public void play() {
        System.out.println("I am a Persian cat");
    }

    @Override
    public void climb_up_trees() {
        System.out.println("I climb trees");
    }
}
