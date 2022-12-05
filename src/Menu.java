//jun

public abstract class Menu {
    public abstract String getMenu();
    
    @Override
    public String toString(){
        return this.getMenu();
    }
}
