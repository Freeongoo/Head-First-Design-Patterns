package headfirst.designpatterns.decorator.starbuzz_refactoring;

public class Soy extends AbstractCondimentDecorator {

    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

    @Override
	public double cost() {
		return .15 + beverage.cost();
	}
}
