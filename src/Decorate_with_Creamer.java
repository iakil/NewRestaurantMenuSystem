//Daniel
public class Decorate_with_Creamer extends Beverage_Decorator{

    public Decorate_with_Creamer(Beverage decoratedBeverage) {
        super(decoratedBeverage);
    }

    @Override
    public String serve() {
        this.decoratedBeverage.serve();
        if (!(this.decoratedBeverage instanceof Coffee)){
            return " without creamer. Can only add creamer to coffee.";
        }
        else return " with creamer. An additional charge of $1 was added.";
    }

    @Override
    public double costCalc() {
        return this.decoratedBeverage.costCalc() + 1;
    }

    @Override
    public String cost() {
    	return "";
    }

}
