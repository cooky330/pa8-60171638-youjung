
public class Bear extends Shape{
	int radius;
//Shape�� ����Ŭ���� BearŬ������ ����
	public Bear(int x,int y,int radius) {
		super(x,y);
		this.radius=radius;
	}
//Bear constructor ����
	
	public void move(double dx, double dy) {
		
	}	
	public void draw() {
		int x3=x-radius;
		int y3=y+radius;
		int r1=radius/2;
		System.out.println("Rectangle "+"("+x3+".0, "+x3+".0)-("+y3+".0, "+y3+".0)");
		System.out.println("Circle center("+x3+".0, "+x3+".0)-radius("+r1+".0)");
		System.out.println("Circle center("+y3+".0, "+x3+".0)-radius("+r1+".0)");
	}
//Bear�� ��ǥ�� ����ϴ� draw()�޼ҵ� ����	
}

	


