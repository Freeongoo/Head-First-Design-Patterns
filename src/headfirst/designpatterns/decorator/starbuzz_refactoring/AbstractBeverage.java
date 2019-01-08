package headfirst.designpatterns.decorator.starbuzz_refactoring;

public abstract class AbstractBeverage implements Beverage {

    protected String description = "Unknown Beverage";

	@Override
	public String getDescription() {
		return description;
	}
}
