package test;

public class Marker {
	String color;
	int price=50;
	String brand="camlin";
	void showdetails(){
		System.out.println( color+ " " +price+ " "+brand);
	}

	public static void main(String[] args) {
		Marker m1=new Marker();
		System.out.println(m1);
		m1.showdetails();
		m1.color="black";
		System.out.println(m1);
		
		Marker m2=new Marker();
		System.out.println(m2);
		m2.showdetails();
		m2.color="red";
		System.out.println(m2);
		
		
	}
	

}
