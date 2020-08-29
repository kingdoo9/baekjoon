package Basic19; // 9375번
//해빈이는 패션에 매우 민감해서 한번 입었던 옷들의 조합을 절대 다시 입지 않는다. 예를 들어 오늘 해빈이가 안경, 코트, 상의, 신발을 입었다면, 다음날은 바지를 추가로 입거나 안경대신 렌즈를 착용하거나 해야한다. 해빈이가 가진 의상들이 주어졌을때 과연 해빈이는 알몸이 아닌 상태로 며칠동안 밖에 돌아다닐 수 있을까?
//입력 
//첫째 줄에 테스트 케이스가 주어진다. 테스트 케이스는 최대 100이다.
//각 테스트 케이스의 첫째 줄에는 해빈이가 가진 의상의 수 n(0 ≤ n ≤ 30)이 주어진다.
//다음 n개에는 해빈이가 가진 의상의 이름과 의상의 종류가 공백으로 구분되어 주어진다. 같은 종류의 의상은 하나만 입을 수 있다.
//모든 문자열은 1이상 20이하의 알파벳 소문자로 이루어져있으며 같은 이름을 가진 의상은 존재하지 않는다.
//출력 
//각 테스트 케이스에 대해 해빈이가 알몸이 아닌 상태로 의상을 입을 수 있는 경우를 출력하시오.

import java.util.Scanner;

public class Q9375 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) { //테스트케이스 반복
			
			int N = sc.nextInt();
			sc.nextLine();
			String[][] cloths = new String[N][2];
			String[][] Number = new String[N][2];
			int Result = 1;
			
			for(int j=0; j<N; j++) { //옷의 종류 반복
				cloths[j] = sc.nextLine().split(" ");
				Number[j][1] = "";
			}
			
			for(int j=0; j<N; j++) { //똑같은 이름의 옷이있다면 Number배열 2열에 i의 개수를 추가
				for(int k=0; k<N; k++) {
					if(Number[k][0] != null && cloths[j][1].matches(Number[k][0])) {
						Number[k][1] += "i";
						break;
					}else if(Number[k][0] == null) {
						Number[k][0] = cloths[j][1];
						Number[k][1] += "i";
						break;
					}
				}
			}
			//경우의 수는 모든 옷의 종류+1 을 전부 곱하고 마지막 -1을 하면 답이 나온다.
			for(int j=0; j<N; j++) {
				Result *= Number[j][1].length()+1;
			}
			
			System.out.println(Result-1);	
		}
			
		sc.close();
	}

}
