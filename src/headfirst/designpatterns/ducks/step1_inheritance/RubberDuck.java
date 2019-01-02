package headfirst.designpatterns.ducks.step1_inheritance;

public class RubberDuck extends Duck {

    @Override
    void display() {
        System.out.println("Look like RubberDuck");
    }

    @Override
    void quack() {
        System.out.println("Squeak");
    }

    @Override
    void fly() {
        // do nothing
    }
}
