package Basic1; // 11718��
//�Է� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String Text;	
		
		while(scan.hasNextLine()) {
			Text = scan.nextLine();
			System.out.println(Text);
		}
		scan.close();
	}	
}