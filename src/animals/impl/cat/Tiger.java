package animals.impl.cat;

import animals.interfaces.Cats;

public class Tiger implements Cats {

    @Override
    public void play() {
        System.out.println("I am a tiger");
    }
    @Override
    public void climb_up_trees() {
        System.out.println("I climb trees");
    }
}
