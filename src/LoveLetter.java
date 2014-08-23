import java.util.concurrent.ConcurrentHashMap;

public class LoveLetter {

	
	public static void Pal(String inString){
		int count = 0; // moves to complete palidrome

		if (inString.length() % 2 == 0) {
			// System.out.println("Even");
			int halfway = inString.length() / 2; // halfway through the string.
			
			for (int i = 0; i < halfway; i++) {// loop to halfway point
				char tempchar1 = inString.charAt(i); // position of i in string
				char tempchar2 = inString.charAt(inString.length() - i - 1); // opposite of i
				if ((int)tempchar2 > (int)tempchar1){ //if first char is bigger
					count = count + ((int)tempchar2 - (int)tempchar1);
				}
				if ((int)tempchar1 > (int)tempchar2){ //if second char is bigger
					count = count + ((int)tempchar1 - (int)tempchar2);
				}
			}
			System.out.println(count);
		}
		
		
		
		if (inString.length() % 2 != 0) {
			// System.out.println("Odd");
			int halfway = inString.length() / 2 + 1; // halfway through the string.

			for (int i = 0; i < halfway; i++) {// loop to halfway point
				char tempchar1 = inString.charAt(i); // position of i in string
				char tempchar2 = inString.charAt(inString.length() - i - 1);
				if ((int)tempchar2 > (int)tempchar1){ //if first char is bigger
					count = count + ((int)tempchar2 - (int)tempchar1);
				}
				if ((int)tempchar1 > (int)tempchar2){ //if second char is bigger
					count = count + ((int)tempchar1 - (int)tempchar2);
				}
			}
			System.out.println(count);
		}
	}
	
	public static void main(String[] args) {
		Pal("ban");
		//java.util.Scanner in = new java.util.Scanner(System.in);
		//int inCount = in.nextInt();
        //for ( int i = 0; i < inCount; i++){
        //String inStr = in.next();
		//Pal(inStr);
        // }
	}
}
