//1153A
import java.util.Scanner;

public class Serval {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int t = sc.nextInt();
		int[] s = new int[n];
		int[] d = new int[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
    int minTime = Integer.MAX_VALUE;
    int pos = -1;
    for (int i = 0; i < s.length; i++) {
      int time = divide(t - s[i], d[i]) * d[i] + s[i];

      if (time < minTime) {
        minTime = time;
        pos = i + 1;
      }
    }
    System.out.println(pos);
  }
  static int divide(int a, int b) {
		if (a < 0) {
			return 0;
		}

		return a / b + (a % b == 0 ? 0 : 1);
	}
	}
