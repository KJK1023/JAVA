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
		pizza=new Circle(10,"�������");
		pizza.radius=10;
		pizza.name="�������";
		double area = pizza.getArea();
		System.out.println(pizza.name +"�� ������"+area);
		
		Circle donut = new Circle();
		donut.radius=2;
		donut.name="��յ���";
		area=donut.getArea();
		System.out.println(donut.name +"�� ������"+area);

	}

}