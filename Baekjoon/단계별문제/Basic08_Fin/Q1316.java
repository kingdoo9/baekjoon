package Basic08_Fin; //1316��
//�׷� �ܾ�� �ܾ �����ϴ� ��� ���ڿ� ���ؼ�, �� ���ڰ� �����ؼ� ��Ÿ���� ��츸�� ���Ѵ�. ���� ���, ccazzzzbb�� c, a, z, b�� ��� �����ؼ� ��Ÿ����, kin�� k, i, n�� �����ؼ� ��Ÿ���� ������ �׷� �ܾ�������, aabbbccb�� b�� �������� ��Ÿ���� ������ �׷� �ܾ �ƴϴ�.
//�ܾ� N���� �Է����� �޾� �׷� �ܾ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.


import java.util.Scanner;

public class Q1316 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		int group = 0, result = count;
		
		for(int i=0; i< count; i++) {
			String word = scan.next();
			int alpa[] = new int[26];
			
			for(int j=0; j<word.length(); j++) {
				if(alpa[word.charAt(j) - 'a'] == 0) {
					alpa[word.charAt(j) - 'a']++;
					group = word.charAt(j);
					continue;
				}else if(alpa[word.charAt(j) - 'a'] != 0 && group == word.charAt(j)) {
					alpa[word.charAt(j) - 'a']++;
					continue;
				}else {
					result--;
					break;
				}
			}
		}
		
		System.out.println(result);
		scan.close();
	}
}
