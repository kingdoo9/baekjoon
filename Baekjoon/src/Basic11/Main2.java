package Basic11; // 1874번
//스택 (stack)은 기본적인 자료구조 중 하나로, 컴퓨터 프로그램을 작성할 때 자주 이용되는 개념이다. 스택은 자료를 넣는 (push) 입구와 자료를 뽑는 (pop) 입구가 같아 제일 먼저 들어간 자료가 제일 나중에 나오는 (FILO, first in last out) 특성을 가지고 있다.
//1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다. 이때, 스택에 push하는 순서는 반드시 오름차순을 지키도록 한다고 하자. 임의의 수열이 주어졌을 때 스택을 이용해 그 수열을 만들 수 있는지 없는지, 있다면 어떤 순서로 push와 pop 연산을 수행해야 하는지를 알아낼 수 있다. 이를 계산하는 프로그램을 작성하라.
//입력 
//첫 줄에 n (1 ≤ n ≤ 100,000)이 주어진다. 둘째 줄부터 n개의 줄에는 수열을 이루는 1이상 n이하의 정수가 하나씩 순서대로 주어진다. 물론 같은 정수가 두 번 나오는 일은 없다.

import java.util.Scanner;
import java.util.Stack;

public class Main2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] Num = new int[T+1]; // 입력 수열을 받는 배열
		Stack<Integer> st = new Stack<>(); // stack 생성
		String[]Answer = new String[T*2]; // 스택의 + -출력을 저장하는 배열
		
		for(int i=1; i<T+1; i++) { // 입력을통해 수열 저장
			Num[i] = sc.nextInt();
		}
		
		int j=1; //stack에 차례로 push하는 변수
		int k=0; //출력 배열의 인자 (1개의 수에 + - 두개가 필요하므로 T보다 *2배 사용된다)
		
		for(int i=1; i<T+1; i++) {
			for(; j<=Num[i]; j++) { // 입력 수열과 같을때까지 계속 push받음
				Answer[k] ="+"; // 출력배열에 +저장
				k++;
				st.push(j);
			}
			if(st.peek() == Num[i]) { // 입력 수열과 같다면 POP연산 수행
				Answer[k] ="-"; // 출력배열에 -저장
				k++;
				st.pop();
			}
		}
		
		if(st.empty()==true) { // 스택이 전부 나갔다면 => 수열이 성립됬다면 배열출력
			for(int i=0; i<k; i++) System.out.println(Answer[i]);
		}else {
			System.out.println("NO");
		}
		sc.close();
	}
}
