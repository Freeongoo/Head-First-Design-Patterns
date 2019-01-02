package headfirst.designpatterns.ducks.step1_inheritance;

public abstract class Duck {

    abstract void display();

    void quack() {
        System.out.println("Quack");
    }

    void swim() {
        System.out.println("I'm swimming");
    }

    void fly() {
        System.out.println("I'm flying");
    }
}
