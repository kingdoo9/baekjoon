package Basic6; // 2920��
//�������� c d e f g a b C, �� 8�� ������ �̷�����ִ�. �� �������� 8�� ���� ������ ���� ���ڷ� �ٲپ� ǥ���Ѵ�. c�� 1��, d�� 2��, ..., C�� 8�� �ٲ۴�.
//1���� 8���� ���ʴ�� �����Ѵٸ� ascending, 8���� 1���� ���ʴ�� �����Ѵٸ� descending, �� �� �ƴ϶�� mixed �̴�.
//������ ������ �־����� ��, �̰��� ascending����, descending����, �ƴϸ� mixed���� �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int Code[] = new int[8];
		int D =0;
			
		for(int i =0; i<8; i++) {
			Code[i] = scan.nextInt();
		}
		
		
		for(int i =0; i<7 ; i++) {
			if(Code[i] == Code[i+1]-1) {
				D = 1;
			}else if(Code[i] == Code[i+1]+1) {
				D = 2;
			}else { D = 0; break;}
		}
		
		if(D == 0) System.out.println("mixed");
		if(D == 1) System.out.println("ascending");
		if(D == 2) System.out.println("descending");
		
		scan.close();
	}
}
