//Daniel
public class Beer extends Alcoholic_Beverage{

    @Override
    public String serve() {
        return "\nServing: Beer";
    }

    @Override
    public double costCalc() {
        return 5;
    }

    @Override
    public String cost() {
        return "$" + costCalc();
    }
}
