public class Kangaroo {

  public static void main(String[] args) {
    int x1 = 0;
    int v1 = 2;
    int x2 = 5;
    int v2 = 3;
    System.out.println(kangaroo(x1, v1, x2, v2));
  }

  private static String kangaroo(int x1, int v1, int x2, int v2) {
    return (v1 > v2 && ((x1 - x2) % (v1 - v2)) == 0) ? "YES" : "NO";
  }
}
