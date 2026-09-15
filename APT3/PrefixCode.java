
public class PrefixCode 
{ 
    public String isOne(String[] words) 
      {
        String test = "";
        for(int i = 0; i < words.length; i ++)
        {
            for(int a = 0; a < words.length; a ++)
            {
                if(!words[a].equals(words[i]) && words[i].length() < words[a].length())
                {
                    if(words[i].equals(words[a].substring(0,words[i].length())))
                        return "No, " + Integer.toString(i);
                }
            }
            
            
        }
//nested loops and substring

        return "Yes";
      }
}