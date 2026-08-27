

// check if in a circle and the dot is outside. Exit circle and add 1 to count
// check if dot is in circle.

 public class CirclesCountry {
    public int leastBorders(int[] x, int[] y, int[] r, 
                            int x1, int y1, int x2, int y2) {
        


        return 0;  
    }
    public boolean isInside(int xpos, int ypos, int x, int y, int r) {
        double dist = (x-xpos) * (x-xpos) + (y-ypos)*(y-ypos);
        return dist < (r*r);

    }
 }
