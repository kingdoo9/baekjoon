package Basic02_Fin; // 2753��
//������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� �� �̴�.
//�������, 2012���� 4�� ����� ����������, 1900���� 4�� ���������, 100�� ����̱� ������ ������ �ƴϴ�.
//������, 2000���� 400�� ����̱� ������ �����̴�.
//�Է� 
//ù° �ٿ� ������ �־�����. ������ 1���� ũ�ų� ����, 4000���� �۰ų� ���� �ڿ����̴�.
//��� 
//ù° �ٿ� �����̸� 1, �ƴϸ� 0�� ����Ѵ�.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q2753 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("00"); // 4 �� 04�� �ٲ���
		
		int N = sc.nextInt();
		int[] months = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		int y=2014, m=4, d=1;
		
		d += N; //�ϼ��� �Է¹��� ���� ���ϰ� ���ϼ����� ���ִ� ���
		
		while(months[m] < d) { 
			if(y%4==0 && (y%100!=0 || y%400==0)) months[2] = 29; //���ް��
			else months[2] = 28;
			
			d -= months[m];
			if(m==12) { y++; m=0;} //12���� ������ �⵵�� �ø��� ���� 1��
			m++;
			
		}
		
		System.out.println(y +"-"+ df.format(m) +"-"+ df.format(d));
		
		
		sc.close();
	}
}
