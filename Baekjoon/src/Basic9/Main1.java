package Basic9;
//N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int Sort[] = new int[N];
		
		for(int i=0; i<N; i++) {
			Sort[i] = scan.nextInt();
		}
		
		for(int i=0; i<N-1; i++) { // ��������
			int temp;
			int least = i;
			
			for(int j=i+1; j<N; j++) {
				if(Sort[j] < Sort[least]) least = j;
			}
			temp = Sort[i];
			Sort[i] = Sort[least];
			Sort[least] = temp;
			
			System.out.println(Sort[i]);
		}
		
		System.out.println(Sort[N-1]);
		
		scan.close();
	}
}
