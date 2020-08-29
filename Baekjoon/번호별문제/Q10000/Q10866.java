package Q10000; // 10866번
//정수를 저장하는 덱(Deque)를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
//명령은 총 여덟 가지이다.
//push_front X: 정수 X를 덱의 앞에 넣는다.
//push_back X: 정수 X를 덱의 뒤에 넣는다.
//pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//size: 덱에 들어있는 정수의 개수를 출력한다.
//empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
//front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//입력 
//첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘쨰 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
//출력 
//출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.

import java.util.Scanner;

public class Q10866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] Deque = new int[10001];
		
		int T = sc.nextInt();
		int N, front =0, back=0;
		
		for(int i=0; i<T; i++) {
			String order = sc.next();
			
			//push_front 연산 수행
			if(order.matches("push_front")) {
				N = sc.nextInt();
				if(front==0) front = Deque.length; //front가 0이면 배열의 끝으로
				front--;
				Deque[front] = N;
			
			//push_back 연산 수행
			}else if(order.matches("push_back")) {
				N = sc.nextInt();
				Deque[back] = N;
				if(back == Deque.length-1) back = -1; //Maxsize에 변수가 도달하면 다시 처음으로
				back++;

			//pop_front 연산 수행
			}else if(order.matches("pop_front")) {
				if(front==back) {System.out.println("-1"); continue;}
				else {
					System.out.println(Deque[front]);
					Deque[front] = 0;
					if(front == Deque.length-1) front = -1; //Maxsize에 변수가 도달하면 다시 처음으로
					front++;
				}
			//pop_back 연산 수행
			}else if(order.matches("pop_back")) {
				if(front==back) {System.out.println("-1"); continue;}
				else {
					int k=0;
					if(back == 0) k = Deque.length-1;
					else k = back-1;
					System.out.println(Deque[k]); 
					back= k;
				}
			//size 연산 수행
			}else if(order.matches("size")) {
				int size = back-front;
				if(size<0) size+=10001;
				System.out.println(size);
			
			//empty 연산 수행
			}else if(order.matches("empty")) {
				System.out.println(front == back? "1": "0");
				
			//front 연산 수행
			}else if(order.matches("front")) {
				System.out.println(front == back? "-1": Deque[front]);
				
			//back 연산 수행
			}else if(order.matches("back")) {
				int k=0;
				if(back == 0) k = Deque.length-1;
				else k = back-1;
				System.out.println(front==back?"-1":Deque[k]);
			}
		}
		sc.close();
	}
}
