import java.util.ArrayList;
public class Starter {
     public int begins(String[] words, String first) {
        int count = 0;
        ArrayList<String> seen = new ArrayList<>();
         for(int i = 0; i < words.length; i++)
         {
            if(words[i].substring(0,1).equals(first) && !seen.contains(words[i]))
            {
                seen.add(words[i]);
                count++;
            }
         }

        return count;
     }
 }