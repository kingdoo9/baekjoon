package Basic19; // 9375��
//�غ��̴� �мǿ� �ſ� �ΰ��ؼ� �ѹ� �Ծ��� �ʵ��� ������ ���� �ٽ� ���� �ʴ´�. ���� ��� ���� �غ��̰� �Ȱ�, ��Ʈ, ����, �Ź��� �Ծ��ٸ�, �������� ������ �߰��� �԰ų� �Ȱ��� ��� �����ϰų� �ؾ��Ѵ�. �غ��̰� ���� �ǻ���� �־������� ���� �غ��̴� �˸��� �ƴ� ���·� ��ĥ���� �ۿ� ���ƴٴ� �� ������?
//�Է� 
//ù° �ٿ� �׽�Ʈ ���̽��� �־�����. �׽�Ʈ ���̽��� �ִ� 100�̴�.
//�� �׽�Ʈ ���̽��� ù° �ٿ��� �غ��̰� ���� �ǻ��� �� n(0 �� n �� 30)�� �־�����.
//���� n������ �غ��̰� ���� �ǻ��� �̸��� �ǻ��� ������ �������� ���еǾ� �־�����. ���� ������ �ǻ��� �ϳ��� ���� �� �ִ�.
//��� ���ڿ��� 1�̻� 20������ ���ĺ� �ҹ��ڷ� �̷���������� ���� �̸��� ���� �ǻ��� �������� �ʴ´�.
//��� 
//�� �׽�Ʈ ���̽��� ���� �غ��̰� �˸��� �ƴ� ���·� �ǻ��� ���� �� �ִ� ��츦 ����Ͻÿ�.

import java.util.Scanner;

public class Q9375 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) { //�׽�Ʈ���̽� �ݺ�
			
			int N = sc.nextInt();
			sc.nextLine();
			String[][] cloths = new String[N][2];
			String[][] Number = new String[N][2];
			int Result = 1;
			
			for(int j=0; j<N; j++) { //���� ���� �ݺ�
				cloths[j] = sc.nextLine().split(" ");
				Number[j][1] = "";
			}
			
			for(int j=0; j<N; j++) { //�Ȱ��� �̸��� �����ִٸ� Number�迭 2���� i�� ������ �߰�
				for(int k=0; k<N; k++) {
					if(Number[k][0] != null && cloths[j][1].matches(Number[k][0])) {
						Number[k][1] += "i";
						break;
					}else if(Number[k][0] == null) {
						Number[k][0] = cloths[j][1];
						Number[k][1] += "i";
						break;
					}
				}
			}
			//����� ���� ��� ���� ����+1 �� ���� ���ϰ� ������ -1�� �ϸ� ���� ���´�.
			for(int j=0; j<N; j++) {
				Result *= Number[j][1].length()+1;
			}
			
			System.out.println(Result-1);	
		}
			
		sc.close();
	}

}
