

// check if in a circle and the dot is outside. Exit circle and add 1 to count
// check if dot is in circle.

 public class CirclesCountry {
    public int leastBorders(int[] x, int[] y, int[] r, 
                            int x1, int y1, int x2, int y2) {
        int crosses = 0;
	    for(int k=0; k < x.length; k+= 1){
		    if (isInside(x1,y1,x[k],y[k],r[k]) != isInside(x2,y2,x[k],y[k],r[k])) {
			    crosses += 1;
		    }
            
	}
	return crosses;

    }
    public boolean isInside(int x, int y, int cx, int cy, int r){
		double distSquared = ((double)x-(double)cx)*((double)x-(double)cx) + ((double)y-(double)cy)*((double)y-(double)cy);
		double radSquared = (double)r*(double)r;
           return distSquared <= radSquared;
	}

 }



