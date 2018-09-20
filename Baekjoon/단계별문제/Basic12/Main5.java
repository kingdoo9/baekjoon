package Basic12; // 1158번
//조세퍼스 문제는 다음과 같다.
//1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 M(≤ N)이 주어진다. 이제 순서대로 M번째 사람을 제거한다. 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다. 이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 원에서 사람들이 제거되는 순서를 (N, M)-조세퍼스 순열이라고 한다. 예를 들어 (7, 3)-조세퍼스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.
//N과 M이 주어지면 (N,M)-조세퍼스 순열을 구하는 프로그램을 작성하시오.
//입력 
//첫째 줄에 N과 M이 빈 칸을 사이에 두고 순서대로 주어진다. (1 ≤ M ≤ N ≤ 5,000)
//출력 
//예제와 같이 조세퍼스 순열을 출력한다.

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main5 {
	public static void main(String[] args) {
		                                                
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		Queue<Integer> que = new LinkedList<>();
		int die = 1;
		
		for(int i=1; i<=N; i++)que.add(i); //que에 인원수 입력

		System.out.print("<");
		
		while(true) {
			if(die==M) { //죽는수와 M의 값이 같다면 제외시킴
				int j = que.poll();
				if(que.isEmpty()) { System.out.print(j); break;}
				else System.out.print(j+", ");
				die = 1; //죽는수를 1로 초기화
			}else { //죽는수와 M이 같지 않다면 que에 뺐다가 다시 넣음.
				int temp = que.poll();
				que.add(temp);
				die++;
			}
		}
		
		System.out.print(">");
		sc.close();
	}
}
