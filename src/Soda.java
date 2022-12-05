//Daniel
public class Soda extends Cold_Beverage {
    @Override
    public String serve() {
        return "\nServing: Soda";
    }

    @Override
    public double costCalc() {
        return 2.25;
    }

    @Override
    public String cost() {
        return "$" + costCalc();
    }
}

