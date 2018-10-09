package Q01000; // 1991번



//이진 트리를 입력받아 전위 순회(preorder traversal), 중위 순회(inorder traversal), 후위 순회(postorder traversal)한 결과를 출력하는 프로그램을 작성하시오.
//
//예를 들어 위와 같은 이진 트리가 입력되면,
//전위 순회한 결과 : ABDCEFG // (루트) (왼쪽 자식) (오른쪽 자식)
//중위 순회한 결과 : DBAECFG // (왼쪽 자식) (루트) (오른쪽 자식)
//후위 순회한 결과 : DBEGFCA // (왼쪽 자식) (오른쪽 자식) (루트)
//가 된다.
//입력 
//첫째 줄에는 이진 트리의 노드의 개수 N(1≤N≤26)이 주어진다. 둘째 줄부터 N개의 줄에 걸쳐 각 노드와 그의 왼쪽 자식 노드, 오른쪽 자식 노드가 주어진다. 노드의 이름은 A부터 차례대로 영문자 대문자로 매겨지며, 항상 A가 루트 노드가 된다. 자식 노드가 없는 경우에는 .으로 표현된다.
//출력 
//첫째 줄에 전위 순회, 둘째 줄에 중위 순회, 셋째 줄에 후위 순회한 결과를 출력한다. 각 줄에 N개의 알파벳을 공백 없이 출력하면 된다.

import java.util.Scanner;

public class Q1991 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		
		String[][] tree = new String[N+1][3];
		
		for(int i=1; i<=N; i++) {
			tree[i] = sc.nextLine().split(" ");
		}
		
		preorder(tree, 1);  // 전위순회
		System.out.println();
		
		inorder(tree, 1);   // 중위순회
		System.out.println();
		
		postorder(tree, 1); // 후위순회
		System.out.println();
		
		sc.close();
	}

	private static void preorder(String[][] tree, int i) { // 전위순회
		System.out.print(tree[i][0]);
		if(tree[i][1].charAt(0)!='.') {
			for(int j=1; j<=26; j++) {
				if(tree[i][1].matches(tree[j][0])) {
					preorder(tree,j); break;
				}
			}
		}
		if(tree[i][2].charAt(0)!='.') {
			for(int j=1; j<=26; j++) {
				if(tree[i][2].matches(tree[j][0])) {
					preorder(tree,j); break;
				}
			}
		}
	}
	
	private static void inorder(String[][] tree, int i) { // 중위순회
		if(tree[i][1].charAt(0)!='.') {
			for(int j=1; j<=26; j++) {
				if(tree[i][1].matches(tree[j][0])) {
					inorder(tree,j); break;
				}
			}
		}
		
		System.out.print(tree[i][0]);
		
		if(tree[i][2].charAt(0)!='.') {
			for(int j=1; j<=26; j++) {
				if(tree[i][2].matches(tree[j][0])) {
					inorder(tree,j); break;
				}
			}
		}
	}

	private static void postorder(String[][] tree, int i) { // 후위순회
		if(tree[i][1].charAt(0)!='.') {
			for(int j=1; j<=26; j++) {
				if(tree[i][1].matches(tree[j][0])) {
					postorder(tree,j); break;
				}
			}
		}
		if(tree[i][2].charAt(0)!='.') {
			for(int j=1; j<=26; j++) {
				if(tree[i][2].matches(tree[j][0])) {
					postorder(tree,j); break;
				}
			}
		}
		System.out.print(tree[i][0]);
	}

}

