
public class Square extends Shape{
//Shape를 상속받는 Square클래스를 생성
	int width;
	public Square(int x,int y,int width) {
		super(x,y);
		this.width=width;
	}
//Square constructor생성 
//상위클래스인 Shape의 variable을 사용하기 위해 super(x,y);를 넣어줌
	public void draw() {
		int x3=x+width;
		int y3=y-width;
		System.out.println("Square "+"("+x+".0, "+y+".0)-("+x3+".0, "+y3+".0)");
	}
//draw()메소드 생성:Square의 좌표 출력
	public double getArea() {
		double area=width*width;
		return area;
	}
	public double getLength() {
		double length=4*width;
		return length;
}
//넓이와 둘레를 각각 반환하는 메소드 override	
	
	
	public void move(double dx, double dy) {
	}
	}
