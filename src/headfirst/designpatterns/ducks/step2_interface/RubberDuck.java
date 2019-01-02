package headfirst.designpatterns.ducks.step2_interface;

public class RubberDuck implements Duck, Squeak {

    @Override
    public void swim() {
        System.out.println("I'm swimming");
    }

    @Override
    public void display() {
        System.out.println("Look like RubberDuck");
    }

    @Override
    public void squeak() {
        System.out.println("I'm squeak");
    }
}
