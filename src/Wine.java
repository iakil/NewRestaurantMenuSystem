//daniel
public class Wine extends Alcoholic_Beverage{

    @Override
    public String serve() {
        return "\nServing: Wine";
    }

    @Override
    public double costCalc() {
        return 15.99;
    }

    @Override
    public String cost() {
        return "$" + costCalc();
    }
}

