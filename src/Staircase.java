import java.util.Arrays;

public class Staircase {

  public static void main(String[] args) {
    int n = 6;
    printStaircase(n);
  }

  private static void printStaircase(int n) {
    char[] staircase = new char[n];
    Arrays.fill(staircase, ' ');
    int i = 0;
    for (i = 1; i < n + 1; i++) {
      staircase[n - i] = '#';
      System.out.println(staircase);
    }
  }
}
