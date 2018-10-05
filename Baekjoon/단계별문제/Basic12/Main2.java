package Basic12; // 1260��
//�׷����� DFS�� Ž���� ����� BFS�� Ž���� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��, �湮�� �� �ִ� ������ ���� ���� ��쿡�� ���� ��ȣ�� ���� ���� ���� �湮�ϰ�, �� �̻� �湮�� �� �ִ� ���� ���� ��� �����Ѵ�. ���� ��ȣ�� 1������ N�������̴�.
//�Է� 
//ù° �ٿ� ������ ���� N(1 �� N �� 1,000), ������ ���� M(1 �� M �� 10,000), Ž���� ������ ������ ��ȣ V�� �־�����. ���� M���� �ٿ��� ������ �����ϴ� �� ������ ��ȣ�� �־�����. �� ������ ���� �� �־��� ���� �ִµ�, ������ �ϳ��� �ִ� ������ �����ϸ� �ȴ�. �Է����� �־����� ������ ������̴�.
//��� 
//ù° �ٿ� DFS�� ������ �����, �� ���� �ٿ��� BFS�� ������ ����� ����Ѵ�. V���� �湮�� ���� ������� ����ϸ� �ȴ�.import java.util.Scanner;

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
		
		//Graph[1][2] �� true ��� ������ �ִ°����� ����
		boolean[][] Graph = new boolean[N+1][N+1];

		
		for(int i=0; i<M; i++) { // ������ ������ �Է�
			int Start = sc.nextInt();
			int End = sc.nextInt();
			
			Graph[Start][0] = true; // ������ �ִٴ°��� ǥ��
			Graph[Start][End] = true; //������ ǥ��
			Graph[End][Start] = true;
		}
		
		DFS(N, V, Graph); // ���� �켱Ž��
		
		System.out.println();
		visited = new boolean[1001]; //�湮�� �ʱ�ȭ
		
		BFS(N, V, Graph); // �ʺ� �켱Ž��
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
		
		while(!que.isEmpty()) { //que�� ���� ���������� �ݺ�
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
