package Basic08; //1475��

//�ټ��̴� �������� ������ ���� �̻�Դ�. �ټ��̴� �ڱ� �� ��ȣ�� ���� �ö�ƽ ���ڷ� ���� ���̷��� �Ѵ�.
//�ټ����� ���������� �ö�ƽ ���ڸ� �� ��Ʈ�� �Ǵ�. �� ��Ʈ���� 0������ 9������ ���ڰ� �ϳ��� ����ִ�. �ټ����� �� ��ȣ�� �־����� ��, �ʿ��� ��Ʈ�� ������ �ּҰ��� ����Ͻÿ�. (6�� 9�� ����� �̿��� �� �ְ�, 9�� 6�� ����� �̿��� �� �ִ�.)import java.util.Scanner;

import java.util.Scanner;

public class Main8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int Room = scan.nextInt();
		
		int Number[] = new int[10];
		int set =1;
		int temp;
		
		while(Room>0) {
			Number[Room%10]++;  // 0 ~ 9 �迭��  �ش� ���ڰ� ����������� ���
			Room /= 10;
		}
		
		temp = Number[6] + Number[9]; // 6�� 9�� �ٲܼ� ������ ����
		
		if(temp > 0 && temp%2 == 0)set = temp/2; // ���� 6�� 9�� �� ��Ʈ���� üũ
		else set = temp/2 +1;
		
		for(int i=0; i<10; i++) { // 6�� 9���� �ٸ����� ��Ʈ�� ���ٸ� ����
			if(Number[i] > set && i!=6 && i!=9) set = Number[i]; 
		}
		
		System.out.println(set);
		scan.close();	
	}
}
