  public class AccessLevel {
     public String canAccess(int[] rights, int minPermission) {
        String test = "";
         for (int i = 0; i < rights.length; i++) {
            
             if(minPermission <= rights[i])
                test = test +  "A";
            else 
                test = test + "D";
<<<<<<< HEAD
=======
             // fill in code here
>>>>>>> c7bcfb6bb74840f509d4ce6c499a7963a450c743
         }
         return test; 
     }
  }
