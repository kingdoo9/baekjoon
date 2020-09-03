package Basic11; //Q11729

/*����
�� ���� ��밡 �ְ� ù ��° ��뿡�� �ݰ��� ���� �ٸ� n���� ������ �׿� �ִ�. �� ������ �ݰ��� ū ������� �׿��ִ�. ���� �����µ��� ���� ��Ģ�� ���� ù ��° ��뿡�� �� ��° ���� �ű�� �Ѵ�.

�� ���� �� ���� ���Ǹ��� �ٸ� ž���� �ű� �� �ִ�.
�׾� ���� ������ �׻� ���� ���� �Ʒ��� �ͺ��� �۾ƾ� �Ѵ�.
�� �۾��� �����ϴµ� �ʿ��� �̵� ������ ����ϴ� ���α׷��� �ۼ��϶�. ��, �̵� Ƚ���� �ּҰ� �Ǿ�� �Ѵ�.

�Ʒ� �׸��� ������ 5���� ����� �����̴�.



�Է�
ù° �ٿ� ù ��° ��뿡 ���� ������ ���� N (1 �� N �� 20)�� �־�����.

 

���
ù° �ٿ� �ű� Ƚ�� K�� ����Ѵ�.

�� ��° �ٺ��� ���� ������ ����Ѵ�. �� ��° �ٺ��� K���� �ٿ� ���� �� ���� A B�� ��ĭ�� ���̿� �ΰ� ����ϴµ�, �̴� A��° ž�� ���� ���� �ִ� ������ B��° ž�� ���� ���� �ű�ٴ� ���̴�.

���� �Է� 1 
3
���� ��� 1 
7
1 3
1 2
3 2
1 3
2 1
2 3
1 3*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11729 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		bw.write((int)Math.pow(2, n)-1 + "\n");
		
		Hanoi(n,1,2,3);
		
		bw.flush();
		br.close();
	}
	

	private static void Hanoi(int n, int from, int by, int to) throws IOException {
		// TODO Auto-generated method stub
	    if (n == 1)
	        bw.write(from +" "+ to + "\n");
	    else
	    {
	        Hanoi(n - 1, from, to, by);
	        bw.write(from +" "+ to + "\n");
	        Hanoi(n - 1, by, from, to);
	    }
	}
}
