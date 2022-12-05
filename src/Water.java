//daniel
public class Water extends Cold_Beverage{
    @Override
    public String serve() {
        return "\nServing: Water";
    }

    @Override
    public double costCalc() {
        return 1.25;
    }

    @Override
    public String cost() {
        return "$" + costCalc();
    }
}

