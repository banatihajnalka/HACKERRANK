import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SherlockAndTheValidString {

  public static void main(String[] args) throws IOException {
    String s = "abcdefghhgfedecba";
    String s2 = "aabbccddeefghi";
    String s3 = "aaaaabc";
    String s4 = "aaaabbcc";
    String stringTooLong = new String(Files.readAllBytes(Paths.get("src/SherlockLongString.txt")), StandardCharsets.UTF_8);
//    System.out.println(isValid(s));
//    System.out.println(isValid(s2));
//    System.out.println(isValid(s3));
//    System.out.println(isValid(s4));
    System.out.println(isValid(stringTooLong));
  }

  private static String isValid(String s) {
    HashMap<Character, Integer> charsMap = new HashMap<>();
    for (Character character : s.toCharArray()) {
      if (!charsMap.containsKey(character)) {
        charsMap.put(character, 1);
      } else {
        charsMap.put(character, charsMap.get(character) + 1);
      }
    }
    HashMap<Integer, Integer> valueFrequency = new HashMap<>();
    Set<Integer> values = new HashSet<>();
    for (Map.Entry<Character, Integer> entry : charsMap.entrySet()) {
      values.add(entry.getValue());
      if (!valueFrequency.containsKey(entry.getValue())) {
        valueFrequency.put(entry.getValue(), 1);
      } else {
        valueFrequency.put(entry.getValue(), valueFrequency.get(entry.getValue()) + 1);
      }
    }

    boolean isValid = false;
    if (values.size() == 1) {
      isValid = true;
    }

    if (values.size() == 2) {
      List<Integer> charFrequencies = new ArrayList<>(charsMap.values());
      List<Integer> valueFrequencies = new ArrayList<>(valueFrequency.values());
      if (Collections.min(valueFrequencies) == 1 && (Collections.min(charFrequencies) % 2 == 1)) {
        isValid = true;
      }
      int counter = 0;
//      int first = charFrequencies.get(0);
      for (int i = 0; i < charFrequencies.size() ; i++) {
        if (charFrequencies.get(i) == 1) {
          counter++;
        }
      }
      if (counter > 1) {
        return "NO";
      }
      if (Collections.max(charFrequencies) - 1 == Collections.min(charFrequencies)) {
        isValid = true;
      }
    }
    return (isValid) ? "YES" : "NO";
  }
}

