package shapes;
//import java.util.*;
import java.math.*;
public class Circle implements Area{
	double radius;
	
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public void area()
	{
		System.out.println("the area of circle is "+Math.PI*radius*radius);
	}
	
}
