//Daniel
public class Coffee extends Hot_Beverage{


    @Override
    public String serve() {
        return "\nServing: Coffee";
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
