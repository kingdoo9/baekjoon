package Basic5;
//� ���� ���� X�� �ڸ����� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�. ���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�. N�� �־����� ��, 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char N[];
		N = scan.next().toCharArray();	

		
		int temp = Integer.parseInt(String.valueOf(N));
		int Number[];
		int result = 99;
		boolean R = false;
		
		if(temp < 100) {
			System.out.println(N);
		}else {
			for(int i=100; i<=temp; i++) {
				R=false;
				Number = NumberINPUT(i);
				for(int j=0; j<Number.length-2; j++) {
					if(Number[j] - Number[j+1] == Number[j+1] - Number[j+2]) {
						R = true;
					}else R=false;
				}
				if(R==true) result++;
			}
			System.out.println(result);
		}
		
		scan.close();

		}

	private static int[] NumberINPUT(int i) {
		int Num[] = new int[3];
		Num[0] = i/100;
			i %= 100;
		Num[1] = i/10;
			i %= 10;
		Num[2] = i/1;
				
		return Num;
	}
}
	
