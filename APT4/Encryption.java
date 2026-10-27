import java.util.HashMap;

public class Encryption {
       public String encrypt(String message)
       {
        char[] alphabet = new char[26];
        int index = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabet[index++] = ch;
}
           String fin = "";
           HashMap<String,Character> code = new HashMap<>();

           for(int i = 0; i <message.length(); i ++)
           {
                String s = message.substring(i,i+1);
                if(!code.containsKey(s))
                {
                    //if(code.size() > 0)
                        code.put(s,alphabet[code.size()]);
                    //else
                      //  code.put(s,alphabet[code.size()]);

                }
                char c = code.get(s);
                fin = fin + String.valueOf(c);
           }









           return fin; 
       }
   }