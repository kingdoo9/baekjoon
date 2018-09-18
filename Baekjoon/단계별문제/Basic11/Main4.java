package Basic11; // 2504번
//4개의 기호 ‘(’, ‘)’, ‘[’, ‘]’를 이용해서 만들어지는 괄호열 중에서 올바른 괄호열이란 다음과 같이 정의된다.
//한 쌍의 괄호로만 이루어진 ‘()’와 ‘[]’는 올바른 괄호열이다. 
//만일 X가 올바른 괄호열이면 ‘(X)’이나 ‘[X]’도 모두 올바른 괄호열이 된다. 
//X와 Y 모두 올바른 괄호열이라면 이들을 결합한 XY도 올바른 괄호열이 된다.
//예를 들어 ‘(()[[]])’나 ‘(())[][]’ 는 올바른 괄호열이지만 ‘([)]’ 나 ‘(()()[]’ 은 모두 올바른 괄호열이 아니다. 우리는 어떤 올바른 괄호열 X에 대하여 그 괄호열의 값(괄호값)을 아래와 같이 정의하고 값(X)로 표시한다. 
//‘()’ 인 괄호열의 값은 2이다.
//‘[]’ 인 괄호열의 값은 3이다.
//‘(X)’ 의 괄호값은 2×값(X) 으로 계산된다.
//‘[X]’ 의 괄호값은 3×값(X) 으로 계산된다.
//올바른 괄호열 X와 Y가 결합된 XY의 괄호값은 값(XY)= 값(X)+값(Y) 로 계산된다.
//예를 들어 ‘(()[[]])([])’ 의 괄호값을 구해보자.  ‘()[[]]’ 의 괄호값이 2 + 3×3=11 이므로  ‘(()[[ ]])’의 괄호값은 2×11=22 이다. 그리고  ‘([])’의 값은 2×3=6 이므로 전체 괄호열의 값은 22 + 6 = 28 이다.
//여러분이 풀어야 할 문제는 주어진 괄호열을 읽고 그 괄호값을 앞에서 정의한대로 계산하여 출력하는 것이다. 
//입력 
//첫째 줄에 괄호열을 나타내는 문자열(스트링)이 주어진다. 단 그 길이는 1 이상, 30 이하이다.

import java.util.Scanner;
import java.util.Stack;

public class Main4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Stack<Character> st = new Stack<>();

		char[] ch = sc.next().toCharArray();
		int ans=0, temp=1;
		
		for(int i=0; i<ch.length; i++) {
			if(ch[i]=='(' ||ch[i]=='[') {
				//괄호가 열리면 temp에 값을 저장
				temp = ch[i]=='('? temp*2:temp*3;
				st.push(ch[i]);
				//다음 문자가 괄호가 닫히는거라면 지금가지 연산한 값을 ans에 저장
				if(ch[i]=='('&&ch[i+1]==')'||ch[i]=='['&&ch[i+1]==']') ans+=temp;
			}else {
				if(st.isEmpty()){ans=0; break;}//올바르지 않는 괄호열
				//괄호가 닫히는 만큼 나누는 연산을 temp에 진행
				if(ch[i]==')'&&st.peek()=='('||ch[i]==']'&&st.peek()=='[') {
					temp=ch[i]==')'?temp/2:temp/3;
					st.pop();
				}else { ans=0; break;}
			}
		}
		System.out.println(st.isEmpty()?ans:0);
		sc.close();
	}
}
