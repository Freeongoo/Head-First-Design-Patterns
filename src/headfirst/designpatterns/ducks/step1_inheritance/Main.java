package headfirst.designpatterns.ducks.step1_inheritance;

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
            d.fly();
            d.quack();
            d.swim();
        });
    }
}
