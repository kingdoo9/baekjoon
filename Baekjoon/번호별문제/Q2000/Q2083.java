package Q2000; // 2083��
//�� ��� ���� Ŭ���� ȸ������ ���κ� �Ǵ� û�ҳ�η� �з��ȴ�.
//���̰� 17������ ���ų�, �����԰� 80kg �̻��̸� ���κ��̴�. �� �ۿ��� ��� û�ҳ���̴�. Ŭ�� ȸ������ �ùٸ��� �з��϶�.
//�Է� 
//�� ���� �̸��� �� �ڿ����� �̷������. �� �ڿ����� ������� ���̿� �����Ը� ��Ÿ����. �Է��� ������ ���� # 0 0 �̴�. �� �Է��� ó������ �ʴ´�.
//��� 
//�Է� ���� �� ȸ���� ���� �̸��� �з��� ����Ѵ�. ���κ� ȸ���̸� 'Senior', û�ҳ�� ȸ���̸� 'Junior'�� ����Ѵ�.

import java.util.Scanner;

public class Q2083 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age, weight;
		
		while(true) {
			name = sc.next();
			if(name.matches("#"))break; //�̸��� # �̸� ����������
			age = sc.nextInt();
			weight = sc.nextInt();
			
			if(age>17 || weight>=80)  System.out.println(name + " Senior");
			else System.out.println(name + " Junior");
		}
		
		sc.close();
	}
}
