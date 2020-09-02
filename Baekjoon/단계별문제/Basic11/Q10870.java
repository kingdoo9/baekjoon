package Basic11;

import java.util.Scanner;

public class Q10870 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int memo[] = new int [n+2];
		memo[1] = 0;
		memo[2] = 1;
		int answer = Fibonacci(memo, n);
		
		System.out.println(answer);
		scan.close();
	}

	private static int Fibonacci(int[] memo, int n) {
		if(n < 3 || memo[n] != 0) return memo[n];
		else {
			memo[n] = Fibonacci(memo, n-1) + Fibonacci(memo, n-2);
			return memo[n];
		}

	}

}
