import java.util.Scanner;

public class PrimalityTest {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println(scanner.nextBigInteger().isProbablePrime(1) ? "prime" : "not prime" );
  }
}
