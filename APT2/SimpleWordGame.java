import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SimpleWordGame {
      public int points(String[] player, String[] dictionary) 
      {
        List<String> chris = Arrays.asList(dictionary);
        Set<String> set = new HashSet<>(Arrays.asList(player)); 
        int count = 0;

        for(String play : set)
        {
            if(chris.contains(play))
            {
                count += (play.length() * play.length());
            }
        }



          return count;
      }
  }