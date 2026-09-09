
 import java.util.ArrayList;

 
 public class StringCuts {
     public String[] filter(String[] list, int minLength) {

        int size = 0;
        ArrayList<String> chris = new ArrayList<>();
        
        for(int i = 0; i < list.length; i++)
        {
            if(!chris.contains(list[i])  && list[i].length() >= minLength)
            {
                chris.add(list[i]);
            }
        }

        String[] fin = new String[chris.size()];
        
        for(int i = 0; i < fin.length; i++)
        {
            if(chris.get(i).length() >= minLength)
            {
                fin[i] = chris.get(i);
            }
        }

         return fin;
     }
 }