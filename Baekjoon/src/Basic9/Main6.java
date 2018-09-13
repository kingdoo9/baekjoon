package Basic9; //1181��

//�迭�� �����ϴ� ���� ����. ���� �־�����, �� ���� �� �ڸ����� ������������ �����غ���.
import java.util.Scanner;
import java.util.Arrays;

public class Main6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		String[] word = new String[N];
		
		for(int i=0; i<N; i++) {
			word[i] = scan.next();
		}
		
		Arrays.sort(word);
		
		//�ߺ��� �ܾ ������ �����ϰ� �ٽ� ����
		for(int i=0; i<N-1; i++) {
			if(word[i].matches(word[i+1])) {
				for(int j=i+1; j<N-1; j++) {
					word[j] = word[j+1];
				}
				N--;
				i--;
			}
		}
		
		for(int i=1; i<N; i++) { // �ܾ� ���� ��������
			String temp = word[i];
			int key = word[i].length();
			int j;
			
			for(j=i-1; j>=0 && word[j].length()>key; j--) {
				word[j+1] = word[j];
			}
			word[j+1] = temp;
		}
		
		//���
		for(int i=0; i<N; i++) {
			System.out.println(word[i]);
		}
		
		scan.close();
	}
}
