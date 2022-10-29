// Ex1 (1/2)

package hw3_19000258;

public class Complex {
	private float real; 
	private float image; 
	public Complex(float r, float i) {
		this.real = r;
		this.image = i;
	}
	
	public Complex() {
		
	}
	
	public Complex add(Complex c) {
		Complex sum = new Complex();
		sum.real = real + c.real;
		sum.image = image + c.image;
		return sum;
	}
	
	public Complex minus(Complex c) {
		Complex dif = new Complex();
		dif.real = real - c.real;
		dif.image = image - c.image;
		return dif;
	}
	
	public Complex time(Complex c) {
		Complex multi = new Complex();
		multi.real = real*c.real - image*c.image;
		multi.image = real*c.image - image*c.real;
		return multi;
	}
	
	public float realpart() {
		return real;
	}
	
	public float imagepart() {
		return image;
	}
	
	@Override
	public String toString() {
		if (image >= 0)
			return real + " + " + image + "i";
		else 
			return real + " - " + Math.abs(image) + "i";
	}
}
