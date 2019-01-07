package headfirst.designpatterns.decorator.starbuzz;

public class StarbuzzCoffee {
 
	public static void main(String args[]) {
        bookExample();

        moreCleanExample();
    }

    private static void moreCleanExample() {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        Beverage beverage2 = new Whip(
                                new Mocha(
                                    new Mocha(
                                        new DarkRoast()
                                    )
                                )
                            );
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());

        Beverage beverage3 = new Whip(
                                new Mocha(
                                    new Soy(
                                        new HouseBlend()
                                    )
                                )
                            );
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }

    /**
     * not soo clean demonstration of using decorator - rewriting object - bad practices
     */
    private static void bookExample() {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }
}
