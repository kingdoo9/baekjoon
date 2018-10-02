package Basic13; // 1021번
//지민이는 N개의 원소를 포함하고 있는 양방향 순환 큐를 가지고 있다. 지민이는 이 큐에서 몇 개의 원소를 뽑아내려고 한다.
//지민이는 이 큐에서 다음과 같은 3가지 연산을 수행할 수 있다.
//첫 번째 원소를 뽑아낸다. 이 연산을 수행하면, 원래 큐의 원소가 a1, ..., ak이었던 것이 a2, ..., ak와 같이 된다.
//왼쪽으로 한 칸 이동시킨다. 이 연산을 수행하면, a1, ..., ak가 a2, ..., ak, a1이 된다.
//오른쪽으로 한 칸 이동시킨다. 이 연산을 수행하면, a1, ..., ak가 ak, a1, ..., ak-1이 된다.
//큐에 처음에 포함되어 있던 수 N이 주어진다. 그리고 지민이가 뽑아내려고 하는 원소의 위치가 주어진다. (이 위치는 가장 처음 큐에서의 위치이다.) 이때, 그 원소를 주어진 순서대로 뽑아내는데 드는 2번, 3번 연산의 최솟값을 출력하는 프로그램을 작성하시오.
//입력 
//첫째 줄에 큐의 크기 N과 뽑아내려고 하는 수의 개수 M이 주어진다. N은 50보다 작거나 같은 자연수이고, M은 N보다 작거나 같은 자연수이다. 둘째 줄에는 지민이가 뽑아내려고 하는 수의 위치가 순서대로 주어진다. 위치는 1보다 크거나 같고, N보다 작거나 같은 자연수이다.
//출력 
//첫째 줄에 문제의 정답을 출력한다.

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Deque<Integer> dq = new LinkedList<>();
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int l, r, result = 0; // 왼 탐색인지 오른 탐색인지 결정하여 where에 저장
		int j=0 , k=0; //j = 현재 출력해야하는 순번, k= 출력된 순번을 out에 저장
		int[] arr = new int[M];
		int[] out = new int[M];
		
		for(int i=0; i<M; i++) { arr[i] = sc.nextInt(); }
		
		for(int i=1; i<=N; i++) {dq.add(i);}
		
		while(true) {
			// 맨앞인자와 arr의 첫인자가 같다면 뽑아내고 deque에서 삭제
			if(arr[j] == dq.peek()) {
				arr[j] = 0;
				out[k] = dq.pop();
				j++; k++;
			}
			if(arr[M-1] == 0) break; //탐색이끝나면 종료
			
			// 오른쪽이 짧은지 왼쪽이 짧은지 탐색
			l = dq.peek() - arr[j];
			r = arr[j] - dq.peek();
			
			if(l < 0) { // 이미 pop으로 나간 인자들을 제외시킴
				l += N;
				for(int i=0; out[i] !=0; i++) {
					if(dq.peek() < out[i] && arr[j] > out[i]) r--;
					else l--;
				}
			}
			else{ // 이미 pop으로 나간 인자들을 제외시킴
				r += N;
				for(int i=0; out[i] !=0; i++) {
					if(dq.peek() > out[i] && arr[j] < out[i]) l--;
					else r--;
				}
			}
		
			// 더 적은 쪽으로 다음 필요한 순서를 맨앞으로 보냄
			if(l>r) {
				for(int i=0; i<r; i++) {
					int temp = dq.pop();
					dq.add(temp);
				}
				result += r;
			}
			else {
				for(int i=0; i<l; i++) {
					int temp = dq.pollLast();
					dq.push(temp);
				}
				result += l;
			}
		}
		
		System.out.println(result);
		
		sc.close();
	}
}
