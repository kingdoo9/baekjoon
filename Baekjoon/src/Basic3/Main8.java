package Basic3;
//������ 2007�� 1�� 1�� �������̴�. �׷��ٸ� 2007�� x�� y���� ���� �����ϱ�? �̸� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
import java.util.Scanner;

public class Main8 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String A[] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		int B[] = {31,28,31,30,31,30,31,31,30,31,30};
		int Month = 0, Day=0, result=0;
		
		if(scan.hasNext()) Month = scan.nextInt();
		if(scan.hasNext()) Day = scan.nextInt();
		
		for(int i=1; i<Month; i++) {
			result = result + B[i-1];
		}
		
		result = (result + Day)%7;
		System.out.println(A[result]);
		
		scan.close();
		
	}
}
