package may_tasks.console;
import java.util.*;
import static com.array_methods.mfi_2z.MatrixMethods.*;
import static com.array_methods.mfi_2z.VectorMethods.*;
public class Matrix83 {
	private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
			int m;
			int[][] arr;
			System.out.print("m: ");
			m = in.nextInt();
			arr = new int[m][m];
			arr = randomValue(arr);
			System.out.println(arrPrint(arr));
	}
}
