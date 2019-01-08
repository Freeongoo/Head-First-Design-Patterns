package headfirst.designpatterns.decorator.starbuzz_refactoring;

public class DarkRoast extends AbstractBeverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}

    @Override
	public double cost() {
		return .99;
	}
}

