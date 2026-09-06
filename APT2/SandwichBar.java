import java.util.Arrays;
import java.util.List;
public class SandwichBar {
    public int whichOrder(String[] available, String[] orders)
    {
        List<String> chris = Arrays.asList(available);
        for(int i = 0; i < orders.length; i ++)
        {
            String[] splitter = orders[i].split(" ");
            for(int a = 0; a < splitter.length; a++)
            {
                if(!chris.contains(splitter[a]))
                    a = splitter.length;
                else if (a+1 == splitter.length)
                    return i;
            }
        }
         return -1; 
      }
   }