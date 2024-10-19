package ClassWork;
import java.util.Map;
import java.util.HashMap;;
public class PracticeMap {public static void main(String[] args) {
    
    String someText = "I don't have any problems I";

    countWirds(someText);
    System.out.println(countWirds(someText));
}

private static Map <String, Integer> countWirds(String text){
    Map<String, Integer> res = new HashMap<>();
    String[] words = text.split(" "); 
    for (String word : words) {
        res.put(word, res.getOrDefault(words, 0) + 1);
        
    }
return res;
}

}
