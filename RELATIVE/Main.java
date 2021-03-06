import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    for (int tc = 0; tc < T; ++tc) {
      int g = sc.nextInt();
      int c = sc.nextInt();

      System.out.println(solve(g, c));
    }

    sc.close();
  }

  static int solve(int g, int c) {
    return c * c / 2 / g;
  }
}
