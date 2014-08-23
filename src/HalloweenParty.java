import java.util.Scanner;


public class HalloweenParty {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int loops = in.nextInt();
		for (int i = 0; i < loops; i++){
			long inCount = in.nextInt();
			
			if (inCount % 2 == 0){ // if even
				System.out.println((inCount / 2) * (inCount / 2));
			}
			
			if (inCount % 2 != 0){ // if odd
				System.out.println(((inCount % 2) + (inCount / 2)) * (inCount / 2));
			}
			
			
			
		}

	}

}
