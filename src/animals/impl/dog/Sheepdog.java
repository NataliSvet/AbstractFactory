package animals.impl.dog;

import animals.interfaces.Dogs;

public class Sheepdog implements Dogs {
    @Override
    public void play() {
        System.out.println("I am a sheepdog");
    }
    @Override
    public void run_fast() {
        System.out.println("I run fast");
    }
}
