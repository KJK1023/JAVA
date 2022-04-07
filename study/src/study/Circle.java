package study;

public class Circle {
	int radius;
	String name;
	
	public Circle() {}{
		radius=1; name="";
	}
	public Circle(int radius, String name) {
		this.radius=radius; this.name=name;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		Circle pizza;
		pizza=new Circle(10,"재균피자");
		pizza.radius=10;
		pizza.name="재균피자";
		double area = pizza.getArea();
		System.out.println(pizza.name +"의 면적은"+area);
		
		Circle donut = new Circle();
		donut.radius=2;
		donut.name="재균도넛";
		area=donut.getArea();
		System.out.println(donut.name +"의 면적은"+area);

	}

}