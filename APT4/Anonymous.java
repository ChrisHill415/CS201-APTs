import java.util.*;

public class Anonymous {

      public int howMany(String[] headlines, String[] messages) {
            
            HashMap <Character,Integer> allLetters = new HashMap<>();
            int count = 0;
            String all = String.join(" ", headlines);
            for(char ch: all.toLowerCase().toCharArray())
            {
                int occ = allLetters.getOrDefault(ch,0);
                allLetters.put(ch,occ+1);
            }


            for(String s : messages)
                if (canMake(s, allLetters))
                {
                    count ++;
                }


            return count;
      }
   
    public boolean canMake(String s, HashMap<Character,Integer> allLetters)
    {

        HashMap <Character,Integer> map = new HashMap<>();
            for(char ch: s.toLowerCase().toCharArray())
            {
                int occ = map.getOrDefault(ch,0);
                map.put(ch,occ+1);
            }
            for(char c = 'a'; c <= 'z'; c++)
            {
                int have = allLetters.getOrDefault(c,0);
                int need = map.getOrDefault(c, 0);
                if(need > have) return false;
            }
        return true;
    }

}