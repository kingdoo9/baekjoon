package Q15000; // 15740번
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//입력 
//첫째 줄에 A와 B (-10^10000 ≤ A, B ≤ 10^10000)가 주어진다.
//출력 
//첫째 줄에 A+B를 출력한다.

import java.util.Scanner;

public class Q15740 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char[] A = new char[11001];
		char[] B = new char[11001];

		String N1 = sc.next();
		String N2 = sc.next();
		
		boolean zero = true;
		int D = 0; //0= 양수+양수 , 11=음수+양수(답이 음수), 12=음수+양수(답이 양수), 2=음수+음수
		
		//두 값중 어느것이 크고 어느것이 작은지 판별
		if(N1.charAt(0)=='-') {
			if(N2.charAt(0)=='-') {D = 2;}
			else { D=11;
				if(N1.length()-1<N2.length()) {
					String temp = N1;
					N1 = N2;
					N2 = temp;
					D=12;
				}else if(N1.length()-1 == N2.length()) {
					for(int i=0; i<N2.length(); i++) {
						if(N1.charAt(i+1) < N2.charAt(i)) {
							String temp = N1;
							N1 = N2;
							N2 = temp;
							D=12;
							break;
						}else if(N1.charAt(i+1) > N2.charAt(i)) break;
					}
				}
			}
		}else {
			if(N2.charAt(0)=='-') { D=12;
				if(N1.length()<N2.length()-1) {
					String temp = N1;
					N1 = N2;
					N2 = temp;
					D=11;
				}else if(N1.length() == N2.length()-1) {
					for(int i=0; i<N1.length(); i++) {
						if(N1.charAt(i) < N2.charAt(i+1)) {
							String temp = N1;
							N1 = N2;
							N2 = temp;
							D=11;
							break;
						}else if(N1.charAt(i) > N2.charAt(i+1)) break;
					}
				}
			}
		}
		
		// '-' 를 가지고있다면 제거
		if(N1.charAt(0)=='-')N1 = N1.substring(1);
		if(N2.charAt(0)=='-')N2 = N2.substring(1);
		
		//배열 초기화
		for( int i=0; i<11001; i++) { A[i] = '0'; B[i] = '0';}
		
		//입력받은 수의 우측정렬
		for(int i=1, j=11000; i<=N1.length(); i++, j--) {A[j] = N1.charAt(N1.length()-i);}
		for(int i=1, j=11000; i<=N2.length(); i++, j--) {B[j] = N2.charAt(N2.length()-i);}
		
		
		if(D == 0 || D == 2) {
			for(int i=11000; i>=0; i--) {
				A[i] = (char) (A[i] + B[i] - '0');
				if(A[i] > '9') { A[i-1]++; A[i]-=10;} //자릿수 넘김
			}
			
		}else {
			for(int i=11000; i>=0; i--) {
				A[i] = (char) (A[i] - B[i] + '0');
				if(A[i] < '0') { A[i-1]--; A[i]+=10;} //자릿수 넘김
			}
		}
		
		for(int i=0; i<=11000; i++) {
			if(A[i] != '0') zero =false;
		}
		
		if(zero) System.out.println("0");
		else {
			if(D==2 || D==11)System.out.print("-");
			
			for(int i=0; i<=11000; i++) {
				if(A[i] != '0') {
					for(int j=i; j<=11000; j++) {
						System.out.print(A[j]);
					}
					break;
				}
			}
			System.out.println();
		}
		sc.close();
		
	}
}
