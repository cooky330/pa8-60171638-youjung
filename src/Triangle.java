
public class Triangle extends Shape{
	int width;
	int bottom;
//Shape�� ��ӹ޴� TriangleŬ���� ����
	
	public Triangle(int x,int y,int bottom,int width) {
		super(x,y);
		this.width=width;
		this.bottom=bottom;
	}
//Triangle constructor����
	public double getArea() {
		double area=bottom*width/2;
		return area;
	}
	public double getLength() {
		double length=3*bottom;
		return length;
	}
//���̿� �ѷ��� ���� ��ȯ�ϴ� �޼ҵ� override	
	public void draw() {
		int x2=x-bottom/2;
		int y2=y-width;
		int x3=x+bottom/2;
		int y3=y-width;
		System.out.println("Triangle "+"("+x+".0, "+y+".0)-("+x2+".0, "+y2+".0)-("+x3+".0, "+y3+".0)");
	}
//Triangle�� ��ǥ�� ��ȯ�ϴ� draw()�޼ҵ� override
	public void move(double dx, double dy) {
	}
	
	

}
