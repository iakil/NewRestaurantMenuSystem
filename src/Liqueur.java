//Daniel
public class Liqueur extends Alcoholic_Beverage{
    @Override
    public String serve() {
        return "\nServing: Liqueur";
    }

    @Override
    public double costCalc() {
        return 17.99;
    }

    @Override
    public String cost() {
        return "$" + costCalc();
    }
}
