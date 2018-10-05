package Basic12; // 1260번
//그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오. 단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.
//입력 
//첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 탐색을 시작할 정점의 번호 V가 주어진다. 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다. 한 간선이 여러 번 주어질 수도 있는데, 간선이 하나만 있는 것으로 생각하면 된다. 입력으로 주어지는 간선은 양방향이다.
//출력 
//첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. V부터 방문된 점을 순서대로 출력하면 된다.import java.util.Scanner;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main2 {
	static boolean[] visited = new boolean[1001];
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int V = sc.nextInt();
		
		//Graph[1][2] 가 true 라면 간선이 있는것으로 저장
		boolean[][] Graph = new boolean[N+1][N+1];

		
		for(int i=0; i<M; i++) { // 간선의 정보를 입력
			int Start = sc.nextInt();
			int End = sc.nextInt();
			
			Graph[Start][0] = true; // 정점이 있다는것을 표시
			Graph[Start][End] = true; //간선을 표시
			Graph[End][Start] = true;
		}
		
		DFS(N, V, Graph); // 깊이 우선탐색
		
		System.out.println();
		visited = new boolean[1001]; //방문의 초기화
		
		BFS(N, V, Graph); // 너비 우선탐색
		System.out.println();
		
		sc.close();
	}
	
	static void DFS(int n, int v, boolean[][] graph) {
		
		visited[v] = true;
		System.out.print(v+" ");
		for(int i=1; i<=n; i++) {
			if(graph[v][i] == true && visited[i]==false) {
				DFS(n, i,graph);
			}
		}
		
	}
	
	// 
	static void BFS(int n, int v, boolean[][] graph) {
		Queue<Integer> que = new LinkedList<>();
		visited[v] = true;
		System.out.print(v + " ");
		que.add(v);
		
		while(!que.isEmpty()) { //que가 전부 없을때까지 반복
			v = que.poll();
			for(int i=1; i<=n; i++) {
				if(graph[v][i] == true && visited[i] == false) {
					que.add(i);
					visited[i] = true;
					System.out.print(i+" ");
				}
			}
		}
		
	}
}
