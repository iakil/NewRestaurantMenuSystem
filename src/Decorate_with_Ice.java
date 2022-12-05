//Daniel
public class Decorate_with_Ice extends Beverage_Decorator{

    public Decorate_with_Ice(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }

    @Override
    public String serve() {
        this.decoratedBeverage.serve();
        if (this.decoratedBeverage instanceof Hot_Beverage){
            return " without ice. Cannot add ice to a hot beverage.";
        }
        else return " with ice. No additional charge was added.";
    }

    @Override
    public double costCalc() {
        return this.decoratedBeverage.costCalc();
    }

    @Override
    public String cost() {
    	return "";
    }
}
