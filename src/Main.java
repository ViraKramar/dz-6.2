import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String myString = "Many nice words for Java!";
        char[] chars = myString.toCharArray();
        Set<Character> mySet = new HashSet<>();

        for (int i = 0; i < myString.length(); i++){
            mySet.add(chars[i]);
        }
        mySet.forEach(System.out::println);
    }
}