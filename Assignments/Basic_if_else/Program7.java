//Calculate profite or loss
//Write a program that takes the cost price and selling price and calculate its profit or loss

class Profit{
        public static void main(String[] abhi){
		int sell=1800;
		int cost=1500;
		int profit=0,loss=0;
		if(sell>cost){
			profit=sell-cost;
			System.out.println("Profit of "+profit);
		}else if(cost<sell){
			loss=cost-sell;
			System.out.println("Loss of "+loss);
		}else{
			System.out.println("No profit No loss");
		}
        }
}

