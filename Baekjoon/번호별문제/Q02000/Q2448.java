package Q02000; // 2448번
//예제를 보고 별찍는 규칙을 유추한 뒤에 별을 찍어 보세요.
import java.util.Scanner;

public class Q2448 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
         
        String map[] = new String[n];
        map[0] = "  *  ";
        map[1] = " * * ";
        map[2] = "*****";
         
        for (int k = 1; 3 * (int)Math.pow(2, k) <= n; k++) {
            makeBigStar(k, map);
        }
         
        for (int i = 0; i < n; i++) {
            System.out.println(map[i]);
        }
    }
    private static void makeBigStar(int k, String map[]) {
        int bottom = 3 * (int)Math.pow(2, k);
        int middle = bottom / 2;
         
        for (int i = middle; i < bottom; i++) {
            map[i] = map[i - middle] + " " + map[i -middle];
        }
         
        String space = "";
        while (space.length() < middle) {
            space += " ";
        }
        for (int i = 0; i < middle; ++i) {
            map[i] = space + map[i] + space;
        }
    }
}
	
