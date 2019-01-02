package headfirst.designpatterns.ducks.step2_interface;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Duck> ducks = new ArrayList<>();

        ducks.add(new MallardDuck());
        ducks.add(new RedheadDuck());
        ducks.add(new RubberDuck());
        ducks.add(new DecoyDuck());

        ducks.forEach(d -> {
            d.display();
            d.swim();

            if (d instanceof Flyable) {
                ((Flyable)d).fly();
            }

            if (d instanceof Quackable) {
                ((Quackable)d).quack();
            }

            if (d instanceof Squeakable) {
                ((Squeakable)d).squeak();
            }
        });
    }
}
