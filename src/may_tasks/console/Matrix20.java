package may_tasks.console;
import java.util.*;
import static com.array_methods.mfi_2z.MatrixMethods.*;
import static com.array_methods.mfi_2z.VectorMethods.*;
public class Matrix20 {
	private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int m, n;
		int[] mass;
		int[][] arr;
		System.out.print("m: ");
		m = in.nextInt();
		System.out.print("n: ");
		n = in.nextInt();
		arr = new int[m][n];
		arr = randomValue(arr);
		System.out.println(arrPrint(arr));
		mass = new int[n];
		for(int j = 0; j <= arr[0].length-1; j++){
			int product = 1;
			for(int i = 0; i <= arr.length-1; i++){
				product = arr[i][j];
			}
			mass[j] = product;
		}
		System.out.println(arrPrint(mass));
	}
}