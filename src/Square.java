
public class Square extends Shape{
//Shape�� ��ӹ޴� SquareŬ������ ����
	int width;
	public Square(int x,int y,int width) {
		super(x,y);
		this.width=width;
	}
//Square constructor���� 
//����Ŭ������ Shape�� variable�� ����ϱ� ���� super(x,y);�� �־���
	public void draw() {
		int x3=x+width;
		int y3=y-width;
		System.out.println("Square "+"("+x+".0, "+y+".0)-("+x3+".0, "+y3+".0)");
	}
//draw()�޼ҵ� ����:Square�� ��ǥ ���
	public double getArea() {
		double area=width*width;
		return area;
	}
	public double getLength() {
		double length=4*width;
		return length;
}
//���̿� �ѷ��� ���� ��ȯ�ϴ� �޼ҵ� override	
	
	
	public void move(double dx, double dy) {
	}
	}
