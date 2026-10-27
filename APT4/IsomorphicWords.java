import java.util.HashMap;

public class IsomorphicWords {
      public int countPairs(String[] words) 
      {
        int count = 0;


        HashMap<String,String> chris = new HashMap<>();

            String s = "";
            String og = "";

        boolean yay = true;

        for (int i = 0; i < words.length; i++) 
        {
            
            for(int a = i+1; a < words.length; a ++)
            {
                
                    for(int b = 0; b < words[a].length(); b++)
                    {
                        if(i < words.length)
                            og = words[i].substring(b,b+1);
                        
                        if(a < words.length)
                             s = words[a].substring(b,b+1);
                        
                        if(!chris.containsKey(og) && !chris.containsValue(s))
                        {
                            chris.put(og, s);
                            yay = true;
                        }
                        else if(!chris.getOrDefault(og,"").equals(s))
                        {
                            yay = false;
                            b = words[a].length();
                        }
                        
                        /* else if(chris.containsKey(og))
                        {
                            yay = false;
                            b = words[a].length();
                        } */
                    }
                    if(yay)
                    {
                        count++;
                        yay = false;
                    }
                    chris.clear();
            }
            
        }

        return count;
      }
   }