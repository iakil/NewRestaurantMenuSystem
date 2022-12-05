//daniel
public class Tea extends Hot_Beverage{
    @Override
    public String serve() {
        return "\nServing: Tea";
    }

    @Override
    public double costCalc() {
        return 3.25;
    }

    @Override
    public String cost() {
        return "$" + costCalc();
    }
}
