package headfirst.designpatterns.decorator.starbuzz_refactoring;

public class HouseBlend extends AbstractBeverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}

    @Override
	public double cost() {
		return .89;
	}
}

