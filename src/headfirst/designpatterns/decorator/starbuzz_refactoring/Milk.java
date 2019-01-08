package headfirst.designpatterns.decorator.starbuzz_refactoring;

public class Milk extends AbstractCondimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

    @Override
	public double cost() {
		return .10 + beverage.cost();
	}
}
