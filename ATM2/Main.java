import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] A = new int[N];
			for (int i = 0; i < A.length; i++) {
				A[i] = sc.nextInt();
			}

			System.out.println(solve(A, K));
		}

		sc.close();
	}

	static String solve(int[] A, int K) {
		StringBuilder result = new StringBuilder();

		for (int element : A) {
			if (element <= K) {
				result.append('1');
				K -= element;
			} else {
				result.append('0');
			}
		}

		return result.toString();
	}
}
