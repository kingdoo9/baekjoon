package Basic8; //1193��
//������ ū �迭�� ������ ���� �м����� �����ִ�.
//�̿� ���� ������ �м����� 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> �� �� ���� ������� ������ ���ʴ�� 1��, 2��, 3��, 4��, 5��, �� �м���� ����.
//X�� �־����� ��, X��° �м��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		
		int A=1 , B=1, limit=1;
		boolean odd = false;
		
		for(int i=1; i<count; i++) {
			if(A==1 && odd == false){
				limit++; B = limit; odd = true; continue;}
			else if(B==1 && odd == true){
				limit++; A = limit; odd = false; continue;}
			else if(odd == true) {A++; B--; continue;}
			else{A--; B++;}
		}

		System.out.println(A+"/"+B);
		scan.close();
	}
}
