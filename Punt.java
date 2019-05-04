package punts;

public class Punt {
	private int[] coord = new int[2];

	public Punt(int x, int y) {
		try {
			if (x >= 0 && y >= 0) {
				coord[0] = x;
				coord[1] = y;				
			} else {
				throw new IllegalArgumentException("Numeros negativos");
			}
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
	}

	public Punt() {
		this(0, 0);
	}

	public int getX() {
		return coord[0];
	}

	public int getY() {
		return coord[1];
	}

	public void setX(int x) {
		try {
			if (x >= 0) {
				coord[0] = x;				
			} else {
				throw new IllegalArgumentException("Numeros negativos");
			}
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
	}

	public void setY(int y) {
		try {
			if (y >= 0) {
				coord[1] = y;				
			} else {
				throw new IllegalArgumentException("Numeros negativos");
			}
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
	}

	public void suma(Punt p) {
		try {
			if (p.getX() >= 0 && p.getY() >= 0) {
				coord[0] += p.getX();
				coord[1] += p.getY();			
			} else {
				throw new IllegalArgumentException("Numeros negativos");
			}
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
	}
}