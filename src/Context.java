//Akil

public class Context {
	private Strategy strategy;

	   public Context(Strategy strategy){
	      this.strategy = strategy;
	   }
    
	   public double executeStrategy(Beverage d){
	      return strategy.doOP(d);
	   }
    public double totalCostt() {
        return strategy.totalCostt();
    }

}
