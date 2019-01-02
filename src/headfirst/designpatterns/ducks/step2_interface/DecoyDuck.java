package headfirst.designpatterns.ducks.step2_interface;

public class DecoyDuck implements Duck {
    @Override
    public void swim() {
        System.out.println("I'm swimming");
    }

    @Override
    public void display() {
        System.out.println("Look like DecoyDuck");
    }
}
