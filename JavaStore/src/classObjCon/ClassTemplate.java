package classObjCon;

public class ClassTemplate {
String company;
String model;
String color;
double cost;
int wheels;
/*public void ClassTemplate(String company, String model, String color, double cost, int wheels) {*/
public ClassTemplate(String company, String model, String color, double cost, int wheels) {
	this.company = company;
	this.model = model;
	this.color = color;
	this.cost = cost;
	this.wheels = wheels;
	
}

public void displayDetails() {
	System.out.println("company:" +company);
	System.out.println("model:" +model);
	System.out.println("color:" +color);
	System.out.println("cost:" +cost);
	System.out.println("wheels:" +wheels);
	
    
}

	
}
