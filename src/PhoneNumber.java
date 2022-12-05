//Arben
public class PhoneNumber {

    private static String restaurantNumber = new String("718-555-5555");

    private PhoneNumber(){}

    public static String getRestaurantNumber(){
        return restaurantNumber;
    }

    public static String Calling() {
        return "Calling " + restaurantNumber;
    }

    public static String HangUp() {
        return "Hanging up";
    }
}
