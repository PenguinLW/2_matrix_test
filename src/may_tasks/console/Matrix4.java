package may_tasks.console;
import java.util.*;
import static com.array_methods.mfi_2z.MatrixMethods.*;
import static com.array_methods.mfi_2z.VectorMethods.*;
public class Matrix4 {
	private static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int m, n;
		int[] mass;
		int[][] arr;
		System.out.print("m: ");
		m = in.nextInt();
		System.out.print("n: ");
		n = in.nextInt();
		mass = new int[n];
		mass = randomValue(mass);
		System.out.println(arrPrint(mass));
		arr = new int[m][n];
		for(int i = 0; i <= arr.length-1; i++)
			arr[i] = arrCopy(mass);
		System.out.println(arrPrint(arr));
	}
}
