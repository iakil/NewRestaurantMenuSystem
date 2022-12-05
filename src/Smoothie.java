//Daniel
public class Smoothie extends Cold_Beverage{
    @Override
    public String serve() {
        return "\nServing: Smoothie";
    }

    @Override
    public double costCalc() {
        return 7.29;
    }

    @Override
    public String cost() {
        return "$" + costCalc();
    }
}
