package classObjCon;

public class MainClassObjects {

	public static void main(String[] args) {
		
		ClassTemplate mycar = new ClassTemplate("Toyota", "Camry", "Blue", 25000.50, 4);
		
		mycar.displayDetails();
		/*mycar.mycar("Toyota", "Camry", "Blue", 25000.50, 4);*/
		
	/*	mycar.company = "Toyota";
		mycar.model = "Camry";
		mycar.color = "Blue";
		mycar.cost = 25000.50;
		mycar.wheels = 4;*/ 
		
	}

}
