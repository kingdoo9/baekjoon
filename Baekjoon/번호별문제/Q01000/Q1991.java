package Q01000; // 1991��



//���� Ʈ���� �Է¹޾� ���� ��ȸ(preorder traversal), ���� ��ȸ(inorder traversal), ���� ��ȸ(postorder traversal)�� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//���� ��� ���� ���� ���� Ʈ���� �ԷµǸ�,
//���� ��ȸ�� ��� : ABDCEFG // (��Ʈ) (���� �ڽ�) (������ �ڽ�)
//���� ��ȸ�� ��� : DBAECFG // (���� �ڽ�) (��Ʈ) (������ �ڽ�)
//���� ��ȸ�� ��� : DBEGFCA // (���� �ڽ�) (������ �ڽ�) (��Ʈ)
//�� �ȴ�.
//�Է� 
//ù° �ٿ��� ���� Ʈ���� ����� ���� N(1��N��26)�� �־�����. ��° �ٺ��� N���� �ٿ� ���� �� ���� ���� ���� �ڽ� ���, ������ �ڽ� ��尡 �־�����. ����� �̸��� A���� ���ʴ�� ������ �빮�ڷ� �Ű�����, �׻� A�� ��Ʈ ��尡 �ȴ�. �ڽ� ��尡 ���� ��쿡�� .���� ǥ���ȴ�.
//��� 
//ù° �ٿ� ���� ��ȸ, ��° �ٿ� ���� ��ȸ, ��° �ٿ� ���� ��ȸ�� ����� ����Ѵ�. �� �ٿ� N���� ���ĺ��� ���� ���� ����ϸ� �ȴ�.

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
		
		preorder(tree, 1);  // ������ȸ
		System.out.println();
		
		inorder(tree, 1);   // ������ȸ
		System.out.println();
		
		postorder(tree, 1); // ������ȸ
		System.out.println();
		
		sc.close();
	}

	private static void preorder(String[][] tree, int i) { // ������ȸ
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
	
	private static void inorder(String[][] tree, int i) { // ������ȸ
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

	private static void postorder(String[][] tree, int i) { // ������ȸ
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

