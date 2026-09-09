public class TrueSpace {
      public long calculateSpace(int[] sizes, int clusterSize) {
        long total = 0;

        for(int i =0; i<sizes.length; i++)
        {
            if(sizes[i] <= clusterSize)
                total += clusterSize;
            else
            {
                total += clusterSize;
                sizes[i] = sizes[i] - clusterSize;
                i--;
            }
        }

        return total;
      }
   }