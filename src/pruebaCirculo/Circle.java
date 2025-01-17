package pruebaCirculo;

public class Circle implements IFiguraGeometrica {
	/**
	 * 
	 */
	private static final double CERO = 0.0;
	private int x;
	private int y;
	private double radio;

	
	// constructor
	public Circle(int valorX, int valorY, double valorRadio) {
		x = valorX;
		y = valorY;
		setRadio(valorRadio);
	}

	public double getDiametro() {
		return 2 * radio;
	}

	public double getCircunferencia() {
		return Math.PI * getDiametro();
	}

	public double getArea() {
		return Math.PI * radio * radio;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Centro = [" + x + ", " + y + "]; Radio = " + radio;
	}


	/**
	 * @param x2
	 */
	
		
	}
