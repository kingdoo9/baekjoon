package Basic08_Fin; //2675번

//문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 T를 만든 후 출력하는 프로그램을 작성하시오.
//다시 설명하자면, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 T를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
//QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ$%*+-./: 이다.
import java.util.Scanner;

public class Q2675 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i=0; i<T; i++) {	
			int R = scan.nextInt();
			String A = scan.next();
			
			for(int j=0; j<A.length(); j++) {
			
				for(int k=0; k<R; k++) {
					System.out.print(A.charAt(j));
				
				}
			}
			System.out.println();
		
		}
		scan.close();
	}
}
