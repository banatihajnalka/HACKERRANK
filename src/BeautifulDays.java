import java.util.stream.IntStream;

public class BeautifulDays {

  public static void main(String[] args) {
//    int i = 20;
//    int j = 23;
//    int k = 6;
//    System.out.println(beautifulDays(i, j, k));
    System.out.println(beautifulDays(13, 45, 3));
    System.out.println(beautifulDays2(13, 45, 3));

  }

  private static int beautifulDays(int i, int j, int k) {
    int numberOfBeautifulDays = 0;
    for (int l = i; l <= j; l++) {
      int temp = l;
      int currentReversed = 0;
      while (temp != 0) {
        int digit = temp % 10;
        currentReversed = currentReversed * 10 + digit;
        temp /= 10;
      }
      if ((Math.abs(l - currentReversed)) % k == 0) {
        numberOfBeautifulDays++;
      }
    }
    return numberOfBeautifulDays;
  }

  private static int beautifulDays2(int i, int j, int k) {
    return (int) IntStream.range(i, j + 1)
        .filter(number -> isBeautiful(Math.abs((double) (number - reverse(number))) / k))
        .count();
  }

  private static boolean isBeautiful(double i) {
    return i % 1 == 0;
  }

  private static int reverse(int input) {
    return Integer.parseInt(new StringBuilder(Integer.toString(input)).reverse().toString());
  }
}
