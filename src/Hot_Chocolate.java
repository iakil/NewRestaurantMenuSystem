//Daniel
public class Hot_Chocolate extends Hot_Beverage{
    @Override
    public String serve() {
        return "\nServing: Hot Chocolate";
    }

    @Override
    public double costCalc() {
        return 4.50;
    }

    @Override
    public String cost() {
        return "$" + costCalc();
    }
}