package Basic09; //2751번
//N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int Sort[] = new int[N];
		int Sorted[] = new int[N];
		
		for(int i=0; i<N; i++) {
			Sort[i] = scan.nextInt();
		}
		
		merge_sort(Sort, 0, N-1, Sorted ); // 병합정렬
		
		for(int i=0; i<N; i++) {
			System.out.println(Sort[i]);
		}	
		scan.close();
	}

	private static void merge_sort(int[] list, int left, int right, int[] sorted) {
		int mid;
		if(left<right) {
			mid = (left+right)/2;
			merge_sort(list, left, mid, sorted);
			merge_sort(list, mid+1, right, sorted);
			merge(list, left, mid, right, sorted); //합병
		}
	}

	private static void merge(int list[], int left, int mid, int right, int sorted[]) {
		int i,j,k,l;
		i = left; j= mid+1; k=left;
		
		while(i<=mid && j<=right) {
			if(list[i] <= list[j]) sorted[k++] = list[i++];
			else sorted[k++] = list[j++];
		}
		if(i>mid)
			for(l=j; l<=right; l++) sorted[k++] = list[l];
		else
			for(l=i; l<=mid; l++) sorted[k++] = list[l];
		
		for(l=left; l<=right; l++) list[l] = sorted[l];
		
	}	
}
