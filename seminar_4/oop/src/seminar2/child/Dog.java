package seminar2.child;

import seminar2.parent.Animal;
import seminar2.parent.Speakable;

public class Dog extends Animal implements Speakable {

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.printf("%s сказал: Гав!%n", getType());
    }

    @Override
    public void hunt() {
        wakeUp();
        toPlay();
        findFood();
        eat();
        toPlay();
        goToSleep();
    }
}
