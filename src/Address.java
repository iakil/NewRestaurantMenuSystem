//Arben
public class Address {
    private static String restaurantAddress = new String("Queens College Science");

    private Address(){}

    public static String getRestaurantAddress(){
        return restaurantAddress;
    }

    public static String directions() {
        return "Directions to Restaurant: " + restaurantAddress;
    }
}