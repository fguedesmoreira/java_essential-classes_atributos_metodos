package entities;

public class Rectangle {

	public double width;
	public double heigth;

	public double area() {
		return width * heigth;
	}

	public double perimeter() {
		return width + width + heigth + heigth;
	}

	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2.0) + Math.pow(heigth, 2.0));
	}

}