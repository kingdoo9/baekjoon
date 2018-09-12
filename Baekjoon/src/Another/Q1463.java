package Another;

import java.util.Scanner;

public class Q1463 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int R = 0;
		
		while(N>1) {
			
			if(N%3 ==0)N/=3;
			else if((N-1)%3 ==0) N--;
			else if(N%2 ==0) N/=2;
			else N--;
			
			R++;
		}
		
		if(N==1) System.out.println("1");
		else System.out.println(R);
		
		
		sc.close();
	}
}

// ½ÇÆÐ