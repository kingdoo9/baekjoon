package Basic6; // 1152��
//���� ��ҹ��ڿ� ���⸸���� �̷���� ������ �־�����. �� ���忡�� �� ���� �ܾ ������? �̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = new String();
		word = scan.nextLine();
		
		int space = 0;
		
		if(word.charAt(0) == ' ') space--;
		if(word.charAt(word.length()-1) == ' ')space--;
			
		for(int i =0 ; i<word.length(); i++) {
			if( word.charAt(i) == ' ') {
				space = space + 1;
			}
		}
		
		

		System.out.println(space+1);
		
		scan.close();
	}
}
