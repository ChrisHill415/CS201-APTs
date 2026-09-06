public class Common {
     public int count (String a, String b) 
     {
        int count = 0;

        for(int i = 0; i <a.length(); i ++)
            {
                String x = a.substring(i,i+1);
                int num = b.indexOf(x);

                if(num != -1) 
                {
                    count++;
                    b = b.substring(0,num)+ b.substring(num+1);
                    
                }
                
            
            }

        return count;
     }
  }