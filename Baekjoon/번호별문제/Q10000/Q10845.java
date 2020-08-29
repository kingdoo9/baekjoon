package Q10000; // 10845번
//정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
//명령은 총 여섯 가지이다.
//push X: 정수 X를 큐에 넣는 연산이다.
//pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//size: 큐에 들어있는 정수의 개수를 출력한다.
//empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
//front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//입력 
//첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
import java.util.Scanner;

public class Q10845 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int front=0, back=0;
		int[] queue = new int[10001];
		
		for(int i=0; i<T; i++) {
			String order = sc.next();
			//push 연산수행
			if(order.matches("push")) {
				int N = sc.nextInt();
				queue[back] = N;
				if(back == queue.length) back=-1; //back 이 배열의 끝이라면 0으로 되돌림
				back++;
			//pop 연산수행
			}else if(order.matches("pop")) {
				if(back == front)System.out.println("-1");
				else {
					System.out.println(queue[front]);
					queue[front] = 0;
					if(front == queue.length) front = -1; // front 가 배열의 끝이라면 0으로 되돌림
					front++;
				}
			//size 연산수행
			}else if(order.matches("size")) {
				System.out.println(back-front);
			//empty 연산수행
			}else if(order.matches("empty")) {
				System.out.println(front==back?"1":"0");
			//front 연산수행
			}else if(order.matches("front")) {
				System.out.println(front==back?"-1":queue[front]);
			//back 연산수행
			}else if(order.matches("back")) {
				System.out.println(front==back?"-1":queue[back-1]);
			}
		}
		sc.close();
	}
}
