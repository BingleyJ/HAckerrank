
public class ChocolateFeast {

	public static void eatChocolate(int inMoney, int inPrice, int inWrappers){
		int chocEat = inMoney / inPrice;
		chocEat = chocEat + (chocEat / inWrappers);
		System.out.println(chocEat);
		
	}
	
	public static void main(String[] args) {
		int money, price, wrappers = 0;
		java.util.Scanner in = new java.util.Scanner(System.in);
		int loops = in.nextInt();
		
		for (int i = 0; i < loops; i++){
		eatChocolate(money = in.nextInt(), price = in.nextInt(), wrappers = in.nextInt());
		}
		
	}

}
