//akil


public class StrategyAddtoCart implements Strategy{
	public double totalCost;
	
	public double totalCostt(){
		return totalCost;
	}
	public double doOP(Beverage d) {
		double x = d.costCalc();
		double y=totalCost +=x;
		return y;}

	}


// public class StrategyAddtoCart {
// 		protected double totalCost;
		
// 		public StrategyAddtoCart() {
// 			this.totalCost = 0;
// 		}
		
// 		public double runPattern(){
// 			return totalCost; 
// 		}
		
// 		public double AddToBill(Beverage B) {
// 			double x = B.costCalc();
// 			return this.totalCost += x;
// 		}

// }
