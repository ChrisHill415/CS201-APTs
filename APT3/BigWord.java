  import java.util.ArrayList;
  import java.util.Collections;

  public class BigWord {
      public String most(String[] sentences) 
      {
        ArrayList<Integer> count = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();


        for(int i = 0; i < sentences.length; i++)
        {
          String[] chris = sentences[i].split(" ");
          for (int a = 0; a < chris.length; a++) 
          {
              int test = words.indexOf(chris[a].toLowerCase());
              if(test == -1)
              {
                words.add(chris[a].toLowerCase());
                count.add(1);
              }
              else
              {
                count.set(test, count.get(test)+1);
              }
                
          }
        }



        return words.get(count.indexOf(Collections.max(count)));
      }
  }