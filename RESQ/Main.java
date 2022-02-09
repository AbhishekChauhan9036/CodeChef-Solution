import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();

			System.out.println(solve(N));
		}

		sc.close();
	}

	static int solve(int N) {
		int result = N - 1;
		for (int i = 2; i * i <= N; i++) {
			if (N % i == 0) {
				result = N / i - i;
			}
		}
		return result;
	}
}
