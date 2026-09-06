public class TxMsg {
      public String getMessage(String original) {
        String mess = "";
        String vowel = "aeiou";
        Boolean first = true;
        
        Boolean hasCon = false;
        Boolean conBefore = false;
        String[] splitter = original.split(" ");




        for(String x : splitter)
        {
            String word = "";
            
            for(int i = 0; i <x.length(); i ++)
            {
                if(vowel.contains(x.substring(i,i+1)))
                {
                    
                    conBefore = false;
                }
                else
                {
                    hasCon = true;
                    if(!conBefore)
                        word += x.substring(i,i+1);
                    conBefore = true;
                }

            }
            if(first)
            {
                if(!hasCon)
                    mess += x;
                else
                    mess += word;
            }
            else if(!hasCon)
                mess += " " + x;
            else
                mess += " " + word;

            conBefore = false;
            hasCon = false;
            first = false;
        }

        return mess;
      }
   }