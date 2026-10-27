import java.util.*;

public class MemberCheck {
      public String[] whosDishonest(String[] club1, String[] club2, String[] club3) 
      {
        HashSet<String> set = new HashSet<>();
        HashSet<String> repeats = new HashSet<>();
        HashSet<String> current = new HashSet<>();
        ArrayList<String> alpha = new ArrayList<>();

        for (int i = 0; i < club1.length; i++) 
        {
            if(!set.contains(club1[i]))
            {
                set.add(club1[i]);
            }
        }
        for (int i = 0; i < club2.length; i++) 
        {
            if(!set.contains(club2[i]))
            {
                set.add(club2[i]);
                repeats.add(club2[i]);
            }
            else
            {
                current.add(club2[i]);
            }
        }
        for(String x : current)
        {
            if(!repeats.contains(x))
            {
                alpha.add(x);
            }
        }
        current.clear();
        repeats.clear();
        for (int i = 0; i < club3.length; i++) 
        {
            if(!set.contains(club3[i]))
            {
                set.add(club3[i]);
                repeats.add(club3[i]);
            }
            else
            {
                current.add(club3[i]);
            }
        }

        for(String x : current)
        {
            if(!repeats.contains(x))
            {
                alpha.add(x);
            }
        }
        Set<String> test = new HashSet<>(alpha);
        alpha.clear();
        alpha = new ArrayList<>(test);

        Collections.sort(alpha);
        return alpha.toArray(new String[0]);
      }
   }