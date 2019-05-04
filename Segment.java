package segment;

import punts.Punt;

public class Segment {
	private int x1, y1;
	private int x2, y2;
	
	public Segment(Punt p1, Punt p2) {
		this.x1 = p1.getX();
		this.y1 = p1.getY();
		this.x2 = p2.getX();
		this.y2 = p2.getY();
	}
	
	public Segment() {
		this(new Punt(), new Punt());
	}
	
	public double getLongitud() {
		return Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
	}
}
