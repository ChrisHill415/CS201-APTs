  public class AccessLevel {
     public String canAccess(int[] rights, int minPermission) {
        String test = "";
         for (int i = 0; i < rights.length; i++) {
            
             if(minPermission <= rights[i])
                test = test +  "A";
            else 
                test = test + "D";
             // fill in code here
         }
         return test; 
     }
  }
