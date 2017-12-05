public class Circle extends Shape{
	int r;

	public Circle(int x,int y,int r) {
		super(x,y);
		this.r=r;
	}
	public double getArea() {
		double area;
		area=r*r*Math.PI;
		return area;
	}
	public double getLength() {
		double length;
		length=2*Math.PI*r;
		return length;
	}
	
	public void draw() {
		System.out.println("Circle center("+x+".0, "+y+".0)-radius("+r+".0)");
		
	}

//여기까지는 다른 도형 클래스(Shape의 하위클래스)의 내용과 비슷함
	
	public void move(double dx, double dy) {
			x+=dx;
			y+=dy;
		}
		
//Circle의 좌표를 이동시키는 move메소드를 생성
	
}

