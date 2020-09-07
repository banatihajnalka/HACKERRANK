import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringConstruction {

  public static void main(String[] args) {
    String s = "abcd";
    String s2 = "abab";
    System.out.println(stringConstruction(s));
    System.out.println(stringConstruction(s2));
  }

  private static int stringConstruction(String s) {

    Set<Character> chars = new HashSet<>();
    for (Character ch : s.toCharArray()) {
      chars.add(ch);
    }
    return chars.size();
  }
}
