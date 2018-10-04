package Basic16; // 1003��

//fibonacci(3)�� ȣ���ϸ� ������ ���� ���� �Ͼ��.
//fibonacci(3)�� fibonacci(2)�� fibonacci(1) (ù ��° ȣ��)�� ȣ���Ѵ�.
//fibonacci(2)�� fibonacci(1) (�� ��° ȣ��)�� fibonacci(0)�� ȣ���Ѵ�.
//�� ��° ȣ���� fibonacci(1)�� 1�� ����ϰ� 1�� �����Ѵ�.
//fibonacci(0)�� 0�� ����ϰ�, 0�� �����Ѵ�.
//fibonacci(2)�� fibonacci(1)�� fibonacci(0)�� ����� ���, 1�� �����Ѵ�.
//ù ��° ȣ���� fibonacci(1)�� 1�� ����ϰ�, 1�� �����Ѵ�.
//fibonacci(3)�� fibonacci(2)�� fibonacci(1)�� ����� ���, 2�� �����Ѵ�.
//1�� 2�� ��µǰ�, 0�� 1�� ��µȴ�. N�� �־����� ��, fibonacci(N)�� ȣ������ ��, 0�� 1�� ���� �� �� ��µǴ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�Է� 
//ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
//�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, N�� �־�����. N�� 40���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.
//��� 
//�� �׽�Ʈ ���̽����� 0�� ��µǴ� Ƚ���� 1�� ��µǴ� Ƚ���� �������� �����ؼ� ����Ѵ�.

import java.util.Scanner;

public class Main1 {

	static int[] memo = new int[41];
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) { //Test��ŭ ���� �ݺ�
			int N = sc.nextInt();
			// 0�� ������ �Ǻ���ġ ���� ������, 1�� ������ �Ǻ���ġ�� -1 �� ������ �̿�
			System.out.println(fibonacci(N-1) + " " + fibonacci(N));	
		}
		
		sc.close();
	}
	
	static int fibonacci(int n) {//�Ǻ���ġ �� ���
		if(n<0) return 1;
		if(n>=0 && n<=1) return n;
		else if(memo[n] != 0) return memo[n];
		else return memo[n] = fibonacci(n-1) + fibonacci(n-2);
	}
}
