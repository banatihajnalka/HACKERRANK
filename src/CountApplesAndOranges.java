public class CountApplesAndOranges {

  public static void main(String[] args) {
    int s = 7;
    int t = 11;
    int a = 5;
    int b = 15;
    int[] apples = {-2, 2, 1};
    int[] oranges = {5, -6};
    countApplesAndOranges(s, t, a, b, apples, oranges);

  }

  private static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
    int appleCounter = 0;
    for (int i = 0; i < apples.length; i++) {
      apples[i] += a;
      if (apples[i] >= s && apples[i] <= t) {
        appleCounter++;
      }
    }
    int orangeCounter = 0;
    for (int i = 0; i < oranges.length; i++) {
      oranges[i] += b;
      if (oranges[i] >= s && oranges[i] <= t) {
        orangeCounter++;
      }
    }
    System.out.println(appleCounter);
    System.out.println(orangeCounter);
  }
}
