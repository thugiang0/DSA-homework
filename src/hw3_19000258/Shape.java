// Ex2 (1/5)

package hw3_19000258;

public abstract class Shape {
	
	protected String name;
	
	protected abstract double getVolume();
	protected abstract double getArea();
	protected abstract double getPerimeter();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
