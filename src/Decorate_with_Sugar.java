//Daniel
public class Decorate_with_Sugar extends Beverage_Decorator{

    public Decorate_with_Sugar(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }

    @Override
    public String serve() {
        this.decoratedBeverage.serve();
        if (!(this.decoratedBeverage instanceof Hot_Beverage || this.decoratedBeverage instanceof Smoothie)){
            return " without sugar. Cannot add sugar to a beverage of this category.";
        }
        else return " with sugar. An additional charge of 50 cents was added.";
    }

    @Override
    public double costCalc() {
        return this.decoratedBeverage.costCalc() + 0.50;
    }

    @Override
    public String cost() {
    		return "";
    }
}
