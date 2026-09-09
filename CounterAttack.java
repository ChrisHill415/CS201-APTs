 public class CounterAttack {
     public int[] analyze(String str, String[] words) {

        String[] exist = str.split(" "); 
        int[] chris = new int[words.length];

        for (int i = 0; i < words.length; i++) 
        {
            for (int a = 0; a < exist.length; a++) 
            {
                if(exist[a].equals(words[i]))
                {
                    chris[i] ++;
                }
            }
        }

         return chris;
     }
 }
