package Basic5; // 1065번
//어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
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
	
