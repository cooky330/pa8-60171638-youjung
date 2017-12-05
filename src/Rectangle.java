public class Rectangle extends Shape{
	int x2;
	int y2;
//shape�� ��ӹ޴� RectangleŬ���� ����	
	public Rectangle(int x,int y,int x2,int y2) {
		super(x,y);
		this.x2=x2;
		this.y2=y2;
	}
//Rectangle�̶�� constructor ����
	public double getArea() {
		double area;
		area=x2*y2;
		return area;
	}
//���̸� ��ȯ�ϴ� �޼ҵ� override
	public double getLength() {
		double length;
		length=(x2+y2)*2;
		return length;
	}
//���̸� ��ȯ�ϴ� �޼ҵ� override
	@Override
	public void draw() {
		int x3=x+x2;
		int y3=y+y2;
		System.out.println("Rectangle "+"("+x+".0, "+y+".0)-("+x3+".0, "+y3+".0)");
	}
//Rectangle�� ����Ʈ �������� �׸�
	public void move(double dx,double dy) {
		x+=dx;
		y+=dy;
	}
//�Ķ���� dx, dy�� �޾� ���� x��ǥ�� y��ǥ�� ���� �̵�
}
