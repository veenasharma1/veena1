package Org.constructor.markereg;

public class Marker {
	String color;
	int price=20;
	String brand="camlin";
	Marker(String color)
	{
	this.color=color;
	System.out.println( color+ " " +price+ " "+brand);
	
	
	}
	public static void main(String[] args) {
		Marker m=new Marker("black");
		System.out.println(m);
	}

}
