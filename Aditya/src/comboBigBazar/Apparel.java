package comboBigBazar;

public class Apparel {
	String type;
	String color;
	char size;
	Apparel (String type,String color, char size){
		this.type=type;
		this.color=color;
		this.size=size;
	}
	Apparel (String type, char size){
		this.type=type;
		this.color="black";
		this.size=size;
	}
	void showDetails(){
		System.out.println(this.type+ " " + this.color+ " " + this.size);

	}
	public static void main(String[] args) {
		Apparel a=new Apparel("jeans", "black", 'm');
		a.showDetails(); 
		Apparel a1=new Apparel("salwar", 's');
		a1.showDetails();
		
		
	}
}
	




}
