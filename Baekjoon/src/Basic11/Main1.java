package Basic11; // 10828번
// 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
//명령은 총 다섯 가지이다.
//push X: 정수 X를 스택에 넣는 연산이다.
//pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//size: 스택에 들어있는 정수의 개수를 출력한다.
//empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
//top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//입력 
//첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int top=0;
		int[] stack = new int[10001];
		
		for(int i=0; i<T; i++) {
			String order = sc.next();
			//push 연산수행
			if(order.matches("push")) {
				int N = sc.nextInt();
				stack[top] = N;
				top++;
			//pop 연산수행
			}else if(order.matches("pop")) {
				if(top ==0)System.out.println("-1");
				else {
					System.out.println(stack[top-1]);
					stack[top-1] = 0;
					top--;
				}
			//size 연산수행
			}else if(order.matches("size")) {
				System.out.println(top);
			//empty 연산수행
			}else if(order.matches("empty")) {
				System.out.println(top==0?"1":"0");
			//top 연산수행
			}else if(order.matches("top")) {
				System.out.println(top==0?"-1":stack[top-1]);
			}
		}
		sc.close();
	}
}
