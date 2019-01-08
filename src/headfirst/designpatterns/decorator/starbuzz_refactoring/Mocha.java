package headfirst.designpatterns.decorator.starbuzz_refactoring;

public class Mocha extends AbstractCondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

    @Override
	public double cost() {
		return .20 + beverage.cost();
	}
}
