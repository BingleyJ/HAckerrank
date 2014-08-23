import java.util.Scanner;


public class FillingJars {

	
	
	public static void main(String[] args) {
		long total = 0;
		long count = 0;
		
		Scanner in = new Scanner(System.in);
		long totalJars = in.nextInt();
		long loops = in.nextInt();
		
		long[] jars = new long[(int) totalJars];
		
		for (int i = 0; i < loops; i++){
			
			long indexA = in.nextInt();
			long indexB = in.nextInt();
			long value = in.nextInt();
			
			total = total + ((indexB - indexA + 1) * value);
		}
		total = total / totalJars;
		long realTotal = (long) Math.floor(total);
		System.out.println(total);
	}

}
