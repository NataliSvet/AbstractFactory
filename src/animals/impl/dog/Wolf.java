package animals.impl.dog;

import animals.interfaces.Dogs;

public class Wolf implements Dogs {
    @Override
    public void play() {
        System.out.println("I am wolf");
    }

    @Override
    public void run_fast() {
        System.out.println("I run fast");
    }
}
