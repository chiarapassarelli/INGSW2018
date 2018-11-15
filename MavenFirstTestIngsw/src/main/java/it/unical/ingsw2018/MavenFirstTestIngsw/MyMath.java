package it.unical.ingsw2018.MavenFirstTestIngsw;

public class MyMath {
	
	/**
	 * 
	 * @param i
	 * @return
	 */
	public int fibonacci( int i) {
		
		if ( i < 0 ) {
			throw new IllegalArgumentException("Invalid fibonacci index "+ i );
		}
		
		if ( i == 1 || i == 0 )
			return 1;
		
		int previous = 1;
		int previousPrevious = 1;
		int current = 0;
		for( int j = 2; j <= i; j++ ) {
			current = previous + previousPrevious;
			previousPrevious = previous;
			previous = current;
		}
		return current;
	}
	
	double distance ( int x1, int y1, int x2, int y2) {
		return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	}
}
