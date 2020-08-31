package Basic09_Fin; //1193번
//무한히 큰 배열에 다음과 같이 분수들이 적혀있다.
//이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
//X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
import java.util.Scanner;

public class Q1193 {
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
