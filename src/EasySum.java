import java.util.Scanner;


public class EasySum {

	
	public static void getThat(long inNum1, long inNum2){
		long dumbNum = 0;
		
		for (long i = 1; i <= inNum1; i++){
			dumbNum = dumbNum + i%inNum2;
			System.out.println(i%inNum2);
		}
	System.out.println(dumbNum);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		//int loops = in.nextInt();
		//for (int i = 0; i < loops; i++){
			//long num1 = in.nextLong();
			//long num2 = in.nextLong();
			getThat(1000000000, 1000000000);
		//}
		
	}

}
