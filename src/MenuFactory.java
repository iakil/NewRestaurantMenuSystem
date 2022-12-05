//Jun 

public class MenuFactory {

    private static int numberOfVeganMenusOut = 0;

    public Menu makeMenu(int choice) {
        if (choice == 1) {
            return new SeaFoodMenu();
        } 
        else if (choice == 2) {
            if (numberOfVeganMenusOut < 2) {
                numberOfVeganMenusOut=numberOfVeganMenusOut+1;
                return new VeganMenu();
            } 
            else {
                return new BackUpVeganMenu();
            }
        } 
        else {
            return null;
        }
    }
}
