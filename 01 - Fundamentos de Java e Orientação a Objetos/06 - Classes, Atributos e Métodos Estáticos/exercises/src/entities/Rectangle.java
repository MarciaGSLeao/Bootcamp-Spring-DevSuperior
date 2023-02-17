package entities;

public class Rectangle {
	
	private double width;
	private double height;
	
	public Rectangle() {
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimete() {
		return (2 * width) + (2 * height);
	}
	
	public double getDiagonal() {
		return Math.sqrt((width * width)+(height * height));
	}
}
