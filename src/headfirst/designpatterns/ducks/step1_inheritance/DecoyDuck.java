package headfirst.designpatterns.ducks.step1_inheritance;

public class DecoyDuck extends Duck {

    @Override
    void display() {
        System.out.println("Look like DecoyDuck");
    }

    @Override
    void quack() {
        // do nothing
    }

    @Override
    void fly() {
        // do nothing
    }
}
