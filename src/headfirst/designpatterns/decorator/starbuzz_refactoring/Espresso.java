package headfirst.designpatterns.decorator.starbuzz_refactoring;

public class Espresso extends AbstractBeverage {
  
	public Espresso() {
		description = "Espresso";
	}

    @Override
	public double cost() {
		return 1.99;
	}
}

