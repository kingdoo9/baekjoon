package Basic10;

import java.util.Scanner;

public class Q4153 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String ans = "wrong";
		int tmp;
		
		while(true) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			int C = scan.nextInt();
			
			if(A == 0 && B == 0 && C == 0) break;
			
			if(A>C) {
				tmp = A;
				A = C;
				C = tmp;
			}
			if(B>C) {
				tmp = B;
				B = C;
				C = tmp;
			}
			
			
			if(((A*A) + (B*B)) == (C*C)) ans = "right";
			
			System.out.println(ans);
            ans = "wrong";
		}
		
		scan.close();
	}
}
