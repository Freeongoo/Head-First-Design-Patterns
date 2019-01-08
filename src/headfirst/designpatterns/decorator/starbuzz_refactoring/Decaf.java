package headfirst.designpatterns.decorator.starbuzz_refactoring;

public class Decaf extends AbstractBeverage {
	public Decaf() {
		description = "Decaf Coffee";
	}

    @Override
	public double cost() {
		return 1.05;
	}
}

