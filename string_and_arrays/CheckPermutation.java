import java.util.HashMap;

//Check Permutation : Given two strings, write a method to decide if one is permutation of the other.

public class CheckPermutation {

  public static void main(String[] args) {
    checkPermutation("abcdefg","dsfrwe");
    checkPermutation("abcdefg","efgdbac");
  }
  private static void checkPermutation(String input1, String input2){
    if(input1.length()!=input2.length()){
      System.out.println("both string are not permutations of each other");
    }
    else{
      HashMap<Character,Integer> map1=new HashMap<>();
      for (int i=0;i<input1.length();i++){
        if(!map1.containsKey(input1.charAt(i))){
          map1.put(input1.charAt(i),map1.getOrDefault(input1.charAt(i),0)+1);
        }
      }
      HashMap<Character,Integer> map2=new HashMap<>();
      for (int i=0;i<input2.length();i++){
        if(!map2.containsKey(input2.charAt(i))){
          map2.put(input2.charAt(i),map2.getOrDefault(input2.charAt(i),0)+1);
        }
      }
      if(map1.equals(map2)){
        System.out.println("Both string are permutation of each other.");
      }
    }

  }
}
