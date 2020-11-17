package test;
import java.util.*;
import static com.array_methods.mfi_2z.MatrixMethods.*;
import static com.array_methods.mfi_2z.VectorMethods.*;
public class Test83 {
	private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int m;
		int[][] arr;
		System.out.print("m: ");
		m = in.nextInt();
		arr = new int[m][m];
		arr = randomValue(arr);
		System.out.println(arrPrint(arr));
//		элементы главной диагонали
		System.out.print("Элементы главной диагонали: ");
		for(int i = 0; i<= arr.length-1; i++){
			System.out.print(arr[i][i]);
			if(i < arr.length-1)
				System.out.print(", ");
		}
		System.out.println();
//		элементы побочной диагонали
		System.out.print("Элементы побочной диагонали: ");
		for(int i = 0, j = arr.length-1; i<= arr.length-1; i++, j--){
			System.out.print(arr[i][j]);
			if(i < arr.length-1)
				System.out.print(", ");
		}
		System.out.println();
//		элементы над побочной диагональю
		System.out.print("Элементы над побочной диагональю: ");
		for(int i = 0; i <= arr.length-1; i++){
			for(int j = 0; j < (arr.length-1)-i; j++){
				System.out.print(arr[i][j] + "\t");
			}
		}
		System.out.println();
//		элементы над побочной диагональю
		System.out.print("Элементы над побочной диагональю: ");
		for(int i = arr.length-1; i >= 0; i--){
			for(int j = 0; j < (arr.length-1)-i; j++){
				System.out.print(arr[i][j] + "\t");
			}
		}
		System.out.println();
//		элементы под побочной диагональю
		System.out.print("Элементы под побочной диагональю: ");
		for(int i = arr.length-1, k = 0; i >= 0; i--){
			for(int j = (arr[0].length-1); j > k; j--){
				System.out.print(arr[i][j] + "\t");
			}
			k++;
		}
	}
}