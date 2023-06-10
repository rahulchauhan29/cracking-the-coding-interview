import java.util.HashMap;

public class UniqueCharacters {
  public static void main(String[] args) {
    String s1 = "safdfsafneowi";
    String s2 = "rahul";

    uniqueCharacter(s1);
    uniqueCharacter(s2);
  }

  private static void uniqueCharacter(String str) {
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
      map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
    }

    for (int value : map.values()) {
      if (value > 1) {
        System.out.println("String don't have unique character.");
        break;
      } else {
        System.out.println("String have all unique character.");
        break;
      }
    }
  }

}
