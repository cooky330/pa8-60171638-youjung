public abstract class Shape implements Drawable,Movable{
	int x;
	int y;
	
//Drawable,Movable 둘 다를 interface로 갖는 추상 클래스 Shape를 생성함	
	public Shape(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
//shape라는 constructor를 생성하고 이 때 좌표를 parameter로 받음
//shape생성자에서 parameter로 받은 좌표를 다른 메소드에서도 사용하기 위해 shape클래스에 instance변수로 생성함
	
	public void draw() {
	}
//Drawable인터페이스의 메소드를 override
	public void move(double dx,double dy) {
	}
//movable인터페이스의 move메소드를 override	
	public double getArea() {
		return 0;
	}
	public double getLength() {
		return 0;
	}
}
//도형들의 넓이와 둘레를 반환하는 메소드를 생성함