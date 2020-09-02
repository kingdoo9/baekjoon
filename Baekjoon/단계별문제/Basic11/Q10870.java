package Basic11; //Q10870

/*����
�Ǻ���ġ ���� 0�� 1�� �����Ѵ�. 0��° �Ǻ���ġ ���� 0�̰�, 1��° �Ǻ���ġ ���� 1�̴�. �� ���� 2��° ���ʹ� �ٷ� �� �� �Ǻ���ġ ���� ���� �ȴ�.

�̸� ������ �Ẹ�� Fn = Fn-1 + Fn-2 (n>=2)�� �ȴ�.

n=17�϶� ���� �Ǻ���ġ ���� �Ẹ�� ������ ����.

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597

n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� n�� �־�����. n�� 20���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.

���
ù° �ٿ� n��° �Ǻ���ġ ���� ����Ѵ�.

���� �Է� 1 
10
���� ��� 1 
55*/

import java.util.Scanner;

public class Q10870 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int memo[] = new int [n+1];
		memo[0] = 0;
		memo[1] = 1;
		int answer = Fibonacci(memo, n);
		
		System.out.println(answer);
		scan.close();
	}

	private static int Fibonacci(int[] memo, int n) {
		if(n < 2 || memo[n] != 0) return memo[n];
		else {
			memo[n] = Fibonacci(memo, n-1) + Fibonacci(memo, n-2);
			return memo[n];
		}

	}
}
