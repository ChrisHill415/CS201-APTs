import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



public class AlphaLength {
      public ListNode create (String[] words) {
        Set<String> set = new HashSet<>(Arrays.asList(words));

        String[] testing = set.toArray(new String[0]);
        Arrays.sort(testing);
        ListNode first = null;
        ListNode current = first;
        

        boolean fir = true;
        for(String x : testing)
        {
            if(fir)
            {
                first = new ListNode(x.length(),null);
                current = first;
                fir = false;
            }
            else
            {
                current.next = new ListNode(x.length(),null);
                current = current.next;
            }

        }



        return first;
      }
  }