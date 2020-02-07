package shapes;

public class Volume extends Circle{

	Volume(double radius){
		super(radius);
		this.radius=radius;
		System.out.println("the volume of circle is "+4/3*Math.PI*radius*radius*radius);

	}
	
	
}