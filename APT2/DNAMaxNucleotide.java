public class DNAMaxNucleotide {
      public String max(String[] strands, String nuc) {
            String max = "";
            int count = 0;
            int current = 0;
            int countSize = 0;

            for(String key : strands)
            {
                  for(int i = 0; i < key.length(); i ++)
                  {
                        if(key.substring(i,i+1).equals(nuc))
                        {
                              current++;
                        }
                  }
                  if(current != 0)
                  {
                  if(current>count)
                  {
                        count = current;
                        countSize = key.length();
                        max = key;
                  }
                  else if (current == count)
                  {
                        if(countSize<key.length())
                        {
                              count = current;
                              countSize = key.length();
                              max = key;
                        }
                  }
             
                  
                  current=0;
            }
            }

            return max;
      }
   }