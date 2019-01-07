package headfirst.designpatterns.ducks.step3_strategy;

public class Squeak implements QuackBehavior {
	public void quack() {
		System.out.println("Squeak");
	}
}