//Daniel

public abstract class Beverage_Decorator implements Beverage{

    protected Beverage decoratedBeverage;

    public Beverage_Decorator(Beverage decoratedBeverage){
        this.decoratedBeverage = decoratedBeverage;
    }
}
