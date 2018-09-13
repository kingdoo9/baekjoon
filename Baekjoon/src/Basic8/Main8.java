package Basic8; //1475번

//다솜이는 은진이의 옆집에 새로 이사왔다. 다솜이는 자기 방 번호를 예쁜 플라스틱 숫자로 문에 붙이려고 한다.
//다솜이의 옆집에서는 플라스틱 숫자를 한 세트로 판다. 한 세트에는 0번부터 9번까지 숫자가 하나씩 들어있다. 다솜이의 방 번호가 주어졌을 때, 필요한 세트의 개수의 최소값을 출력하시오. (6은 9를 뒤집어서 이용할 수 있고, 9는 6을 뒤집어서 이용할 수 있다.)import java.util.Scanner;

import java.util.Scanner;

public class Main8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int Room = scan.nextInt();
		
		int Number[] = new int[10];
		int set =1;
		int temp;
		
		while(Room>0) {
			Number[Room%10]++;  // 0 ~ 9 배열에  해당 숫자가 몇번쓰였는지 기록
			Room /= 10;
		}
		
		temp = Number[6] + Number[9]; // 6과 9는 바꿀수 있으니 모음
		
		if(temp > 0 && temp%2 == 0)set = temp/2; // 모은 6과 9가 몇 세트인지 체크
		else set = temp/2 +1;
		
		for(int i=0; i<10; i++) { // 6과 9보다 다른숫자 세트가 많다면 갱신
			if(Number[i] > set && i!=6 && i!=9) set = Number[i]; 
		}
		
		System.out.println(set);
		scan.close();	
	}
}
