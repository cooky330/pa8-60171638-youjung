public class Rectangle extends Shape{
	int x2;
	int y2;
//shape를 상속받는 Rectangle클래스 생성	
	public Rectangle(int x,int y,int x2,int y2) {
		super(x,y);
		this.x2=x2;
		this.y2=y2;
	}
//Rectangle이라는 constructor 생성
	public double getArea() {
		double area;
		area=x2*y2;
		return area;
	}
//넓이를 반환하는 메소드 override
	public double getLength() {
		double length;
		length=(x2+y2)*2;
		return length;
	}
//길이를 반환하는 메소드 override
	@Override
	public void draw() {
		int x3=x+x2;
		int y3=y+y2;
		System.out.println("Rectangle "+"("+x+".0, "+y+".0)-("+x3+".0, "+y3+".0)");
	}
//Rectangle을 프린트 형식으로 그림
	public void move(double dx,double dy) {
		x+=dx;
		y+=dy;
	}
//파라미터 dx, dy를 받아 각각 x좌표와 y좌표에 더해 이동
}
