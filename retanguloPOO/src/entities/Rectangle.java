package entities;

public class Rectangle {
	
public double width;
public double height;

public double area() {
	
	double area = width * height;
	return area;
};


public double perimeter() {
	
	double perimeter = (width + height) * 2;
	return perimeter;
};

public double diagonal() {
	
	double diagonal = Math.sqrt(Math.pow(width, 2.0) + Math.pow(height, 2.0)); 
	return diagonal;
};

public void showResult() {
System.out.println("AREA: = "+ area());
System.out.println("PERIMETER: = "+ perimeter());
System.out.println("DIAGONAL: = "+ diagonal());
};

}
