public abstract class Shape implements Drawable,Movable{
	int x;
	int y;
	
//Drawable,Movable �� �ٸ� interface�� ���� �߻� Ŭ���� Shape�� ������	
	public Shape(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
//shape��� constructor�� �����ϰ� �� �� ��ǥ�� parameter�� ����
//shape�����ڿ��� parameter�� ���� ��ǥ�� �ٸ� �޼ҵ忡���� ����ϱ� ���� shapeŬ������ instance������ ������
	
	public void draw() {
	}
//Drawable�������̽��� �޼ҵ带 override
	public void move(double dx,double dy) {
	}
//movable�������̽��� move�޼ҵ带 override	
	public double getArea() {
		return 0;
	}
	public double getLength() {
		return 0;
	}
}
//�������� ���̿� �ѷ��� ��ȯ�ϴ� �޼ҵ带 ������