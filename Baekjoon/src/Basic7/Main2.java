package Basic7;

//���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. ������ ���ĺ��� ���ؼ�, �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, ���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String A = scan.nextLine();	
		int Alpa[] = new int[26];
		
		for(int i=0; i<26; i++) {
			Alpa[i] = -1;
		}
		
		for(int i=0; i<A.length(); i++) {
			if(Alpa[A.charAt(i)-97] == -1) {
				Alpa[A.charAt(i)-97]= i;
			}
		}
		
		for(int i=0; i<26; i++) {
			System.out.print(Alpa[i] +" ");
		}
		
		scan.close();
	}
}
