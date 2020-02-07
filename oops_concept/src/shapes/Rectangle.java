package shapes;

public class Rectangle implements Area {

		double length;
		double breadth;
		
		public Rectangle(double length,double breadth)
		{
			this.length=length;
			this.breadth=breadth;
		}
		public void area()
		{
			System.out.println("the area of rectangle is "+length*breadth);
		}
	
}
