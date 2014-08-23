import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaximisingXor {
	/*
	 * Complete the function below.
	 */

	static int maxXor(int l, int r) {
		int bigNum = 0;
		for (int i = l; i <= r; i++) {
			for (int b = i; b <= r; b++) {
				int tempNum = i ^ b;
				if (tempNum > bigNum) {
					bigNum = tempNum;
				}
			}
		}
		return bigNum;
	}

	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		int res;
		int _l;
		// _l = Integer.parseInt(in.nextLine());

		int _r;
		// _r = Integer.parseInt(in.nextLine());

		res = maxXor(751, 982);
		System.out.println(res);

	}
}
