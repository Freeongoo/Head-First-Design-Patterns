package headfirst.designpatterns.ducks.step2_interface;

public class MallardDuck implements Duck, Flyable, Quackable {
    @Override
    public void swim() {
        System.out.println("I'm swimming");
    }

    @Override
    public void display() {
        System.out.println("Look like MallardDuck");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
