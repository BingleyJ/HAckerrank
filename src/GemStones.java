import java.util.Arrays;
import java.util.Scanner;

public class GemStones {
	// deletes duplicate chars from array
	public static char[] cleanString(char[] inString) {
		Arrays.sort(inString);
		char[] outString = new char[inString.length];
		char lastChar = '\u0000';
		int counter = 0;
		for (int i = 0; i < inString.length; i++) {
			if (lastChar == inString[i])
				continue;
			outString[counter] = inString[i];
			lastChar = inString[i];
			counter++;
		}
		char[] rtnString = new char[counter];
		rtnString = Arrays.copyOf(outString, counter);
		return rtnString;
	}

	public static char[] compareString(char[] inString1, char[] inString2) {
		char[] tmpString = new char[inString1.length];
		int counter = 0;

		for (int i = 0; i < inString1.length; i++) {
			for (int j = 0; j < inString2.length; j++) {
				if (inString1[i] == inString2[j]) {
					tmpString[counter] = inString1[i];
					counter++;
				}
			}
		}
		char[] outString = new char[counter];
		// System.out.println(counter);

		outString = Arrays.copyOf(tmpString, counter);
		//System.out.println(outString.length);
		return outString;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int loops = 3;
		Scanner in = new Scanner(System.in);
		//loops = in.nextInt();

		char[] firstLine = cleanString(in.nextLine().toCharArray());
		//char[] secondLine = cleanString(in.nextLine().toCharArray());
		

		
		// char[] firstLine = {'a','b','c','d','d','e'};
		// char[] secondLine = {'b','a','c','c','d'};
		// char[] thirdLine = {'e','e','a','b','g'};

		//System.out.println(loops);
		//System.out.println(firstLine);
		//System.out.println(secondLine);

		// char[] finalLine = compareString(firstLine, secondLine);

		
		  for (int i = 0; i < loops; i++) { 
		  char[] tempString = compareString(firstLine, cleanString(in.nextLine().toCharArray()));
		  //System.out.println("loop " + i);
		  //System.out.println(tempString);
		  firstLine = tempString.clone(); 
		  }
		 

		System.out.println(firstLine.length);
		//System.out.println(secondLine.length);

	}
}
