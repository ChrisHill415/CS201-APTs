public class SoccerLeagues {
     public int[] points(String[] matches) {
        int[] point = new int[matches.length];

        for(int i = 0; i < matches.length; i ++)
        {
            for(int a = 0; a < matches.length; a++)
            {
                String s = matches[i].substring(a,a+1);
                    if(s.equals("W"))
                    {
                        point[i] += 3;
                    }
                    else if(s.equals("D"))
                    {
                        point[i] += 1;
                        point[a] += 1;

                    }
                    else if(s.equals("L"))
                    {
                        point[a] += 3;
                    }
                
            }
        }
        return point;

     }

    }
 