

 public class Totality {
     public int sum(int[] a, String stype) {
        int total = 0;
         if(stype.equals("odd"))
         {
            for(int i = 1; i < a.length; i = i+2)
            {
                total = total + a[i];
            }
         }
         else if(stype.equals("even"))
         {
            for(int i = 0; i < a.length; i=i+2)
            {
                total = total + a[i];
            }
         }
        else if(stype.equals("all"))
        {
            for(int i = 0; i < a.length; i++)
            {
                total = total + a[i];
            }
        }


         return total;
     }
 }