package Basic3;
//���������� for�� ������ Ǯ�� ���� �����ؾ� �� ���� �ִ�. ����� ����� ������ ���� ���� �Է¹ްų� ����� �� �ð��ʰ��� �� �� �ִٴ� ���̴�.
//C++�� ����ϰ� �ְ� cin/cout�� ����ϰ��� �Ѵٸ�, cin.tie(NULL)�� sync_with_stdio(false)�� �� �� ������ �ְ�, endl ��� ���๮��(\n)�� ����. ��, �̷��� �ϸ� �� �̻� scanf/printf/puts/getchar/putchar �� C�� ����� ����� ����ϸ� �� �ȴ�.
//Java�� ����ϰ� �ִٸ�, Scanner�� System.out.println ��� BufferedReader�� BufferedWriter�� ����� �� �ִ�. BufferedWriter.flush�� �� �������� �� ���� �ϸ� �ȴ�.
//Python�� ����ϰ� �ִٸ�, input ��� sys.stdin.readline�� ����� �� �ִ�. ��, �� ���� �� ���� ���๮�ڱ��� ���� �Է¹ޱ� ������ ���ڿ��� �����ϰ� ���� ��� .rstrip()�� �߰��� �� �ִ� ���� ����.
//���� �Է°� ��� ��Ʈ���� �����̹Ƿ�, �׽�Ʈ���̽��� ���� �Է¹޾Ƽ� ������ �� ���� ����� �ʿ�� ����. �׽�Ʈ���̽��� �ϳ� ���� �� �ϳ� ����ص� �ȴ�.
import java.util.Scanner;

public class Main12Another {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A,B,num;
		
		num = scan.nextInt();
		
		while(num>0) {
			A=scan.nextInt();
			B=scan.nextInt();
			
			System.out.println(A+B);
			num--;
		}
		scan.close();
	}
}
