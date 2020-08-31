import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GameOfThrones {

  public static void main(String[] args) {

    String s = "aaabbbb";
    System.out.println(gameOfThrones(s));
  }

  private static String gameOfThrones(String s) {
    char[] stringChars = s.toCharArray();

    HashMap<Character, Integer> charMap = new HashMap<>();
    for (Character character : stringChars) {
      if (charMap.containsKey(character)) {
        charMap.put(character, charMap.get(character) + 1);
      } else {
        charMap.put(character, 1);
      }
    }

    Iterator<Map.Entry<Character, Integer>> i = charMap.entrySet().iterator();
    int odd = 0;
    while (i.hasNext()) {
      Map.Entry<Character, Integer> entry = i.next();
      Integer value = entry.getValue();
      if (value % 2 == 0) ;
      else {
        odd++;
      }
    }
    return ((odd == 0 || odd == 1) ? "YES" : "NO");
  }
}

