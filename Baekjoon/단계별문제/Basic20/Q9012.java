package Basic20; // 9012번
//괄호 문자열(Parenthesis String, PS)은 두 개의 괄호 기호인 ‘(’ 와 ‘)’ 만으로 구성되어 있는 문자열이다. 그 중에서 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열(Valid PS, VPS)이라고 부른다. 한 쌍의 괄호 기호로 된 “( )” 문자열은 기본 VPS 이라고 부른다. 만일 x 가 VPS 라면 이것을 하나의 괄호에 넣은 새로운 문자열 “(x)”도 VPS 가 된다. 그리고 두 VPS x 와 y를 접합(concatenation)시킨 새로운 문자열 xy도 VPS 가 된다. 예를 들어 “(())()”와 “((()))” 는 VPS 이지만 “(()(”, “(())()))” , 그리고 “(()” 는 모두 VPS 가 아닌 문자열이다. 
//여러분은 입력으로 주어진 괄호 문자열이 VPS 인지 아닌지를 판단해서 그 결과를 YES 와 NO 로 나타내어야 한다. 
//입력 
//입력 데이터는 표준 입력을 사용한다. 입력은 T개의 테스트 데이터로 주어진다. 입력의 첫 번째 줄에는 입력 데이터의 수를 나타내는 정수 T가 주어진다. 각 테스트 데이터의 첫째 줄에는 괄호 문자열이 한 줄에 주어진다. 하나의 괄호 문자열의 길이는 2 이상 50 이하이다. 

import java.util.Scanner;
import java.util.Stack;

public class Q9012 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<T; i++) {
			Stack<Character> st = new Stack<>(); // 저장할 스택
			String A = sc.nextLine();
			boolean No = false;
			
			//스택에 입력이 '(' 라면 push ')' 라면 pop 수행
			for(int j=0; j<A.length(); j++) { 
				if(A.charAt(j) == '(') st.push('(');
				else if(A.charAt(j) == ')' && !st.empty()) st.pop(); // 비어있지 않다면 pop
				// 비어있는 상태에서 ')'은  VPS 문자열이 아니므로  break;
				else if(A.charAt(j) == ')' && st.empty()) {No = true; break;}
			}
			//연산이 끝나고 stack이 남아있다면 NO
			if(!st.empty()) No = true;
			
			if(No == false) System.out.println("YES");
			else System.out.println("NO");
		}
		sc.close();
	}
}
