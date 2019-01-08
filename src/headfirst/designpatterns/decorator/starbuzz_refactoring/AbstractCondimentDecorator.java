package headfirst.designpatterns.decorator.starbuzz_refactoring;

public abstract class AbstractCondimentDecorator implements Beverage {
    protected Beverage beverage;

    public AbstractCondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
