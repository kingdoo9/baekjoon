package Q02000; // 2083번
//올 골드 럭비 클럽의 회원들은 성인부 또는 청소년부로 분류된다.
//나이가 17세보다 많거나, 몸무게가 80kg 이상이면 성인부이다. 그 밖에는 모두 청소년부이다. 클럽 회원들을 올바르게 분류하라.
//입력 
//각 줄은 이름과 두 자연수로 이루어진다. 두 자연수는 순서대로 나이와 몸무게를 나타낸다. 입력의 마지막 줄은 # 0 0 이다. 이 입력은 처리하지 않는다.
//출력 
//입력 받은 각 회원에 대해 이름과 분류를 출력한다. 성인부 회원이면 'Senior', 청소년부 회원이면 'Junior'를 출력한다.

import java.util.Scanner;

public class Q2083 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age, weight;
		
		while(true) {
			name = sc.next();
			if(name.matches("#"))break; //이름이 # 이면 루프나가기
			age = sc.nextInt();
			weight = sc.nextInt();
			
			if(age>17 || weight>=80)  System.out.println(name + " Senior");
			else System.out.println(name + " Junior");
		}
		
		sc.close();
	}
}
