package headfirst.designpatterns.ducks.step3_strategy;

public class Quack implements QuackBehavior {
	public void quack() {
		System.out.println("Quack");
	}
}
