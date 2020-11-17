package may_tasks.console;
import java.util.*;
import static com.array_methods.mfi_2z.MatrixMethods.*;
import static com.array_methods.mfi_2z.VectorMethods.*;
public class Matrix49 {
	private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
			int m, n;
			int[][] arr;
			System.out.print("m: ");
			m = in.nextInt();
			System.out.print("n: ");
			n = in.nextInt();
			arr = new int[m][n];
			arr = randomValue(arr);
			System.out.println(arrPrint(arr));
			for(int i = 0; i<= arr.length-1; i++){
				changeMinWithMax(arr[i]);
			}
			System.out.println(arrPrint(arr));
	}
}
