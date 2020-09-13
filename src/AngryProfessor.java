public class AngryProfessor {

  public static void main(String[] args) {
    int k = 3;
    int[] a = {-1, -3, 4, 2};
    int k2 = 2;
    int[] a2 = {0, -1, 2, 1};
    System.out.println(angryProfessor(k, a));
    System.out.println(angryProfessor(k2, a2));

  }

  private static String angryProfessor(int k, int[] a) {
    int counter = 0;
    for (Integer number : a) {
      if (number <= 0) {
        counter++;
      }
    }
    return counter >= k ? "NO" : "YES";
  }
}
